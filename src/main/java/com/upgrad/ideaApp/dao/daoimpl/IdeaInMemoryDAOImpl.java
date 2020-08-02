package com.upgrad.ideaApp.dao.daoimpl;

import com.upgrad.ideaApp.dao.IdeaDAO;
import com.upgrad.ideaApp.entites.IdeaEntity;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import org.springframework.stereotype.Repository;


/**
 * This will have the implementation details for the inmemory data storage
 */
@Repository
public class IdeaInMemoryDAOImpl implements IdeaDAO {

  //Create a kind of map which stores Idea
  //Data storage layer
  private static final Map<Long, IdeaEntity> IDEA_STORE = new ConcurrentHashMap<>();

  /**
   *
   * @param ideaEntity
   */
  @Override
  public void save(IdeaEntity ideaEntity) {

    IDEA_STORE.put(ideaEntity.getId(),ideaEntity);

  }
  /**
   *
   *
   * int  - Integer
   * long - Long
   * char - Character
   * boolean - Boolean
   */

  /**
   *
   * @param id
   * @return
   */
  @Override
  public IdeaEntity find(long id) {
    return IDEA_STORE.get(id); // 1 entry
  }

  /**
   *
   * @return  get all the ideas stored
   */
  @Override
  public List<IdeaEntity> findAll() {  // all the values
    return IDEA_STORE.values().stream().collect(Collectors.toList());
  }

  /**
   *
   * @param ideaEntity
   */
  @Override
  public void update(IdeaEntity ideaEntity) {
    IDEA_STORE.put(ideaEntity.getId(),ideaEntity);
  }

  /**
   *
   * @param id
   */
  @Override
  public void delete(long id) {
     IDEA_STORE.remove(id);
  }
}

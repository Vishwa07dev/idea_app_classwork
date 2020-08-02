package com.upgrad.ideaApp.dao;

import com.upgrad.ideaApp.entites.IdeaEntity;
import java.util.List;


/**
 * This layer talks about the contracts of IdeaDAO
 */
public interface IdeaDAO {

  /**
   *
   * @param ideaEntity
   */
  public void save(IdeaEntity ideaEntity);

  /**
   *
   * @param id
   * @return
   */
  public IdeaEntity find(long id);

  /**
   *
   * @return
   */
  public List<IdeaEntity> findAll();

  /**
   *
   * @param ideaEntity
   */
  public void update(IdeaEntity ideaEntity);

  /**
   *
   * @param id
   */
  public void delete(long id);



}

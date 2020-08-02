package com.upgrad.ideaApp.service.serviceimpl;

import com.upgrad.ideaApp.dao.IdeaDAO;
import com.upgrad.ideaApp.dto.IdeaDTO;
import com.upgrad.ideaApp.service.IdeaService;
import com.upgrad.ideaApp.util.PojoConvertor;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class IdeaServiceImpl implements IdeaService {

  @Autowired
  private IdeaDAO ideaDAO ;

  @Override
  public void saveIdea(IdeaDTO ideaDTO) {

    // convert IdeaDTO  to ideaEntity
    ideaDAO.save(PojoConvertor.convertDTOToEntity(ideaDTO));

  }

  @Override
  public void updateIdea(IdeaDTO ideaDTO) {
    // convert IdeaDTO  to ideaEntity
    ideaDAO.save(PojoConvertor.convertDTOToEntity(ideaDTO));

  }

  @Override
  public List<IdeaDTO> getAllIdeas() {

    // convert  ideaEntity to IdeaDTO
    return ideaDAO.findAll().stream().map(ideaEntity -> PojoConvertor.convertEntityToDTO(ideaEntity))
        .collect(Collectors.toList());
  }

  @Override
  public IdeaDTO getIdea(long id) {

    // convert  ideaEntity to IdeaDTO
    return PojoConvertor.convertEntityToDTO(ideaDAO.find(id));
  }

  @Override
  public void deleteIdea(long id) {

    ideaDAO.delete(id);

  }
}

package com.upgrad.ideaApp.service;

import com.upgrad.ideaApp.dto.IdeaDTO;
import java.util.List;


/**
 * Contract for taking IdeaDTO and conveting into IdeaEntity and it's manipulations
 */
public interface IdeaService {

  public void saveIdea(IdeaDTO ideaDTO);

  public void updateIdea(IdeaDTO ideaDTO);

  public List<IdeaDTO> getAllIdeas();

  public IdeaDTO getIdea(long id);

  public void deleteIdea(long id);


}

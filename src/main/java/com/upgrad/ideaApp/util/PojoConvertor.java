package com.upgrad.ideaApp.util;

import com.upgrad.ideaApp.dto.IdeaDTO;
import com.upgrad.ideaApp.entites.IdeaEntity;


// Static and singleton
public class PojoConvertor {

  private PojoConvertor(){

  }


  public static IdeaDTO convertEntityToDTO(IdeaEntity ideaEntity){
    IdeaDTO ideaDTO = new IdeaDTO() ;

    ideaDTO.setId(ideaEntity.getId());
    ideaDTO.setIdeaDescription(ideaEntity.getIdeaDescription());
    ideaDTO.setAuthorName(ideaEntity.getAuthorName());
    ideaDTO.setIdeaName(ideaEntity.getIdeaName());

    return ideaDTO ;

  }


  public static IdeaEntity convertDTOToEntity(IdeaDTO ideaDTO){
    IdeaEntity ideaEntity = new IdeaEntity() ;

    ideaEntity.setId(ideaDTO.getId());
    ideaEntity.setIdeaDescription(ideaDTO.getIdeaDescription());
    ideaEntity.setAuthorName(ideaDTO.getAuthorName());
    ideaEntity.setIdeaName(ideaDTO.getIdeaName());

    return ideaEntity;

  }
}

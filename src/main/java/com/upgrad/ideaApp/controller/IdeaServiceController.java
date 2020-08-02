package com.upgrad.ideaApp.controller;

import com.upgrad.ideaApp.dto.IdeaDTO;
import com.upgrad.ideaApp.service.IdeaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/ideas")
public class IdeaServiceController {

  @Autowired
  private IdeaService ideaService ;

  //Create a resource
  @PostMapping
  public ResponseEntity<Object> createIdea(@RequestBody IdeaDTO ideaDTO){ // coverts json into the object

    ideaService.saveIdea(ideaDTO); // this will save the idea

    return new ResponseEntity<>(ideaDTO, HttpStatus.CREATED);  // return json to the client
  }

  /**
   *
   * @return  returns all the resources created.
   */
  @GetMapping
  public ResponseEntity<Object> getAllIdeas(){
    return new ResponseEntity<>(ideaService.getAllIdeas(), HttpStatus.OK);
  }
}

package com.upgrad.ideaApp.entites;

import java.util.Objects;


/**
 * This is our central resource in ideas app
 */
public class IdeaEntity {

  private long id ;
  private String ideaName ;
  private String authorName ;
  private String ideaDescription ;

  public long getId() {
    return id;
  }

  public String getIdeaName() {
    return ideaName;
  }

  public String getAuthorName() {
    return authorName;
  }

  public String getIdeaDescription() {
    return ideaDescription;
  }

  public void setId(long id) {
    this.id = id;
  }

  public void setIdeaName(String ideaName) {
    this.ideaName = ideaName;
  }

  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }

  public void setIdeaDescription(String ideaDescription) {
    this.ideaDescription = ideaDescription;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdeaEntity that = (IdeaEntity) o;
    return id == that.id && Objects.equals(ideaName, that.ideaName) && Objects.equals(authorName, that.authorName)
        && Objects.equals(ideaDescription, that.ideaDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ideaName, authorName, ideaDescription);
  }

  @Override
  public String toString() {
    return "IdeaEntity{" + "id=" + id + ", ideaName='" + ideaName + '\'' + ", authorName='" + authorName + '\''
        + ", ideaDescription='" + ideaDescription + '\'' + '}';
  }
}

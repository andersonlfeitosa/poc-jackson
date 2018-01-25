package com.andersonlfeitosa.jackson;

public class MyDto extends GenericDto {
  
  private static final long serialVersionUID = 1L;
  
  private String myProperty;

  public String getMyProperty() {
    return myProperty;
  }

  public void setMyProperty(String myProperty) {
    this.myProperty = myProperty;
  }
  
}

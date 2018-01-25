package com.andersonlfeitosa.jackson;

import java.io.Serializable;

public class GenericDto implements Serializable {
  
  private static final long serialVersionUID = 1L;
  
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String nome) {
    this.name = nome;
  }
  
}

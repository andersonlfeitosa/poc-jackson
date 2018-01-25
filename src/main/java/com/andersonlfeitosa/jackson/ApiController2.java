package com.andersonlfeitosa.jackson;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Endpoint responsável por exiber mensagem. 
 * 
 * @author Anderson Lobo Feitosa - andersonlf@gmail.com
 * @since 2017-12-11
 * @version 1.0.0
 */
@RestController
public class ApiController2 {

  /**
   * Expõe método HTTP GET para exibição de mensagem.
   *  
   * @return A mensagem.
   */
  @RequestMapping(path = "/api2", method = RequestMethod.POST)
  public String sayHello(@RequestBody(required = true) MyDto dto) {
        
    StringBuilder sb = new StringBuilder();
    sb.append(dto.getName());
    sb.append("\n");
    sb.append(dto.getMyProperty());
    sb.append("\n");
    
    return sb.toString();
  }

}

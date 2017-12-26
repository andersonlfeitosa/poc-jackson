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
public class ApiController {

  /**
   * Expõe método HTTP GET para exibição de mensagem.
   *  
   * @return A mensagem.
   */
  @RequestMapping(path = "/", method = RequestMethod.POST)
  public String sayHello(@RequestBody(required = true) Zoo zoo) {
    
    Animal a = zoo.animal;
    
    StringBuilder sb = new StringBuilder();
    sb.append(a.name);
    sb.append("\n");
    sb.append(((Dog)a).barkVolume);
    
    return sb.toString();
  }

}

package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller // Annotation(@xxx : 특정기능실행하도록 정보제공)
public class AudioController {
  @RequestMapping("/audio") // "" 안에 주소!
  public String home() { 
   
    return "home";
  }

}

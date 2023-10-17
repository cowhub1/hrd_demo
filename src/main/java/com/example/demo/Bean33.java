package com.example.demo;

import org.springframework.stereotype.Component;   //Component 대신 Service도 가능

@Component //나는 빈으로 등록될꺼야!!//@Component 대신 @Service도 가능
public class Bean33 {
  public String run(){
    return "Bean 33";
  }
  
}

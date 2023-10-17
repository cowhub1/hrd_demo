package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@Controller // Annotation(@xxx : 특정기능실행하도록 정보제공)
@Slf4j // Log 사용 : Lombok 기능 활용
public class HomeController {
  @RequestMapping("/") // "" 안에 주소!
  public String home() { // method(기능)
    log.debug("debug"); // terminal에서 확인가능 but log레벨에 따라 안나옴 수정 ->/application.properties에
                        // logging.level.com.example.demo=trace 넣어서 로그레벨 낮춰주기!!

    log.warn("warn"); // terminal에서 확인가능
    log.error("error");
    System.out.println("print");
    return "home"; // home.html 작성해야함 >>resources>>templates아래에
  }

  @RequestMapping("/home2")
  public String home2() {// method(기능), string은 "문자열"
    return "home"; // 응답결과가 html
  }

  @RequestMapping({ "/home3", "/home4" }) // @RequestMapping이 붙은 메서드는 해당 어노테이션의 속성에 지정된 경로와 HTTP 메서드에 대한 요청을 처리.경로는
                                          // URI사용하여 지정. 배열을 제공하면 여러 경로를 한 번에 지정
  @ResponseBody // JSON 형식의 API 응답시 데이터를 직접 반환하도록 함.
  public List<String> home3() {// method(기능), List오류 : 자바는 형식을 일치시키면서 넣어줘야함 그래서 generic해줘야함 List<String> 리스트를
                               // 스트링형태로
    List<String> list = new ArrayList<>();
    list.add("A");
    list.add("B");
    list.add("C");

    return list; // 응답결과가 JSON[]형태로 출력
    // 자바에서는 중괄호=MAP /자바스크립트 중괄호=객체(Obj)
  }
}

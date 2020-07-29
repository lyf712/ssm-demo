package com.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

  @RequestMapping("/check1")
  @ResponseBody
  public String check(){
    return "yes";
  }

  @RequestMapping("/check2")
  public String check2(){
    return "test";
  }

}

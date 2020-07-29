package com.demo.Controller;

import com.demo.service.Connection;
import com.demo.common.Result;
import org.apache.http.HttpResponse;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
@RequestMapping("/demo/api")
public class LoginController {

  @RequestMapping(value = "loginCheck",method = RequestMethod.POST)
  @ResponseBody
  @CrossOrigin
  public Result testCheck(){
    Result result =new Result();
    result.setMessage("登录成功！");
    return result;
  }

//  @ResponseBody
//  @RequestMapping(value = "login/{id}/{password}",method = RequestMethod.POST)
//  @CrossOrigin
//  public boolean Check(@PathVariable("id") String Id,
//                       @PathVariable("password") String Password){
//
//   System.out.println(Id+Password);
//   return true;
//  }

  @ResponseBody
  @RequestMapping(value = "login",method = RequestMethod.POST)
  @CrossOrigin
  public boolean Check( String id,
                     String password) throws IOException {

    System.out.println(id+password);

    String password3=null;
   password3=Connection.checklogin(id);

    if(password.equals(password3)){
      System.out.println(password3);
      return true;
    }

    else{
      System.out.println(password3);
      return false;
    }

  }


}

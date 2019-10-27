package com.ts.demo.controller;

import com.ts.demo.service.TestService;
import com.ts.demo.websocket.WebSocketServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.socket.WebSocketSession;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;
import java.io.IOException;
import java.util.Enumeration;

@Controller
public class TestController {


    @Autowired
    TestService testService;
    @Autowired
    WebSocketServer webSocketServer;



    @RequestMapping("/test")
    public String testMethod(Model model, HttpServletRequest request){
        int s = 0;
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()){
            System.out.println(headerNames.nextElement());
        }
        System.out.println(testService.t());
        model.addAttribute("user",555);
        return "test2.html";
    }

    @RequestMapping("/test6")
    public String testMethod2(){
        System.out.println("888888");
       // System.out.println(id);
        return "hhhh.html";
    }

    @RequestMapping("/websocket")
    public void socket(Session session) {

        //webSocketServer.onOpen(session,"1");
//        for (int i = 0; i < 5; i++) {
//            try {
//                webSocketServer.sendMessage(""+i);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

    }

//    @RequestMapping("/test6/{id}")
//    public String testMethod2(@PathVariable("id") String id){
//        System.out.println("888888");
//        System.out.println(id);
//        return "hhhh.html";
//    }

}

package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@Controller
public class IV_ReturnValueController {

    /**
     * 1.返回值String为跳转页面路径（逻辑视图）
     * 2.在处理请求的方法参数中直接定义原生的request和response, 原生的会话对象HttpSession即可
     */
    @RequestMapping("/testStr.do")
    public String testString(HttpServletRequest request, HttpServletResponse response, HttpSession session){
        System.out.println("返回值为String类型...");
        // 在request里放置数据
        request.setAttribute("msg","hello ok");
        //在响应头里添加数据
        response.addHeader("testHead","hello head");
        System.out.println("SessionId:"+session.getId());
        //直接返回将要挑战的页面地址（逻辑视图名）
        return "ok";
    }

    /**
     * 方法的返回值为void
     * 通过方法参数中response响应客户端，或使用原生请求转发和重定向来实现页面跳转
     */
    @RequestMapping("/testVoid.do")
    public void testVoid(HttpServletRequest request,HttpServletResponse response){
        //在响应头里添加数据
        response.addHeader("TestHead","Hello Head");
    }
}

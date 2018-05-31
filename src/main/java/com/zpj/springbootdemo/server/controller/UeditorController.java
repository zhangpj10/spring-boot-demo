package com.zpj.springbootdemo.server.controller;

import com.baidu.ueditor.ActionEnter;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

/**
 * 用于处理关于ueditor插件相关的请求
 * @author Guoqing
 *
 */
@RestController
@CrossOrigin
@RequestMapping("/sys/ueditor")
public class UeditorController {

    @RequestMapping(value = "/exec")
    @ResponseBody
    public String exec(HttpServletRequest request) throws UnsupportedEncodingException {
        request.setCharacterEncoding("utf-8");
        String rootPath = request.getRealPath("/");
        System.out.println("根路径："+rootPath);
        return new ActionEnter( request, rootPath).exec();
    }
}
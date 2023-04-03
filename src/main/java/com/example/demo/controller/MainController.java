package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

import com.example.demo.vo.DemoVo;

import com.example.demo.service.TestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @RequestMapping("/home")
    public String home(){
        return "home";
    }
    
    @Autowired
    TestService testService;
    
    @RequestMapping(value = "/test")
    public ModelAndView test() throws Exception{
    	
        ModelAndView modelAndView = new ModelAndView();
        
        List<DemoVo> demoList = testService.selectTest();
        ArrayList<String>  descList = new ArrayList<String> ();
        ArrayList<Integer>  pknumList = new ArrayList<Integer> ();
        for (int i = 0; i < demoList.size(); i++) {
        	pknumList.add(demoList.get(i).getPk_num());
        	descList.add(demoList.get(i).getTest_desc());
        }
        System.out.println(pknumList);
        System.out.println(descList);
        modelAndView.setViewName("test");
        modelAndView.addObject("response", descList);
        return modelAndView;
    }

    

}

package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.vo.SampleVo;

@RequestMapping("/sample")
@RestController
public class SampleController {
	
	@GetMapping("/eat")
    public List<SampleVo> eatSomething() {
        return null;
    }
	
    @GetMapping("/sleep")
    public List<SampleVo> sleeping() {
        return null;
    }
	

}

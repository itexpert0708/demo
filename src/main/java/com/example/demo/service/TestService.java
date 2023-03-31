package com.example.demo.service;

import com.example.demo.mapper.DemoMapper;
import com.example.demo.vo.DemoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TestService {
	@Autowired
	public DemoMapper mapper; 
	
	public List<DemoVo> selectTest() {
        return mapper.selectTest();
    }
}

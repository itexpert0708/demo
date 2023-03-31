package com.example.demo.mapper;

import java.util.List;
import com.example.demo.vo.DemoVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface DemoMapper {
	List<DemoVo> selectTest();
}

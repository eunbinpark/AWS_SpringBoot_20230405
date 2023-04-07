package com.web.study.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.study.dto.DataResponseDto;
import com.web.study.dto.ErrorResponseDto;
import com.web.study.dto.ResponseDto;

@RestController // 데이터를 응답하는 용도
//@Controller // 뷰를 리턴하는 용도
public class BasicController {
	
//	@ResponseBody	// 	Controller사용할때 붙여줘야 함 이걸 붙여줘야 데이터를 응답할수 있음
//						controller혼자 쓰면 ViewResolver로 전달 돼서 오류남
	@GetMapping("/view/test")
	// 응답은 스트링일때만 텍스트로, 나머지경우는 제이슨으로 넘어감
	public ResponseEntity<ResponseDto> view() {
		
		List<String> strList = new ArrayList<>();
		strList.add("a"); 
		strList.add("b");
		strList.add("c");
		strList.add("d");
		strList.add("e");
		
		if(strList.contains("e")) {
			try {
				throw new RuntimeException("오류났어!");
			} catch (Exception e) {
				return ResponseEntity.internalServerError().body(ErrorResponseDto.of(HttpStatus.BAD_REQUEST, e));
			}
		}
		
		return ResponseEntity.ok().body(DataResponseDto.of(strList));
	}

}

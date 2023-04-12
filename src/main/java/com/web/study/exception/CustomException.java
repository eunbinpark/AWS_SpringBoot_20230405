package com.web.study.exception;

import java.util.Map;

import org.apache.ibatis.javassist.SerialVersionUID;

import lombok.Getter;

@Getter
public class CustomException extends RuntimeException {

	private static final long serialVersionUID = 2658314737117138818L;

	private Map<String, String> errorMap;
	
	public CustomException(String message) {
		super(message);
	}
	
	public CustomException(String message, Map<String, String> errorMap) {
		super(message);
		this.errorMap = errorMap;
	}
}

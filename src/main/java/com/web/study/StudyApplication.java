package com.web.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.web.study.IocAndDi.IocTest;
import com.web.study.IocAndDi.TestA;
import com.web.study.IocAndDi.TestB;

@SpringBootApplication
public class StudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudyApplication.class, args);
//		iocAndDiTest();
	}
	
	// Inversion of Control : 제어의 역전
	// Ioc : DI를 자동화 하는 것, 조립을 알아서 해줌
//	public static void iocAndDiTest() {
//		// 생성하는 시점에 부품을 선택함
//		IocTest iocTest = new IocTest(new TestB());
//		iocTest.run();
//	}

}

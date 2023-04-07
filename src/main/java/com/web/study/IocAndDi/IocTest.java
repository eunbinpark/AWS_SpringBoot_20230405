package com.web.study.IocAndDi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class IocTest {
	
	@Qualifier("t1")
	@Autowired
	private Test test;
	
	// 의존성과 결합도를 낮추기 위해 외부에서 주입하는 것
	// 수정을 할 때 여기의 코드가 바뀌는 것이 아니라 외부에서 어떤것을 넣어줄 지 선택하여 넣어주기 때문에
	// 이 클래스 내에서는 코드가 바뀔 일이 없다
	
//	public IocTest(Test test) {
//		this.test = test;
//	}
	
	public void run() {
		test.printTest();
		System.out.println("IoCTest 출력!");
	}
}

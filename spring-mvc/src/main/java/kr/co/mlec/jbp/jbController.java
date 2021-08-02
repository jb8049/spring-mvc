package kr.co.mlec.jbp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/jbp")
@Controller
public class jbController{
	
	// uri에 따른 컨트롤러 + 해당 메소드를 실행시켜 원하는 jsp를 반환
	
	@RequestMapping("/test.do")
	public String jbForm(){
		
		return "test/testForm"; //포워드할 jsp의 이름
		
	}
	
	
}

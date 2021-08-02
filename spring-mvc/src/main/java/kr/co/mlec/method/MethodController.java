package kr.co.mlec.method;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//여기로 오는 모든 메소드들은 ~   => 밑에 각각에 붙은 value 생략 가능
@RequestMapping(value="/method/method.do" )
@Controller
public class MethodController {

	
	@RequestMapping(method=RequestMethod.GET)
	
	// 리턴값을 String으로 쓰면, 포워드시킬 것만 날릴 거네?
	// 스프링이 이미 알고있다!, 매우 유연한 스프링의 디스패쳐
	// 굳이 ModelAndView 일 필요없음
	public String callGet(){
		return "method/methodForm";
	}

		@RequestMapping(method=RequestMethod.POST)
	public String callPost(){

		return "method/methodProcess";
	}
	
}

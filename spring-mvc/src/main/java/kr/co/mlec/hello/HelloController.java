package kr.co.mlec.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
		@RequestMapping("/hello/hello.do")
		public ModelAndView hello() {
			
			// 스프링.xml에 resolver로 앞에 뭐 붙을지 설정할 수 있음
			ModelAndView mav = new ModelAndView("hello/hello"); // 포워드시킬 jsp의 주소
			
			// 공유영역에 등록
			mav.addObject("msg", "hi 스프링 MVC~~");
			return mav;
		}

}

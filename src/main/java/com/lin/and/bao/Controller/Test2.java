package com.lin.and.bao.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test2 {

	@ResponseBody
	@RequestMapping("/q")
	public String getdate() {
		return "11111";
	}
	
}

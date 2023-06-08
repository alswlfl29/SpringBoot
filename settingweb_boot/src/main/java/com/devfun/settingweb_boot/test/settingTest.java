package com.devfun.settingweb_boot.test;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class settingTest {
	@RequestMapping("/test")
	public ModelAndView test() throws Exception{
		ModelAndView mav = new ModelAndView("test");
		mav.addObject("name","devfunpj");
		List<String> resultList = new ArrayList<String>();
		resultList.add("!!!Hello World!!!");
		resultList.add("설정 TEST!!!");
		resultList.add("설정 TEST!!!@@");
		resultList.add("설정 TEST!!!!!!");
		resultList.add("설정 TEST!!!!!!!!");
		mav.addObject("list",resultList);
		return mav;
	}
}
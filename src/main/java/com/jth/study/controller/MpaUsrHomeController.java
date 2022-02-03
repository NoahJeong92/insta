package com.jth.study.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class MpaUsrHomeController {
	@RequestMapping("/mpaUsr/home/main")
	@ResponseBody
	public String showMain() {
		return "안녕";
	}

	private int num= 0;
@RequestMapping("/mpaUsr/home/main4")
@ResponseBody
public Map<String, Object> showMain4(){

	++num;
	Map<String, Object> map = new HashMap<>();
	map.put("철수나이", num);
	map.put("영희나이", 22);
	return map;
	
 }
@RequestMapping("/mpaUsr/home/main3")
@ResponseBody
public int[] showMain3() {
	int[] arr= new int[] {1, 2, 3};
	
	return arr;
 }

}
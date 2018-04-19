package com.yunfei.controller;


import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sun.javafx.collections.MappingChange.Map;
import com.yunfei.dao.UserDao;
import com.yunfei.entity.User;

@Controller
public class UserController {
	@Autowired
	private UserDao dao;
	
	@RequestMapping(value = "/hello",method = RequestMethod.GET)
	@ResponseBody
	@CrossOrigin(origins = "http://localhost:8082")
	public String  getUser() {
		List<User> list=dao.findAll();
		java.util.Map<String, List<User>> map=new HashMap<>();
		map.put("users", list);
		System.out.println(JSONObject.toJSONString(map));
		return "index";
	}
	
	
}

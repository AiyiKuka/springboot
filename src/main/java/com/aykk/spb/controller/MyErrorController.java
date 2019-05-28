package com.aykk.spb.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyErrorController implements ErrorController {

	@RequestMapping(name = "/error")
	public String handError() {
		return "My Error";
	}

	@Override
	public String getErrorPath() {
		return "/error";
	}

}

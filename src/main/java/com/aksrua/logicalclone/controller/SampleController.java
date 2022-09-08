package com.aksrua.logicalclone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {

	@GetMapping("/aksrua")
	public void hello() {
		System.out.println("hi");
	}
}

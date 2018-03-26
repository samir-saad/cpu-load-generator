package com.opticca.demo.cpuload.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.opticca.demo.cpuload.service.LoadGenerator;

@RestController
public class LoadController {

	@Autowired
	private LoadGenerator loadGenerator;

	@RequestMapping("/run")
	public String run(@RequestParam(value = "load") double load, @RequestParam(value = "duration") long duration) {
		loadGenerator.run(load, duration);
		return "OK!";
	}
}

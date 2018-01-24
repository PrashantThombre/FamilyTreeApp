package io.prashant.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CRUDController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String root(){
		return "Family Tree Application Base";
	}
}

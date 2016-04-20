package com.appdirect.endpoint;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by alex.ardelean on 20/04/16.
 */
@RestController
@RequestMapping(path = "/api/")
public class TestResource {
	@RequestMapping(path ="/",method = RequestMethod.GET)
	public String getResponseBody(){
		return "<static></static>";
	}
}

package com.appdirect.logs;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/log")
@RestController
public class LogResource {

	@Autowired
	private LogRepository logRepository;

	@RequestMapping(path = "" ,method = RequestMethod.POST)
	public void createLog(@RequestBody String body){
		Log log = new Log();
		log.setContent(body);
		log.setCreated(new Date());
		logRepository.save(log);
	}
}

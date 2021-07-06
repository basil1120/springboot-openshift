package com.sprintel.main.controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sprintel.main.entities.Status;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1")
public class CommonController {
	
	private static final Logger logger = LoggerFactory.getLogger(CommonController.class);
	private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	
	@GetMapping("/status")
	public ResponseEntity<?> getAppUsers(){
		Status status = new Status();
		LocalDateTime now = LocalDateTime.now();
		ObjectMapper mapper = new ObjectMapper();
		try {
			status.setStatusCode("000");
			status.setStatusDescription("Success");
			status.setStatusDateTime(dtf.format(now));
			status.setStatusVersion("1.0.0");
			String responseAsJson = mapper.writeValueAsString(status);
			logger.info("SpringBoot+OpenShit:::RequestDateTime[{}]:::Payload[{}]",dtf.format(now), responseAsJson);
		}catch(Exception e) {
			logger.error(e.getMessage());
		}
		return ResponseEntity.ok().body(status);
	}
}

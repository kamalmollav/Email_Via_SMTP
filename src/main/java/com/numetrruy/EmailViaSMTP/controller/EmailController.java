package com.numetrruy.EmailViaSMTP.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.numetrruy.EmailViaSMTP.dto.EmailDetails;
import com.numetrruy.EmailViaSMTP.services.EmailServices;

@RestController
public class EmailController {

	@Autowired
	private EmailServices emailService;

	// Sending a simple Email
	@PostMapping("/sendMail")
	public String sendMail(@RequestBody EmailDetails details) {
		String status = emailService.sendSimpleMail(details);

		return status;
	}

}

package com.numetrruy.EmailViaSMTP.services;

import com.numetrruy.EmailViaSMTP.dto.EmailDetails;

public interface EmailServices {

	String sendSimpleMail(EmailDetails details);

}

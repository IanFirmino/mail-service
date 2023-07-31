package com.ms.mail.controllers;

import com.ms.mail.dtos.EmailDto;
import com.ms.mail.models.EmailModel;
import com.ms.mail.services.EmailService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class EmailController {

    @Autowired
    EmailService emailService;

    @PostMapping("sending-email")
    public ResponseEntity<EmailModel> sendingEmail(@RequestBody @Valid EmailDto emailDto){
        return new ResponseEntity<>(emailService.sendEmail(emailDto.emailDtoToModel()), HttpStatus.CREATED);
    }

}

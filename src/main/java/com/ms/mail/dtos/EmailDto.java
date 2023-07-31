package com.ms.mail.dtos;

import com.ms.mail.models.EmailModel;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.springframework.beans.BeanUtils;

@Data
public class EmailDto {

    @NotBlank
    private String ownerRef;
    @NotBlank
    @Email
    private String emailFrom;
    @Email
    @NotBlank
    private String emailTo;
    @NotBlank
    private String subject;
    @NotBlank
    private String text;

    public EmailModel emailDtoToModel(){
        EmailModel emailModel = new EmailModel();
        BeanUtils.copyProperties(this, emailModel);

        return emailModel;
    }

}

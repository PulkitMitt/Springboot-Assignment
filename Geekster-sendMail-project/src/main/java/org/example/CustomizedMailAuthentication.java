package org.example;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class CustomizedMailAuthentication extends Authenticator{
//    Overriding the method of getPasswordAuthentication() of Authenticator class
    protected PasswordAuthentication getPasswordAuthentication(){
        return new PasswordAuthentication(MailMetaData.myUserMail, MailMetaData.password);
    }
}

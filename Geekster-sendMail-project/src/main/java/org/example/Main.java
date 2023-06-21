package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sending to send out mail");

//        Creating an object of class MailMetaData
            MailHandler mailHandler = new MailHandler();
            mailHandler.sendMail();
    }
}
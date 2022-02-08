package com.sapient.trg.pl;

import com.sapient.trg.service.MessageBuilder;


public class MessageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageBuilder messageBuilder = new MessageBuilder();

		System.out.println(messageBuilder.getMessage(null));
		System.out.println(messageBuilder.getMessage("Karandeep"));
		

	}
	
}	

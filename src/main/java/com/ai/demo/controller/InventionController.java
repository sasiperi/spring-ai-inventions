package com.ai.demo.controller;

import org.springframework.ai.openai.client.OpenAiChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inventions")
public class InventionController {
	
	private OpenAiChatClient openAiChatClient;
	
    public InventionController(OpenAiChatClient openAiChatClient)
    {
    	this.openAiChatClient = openAiChatClient;
    }
    
    @GetMapping("/inventor")
    public String getInventions()
    {
    	//String prompt = "What are the inventions of Isac Newton";
    	String prompt = "Tell Me a Joke";
    	return openAiChatClient.generate(prompt);
    	
    }
	
	
}

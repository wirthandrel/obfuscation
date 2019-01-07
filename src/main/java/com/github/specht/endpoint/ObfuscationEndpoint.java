package com.github.specht.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.specht.ObfuscationService;

@Controller
public class ObfuscationEndpoint {
	
	@Autowired
	private ObfuscationService  obfuscationService;
	
	@GetMapping("/faz/algo")
    @ResponseBody
    public void fazAlgo() {
		
		obfuscationService.fazAlgo();
		
	}

}

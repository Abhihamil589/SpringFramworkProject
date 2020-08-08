package com.abhihamil.springAnnotation;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	public String getFortune() {

		return "Today's your Lucky day!";
	}

}

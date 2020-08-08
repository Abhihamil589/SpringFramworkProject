package com.abhihamil.springAnnotation;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		String []arr={"love u mom dad","love u simran","you are best","u can do it","keep doing somday u will achive"};
		Random random=new Random();
		int index=random.nextInt(arr.length);
		String fortune=arr[index];
		return fortune;
	}

}

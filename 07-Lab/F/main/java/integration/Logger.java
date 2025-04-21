package Lab07F.main.java.integration;

import java.util.Date;

import Lab07F.main.java.domain.Observer;

public class Logger implements Observer{
	public void log(int countervalue) {
		System.out.println(new Date()+" Log counter with value "+countervalue);
	}


	public void update(int countervalue) {
		log(countervalue);		
	}

}

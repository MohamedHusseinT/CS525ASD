package Lab07F.main.java.dataaccess;

import Lab07F.main.java.domain.Observer;

public class CounterDAO implements Observer{
	public void save(int countervalue) {
		System.out.println("Save counter to database with value "+countervalue);
	}


	public void update(int countervalue) {
		save(countervalue);		
	}
}

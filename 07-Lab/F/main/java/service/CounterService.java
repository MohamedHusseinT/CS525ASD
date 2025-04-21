package Lab07F.main.java.service;

import Lab07F.main.java.dataaccess.CounterDAO;
import Lab07F.main.java.domain.Counter;
import Lab07F.main.java.domain.CounterState;
import Lab07F.main.java.domain.Observer;
import Lab07F.main.java.domain.SingleDigit;
import Lab07F.main.java.integration.Logger;

public class CounterService {
	
	private Counter counter;
	ValueHandler handler;
	
	public CounterService() {
		counter = new Counter();
		// set initial state
		CounterState state= new SingleDigit(counter);
		counter.setState(state);
		// set the observers
		counter.addObserver(new CounterDAO());
		counter.addObserver(new Logger());
		// create the chain
		handler = new OrangeValueHandler(null);
		handler = new BlueValueHandler(handler);
		handler = new GreenValueHandler(handler);
		handler = new RedValueHandler(handler);
		
	}

	public void increment() {
		counter.increment();
		handler.handleValue(counter.getCount());
	}
	
	public void decrement() {
		counter.decrement();
		handler.handleValue(counter.getCount());
	}
	
	public void addObserver(Observer observer) {
		counter.addObserver(observer);
	}

}

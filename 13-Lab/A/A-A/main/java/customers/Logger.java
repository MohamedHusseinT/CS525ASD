package Lab13A.main.java.customers;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.format.datetime.joda.LocalDateTimeParser;
import org.springframework.stereotype.Service;

@Service
public class Logger implements ILogger{

	public void log(String logstring) {
		System.out.println("Logging "+LocalDateTime.now()+" "+logstring);		
	}

}

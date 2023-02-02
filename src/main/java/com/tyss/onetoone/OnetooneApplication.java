package com.tyss.onetoone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnetooneApplication {
	
//	@Autowired
//	private FlightBookingService bookingService;
//
//	
//	@PostMapping("/bookFlightTicket")
//	public FlightBookingAcknoledgment bookingFLightTicket(@RequestBody FlightBookingRequest request) {
//		return bookingService.bookingFLightTicket(request);
//
//	}
	
	public static void main(String[] args) {
		SpringApplication.run(OnetooneApplication.class, args);
	}

}

package com.testService1;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;



@Component("testService1")
public class testService1HealthIndicator implements HealthIndicator {
	
	@Override
	public Health health() {

	Health.Builder status = Health.up();
     
	return status.build();
	
	}


}

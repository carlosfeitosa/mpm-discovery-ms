package com.skull.discovery;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Test main class for Eureka service.
 * 
 * @author Carlos Feitosa (carlos.feitosa.nt@gmail.com)
 * @since 2020-08-14
 *
 */
@SpringBootTest(classes = MpmServiceDiscoveryApplication.class)
class MpmServiceDiscoveryApplicationTests { // NOPMD by skull on 8/14/20, 11:58 PM

	/**
	 * Test if context loads.
	 */
	@Test
	public void contextLoads() { // NOPMD by skull on 8/15/20, 12:01 AM
		// automatic context check

		MpmServiceDiscoveryApplication.main(new String[] {});
	}

}

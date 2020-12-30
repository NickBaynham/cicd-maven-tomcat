package com.github.nickbaynham.cicdpipeline;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CicdpipelineApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("All Clear!");
	}

	@Test
	void myUnitTest() {
		System.out.println("It Passed!");
	}

	@Test
	void anotherGreatTest() {
		System.out.println("Again it is passing, awesome!");
	}

}

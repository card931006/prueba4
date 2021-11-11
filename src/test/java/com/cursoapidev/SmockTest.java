package com.cursoapidev;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SmockTest {

	@Autowired
	private HomeController controller;
	
	@Test
	public void contextLoads() throws Exception{
		assertThat(controller).isNotNull();
	}
}

package com.pj.liquibasedemo;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class LiquibaseTestApplicationTests
{
	@Test
	void contextLoads()
	{
		System.out.println("Context loaded");
	}
}


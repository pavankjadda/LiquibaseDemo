package com.pj.liquibasedemo;

import com.pj.liquibasedemo.domain.EmploymentType;

public class EnumTest
{
	public static void main(String[] args)
	{
		System.out.println(EmploymentType.CONTRACTOR.toString().equals("CONTRACTOR"));
	}
}

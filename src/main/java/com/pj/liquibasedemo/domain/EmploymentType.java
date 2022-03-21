package com.pj.liquibasedemo.domain;

/**
 * Enum that represents the employment type.
 *
 * @author Pavan Kumar Jadda
 * @since 1.0.0
 */
public enum EmploymentType
{
	CONTRACTOR("contractor"),
	EMPLOYEE("employee");

	private final String label;

	EmploymentType(String label)
	{
		this.label = label;
	}

	public String getLabel()
	{
		return label;
	}
}

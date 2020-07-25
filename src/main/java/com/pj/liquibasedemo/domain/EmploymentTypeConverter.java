package com.pj.liquibasedemo.domain;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.stream.Stream;

@Converter(autoApply = true)
public class EmploymentTypeConverter implements AttributeConverter<EmploymentType, String>
{

	@Override
	public String convertToDatabaseColumn(EmploymentType employmentType)
	{
		if (employmentType == null)
		{
			return null;
		}
		return employmentType.getLabel();
	}

	@Override
	public EmploymentType convertToEntityAttribute(String label)
	{
		if (label == null)
		{
			return null;
		}
		return Stream.of(EmploymentType.values())
				.filter(c -> c.getLabel().equals(label))
				.findFirst()
				.orElseThrow(IllegalArgumentException::new);
	}
}

package com.sjhello.refactoring._11_primitive_obsession._31_replace_type_code_with_subclasses.direct_inheritance.before;

import java.util.List;

/**
 * 직접 상속이 가능한 경우
 * */
public class Employee {

	private String name;
	private String type;

	public Employee(String name, String type) {
		this.validate(type);
		this.name = name;
		this.type = type;
	}

	private void validate(String type) {
		List<String> legalType = List.of("engineer", "salesman", "manager");
		if (!legalType.contains(type)) {
			throw new IllegalArgumentException("type is not found");
		}
	}

	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return "Employee{" +
			"name='" + name + '\'' +
			", type='" + type + '\'' +
			'}';
	}
}

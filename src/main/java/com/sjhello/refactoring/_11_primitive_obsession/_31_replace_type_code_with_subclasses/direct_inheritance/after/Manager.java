package com.sjhello.refactoring._11_primitive_obsession._31_replace_type_code_with_subclasses.direct_inheritance.after;

public class Manager extends Employee {
	public Manager(String name) {
		super(name);
	}

	@Override
	protected String getType() {
		return "manager";
	}
}

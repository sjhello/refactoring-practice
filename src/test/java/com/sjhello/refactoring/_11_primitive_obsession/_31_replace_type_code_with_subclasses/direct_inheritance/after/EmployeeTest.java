package com.sjhello.refactoring._11_primitive_obsession._31_replace_type_code_with_subclasses.direct_inheritance.after;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class EmployeeTest {

	@ParameterizedTest
	@ValueSource(strings = {"engineer", "salesman", "manager"})
	void employee_객체를_생성한다(String type) {
		assertThat(Employee.createEmployee("sjhello", type).getType()).isEqualTo(type);
	}

	@Test
	void emplyee_객체_생성에_실패한다() {
		assertThrows(IllegalArgumentException.class, () -> {
			Employee.createEmployee("sjhello", "developer");
		});
	}
}

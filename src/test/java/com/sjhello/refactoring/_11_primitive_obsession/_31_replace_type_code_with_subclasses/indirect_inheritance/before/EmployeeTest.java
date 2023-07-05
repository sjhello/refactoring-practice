package com.sjhello.refactoring._11_primitive_obsession._31_replace_type_code_with_subclasses.indirect_inheritance.before;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTest {

	@Test
	void indirect_employee_test() {
		assertThat(new FullTimeEmployee("sjhello", "manager").capitalizedType()).isEqualTo("Manager");
		assertThat(new PartTimeEmployee("sjhello", "salesman").capitalizedType()).isEqualTo("Salesman");
		assertThat(new PartTimeEmployee("sjhello", "engineer").capitalizedType()).isEqualTo("Engineer");
		assertThrows(IllegalArgumentException.class, () -> {
			new FullTimeEmployee("sjhello", "developer").capitalizedType();
		});
	}
}

package com.sjhello.refactoring._11_primitive_obsession._32_replace_conditional_with_polymorphism.switches.after;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class EmployeeTest {

    @Test
    void full_time() {
        Employee employee = new FullTime();
        assertThat(employee.vacationHours()).isEqualTo(120);
        assertThat(employee.canAccessTo("jpa")).isTrue();
        assertThat(employee.canAccessTo("spring")).isTrue();
        assertThat(employee.canAccessTo("anyProject")).isTrue();
    }

    @Test
    void part_time() {
        Employee employee = new PartTime(List.of("spring", "jpa"));
        assertThat(employee.vacationHours()).isEqualTo(80);
        assertThat(employee.canAccessTo("jpa")).isTrue();
        assertThat(employee.canAccessTo("spring")).isTrue();
        assertThat(employee.canAccessTo("anyProject")).isFalse();
    }

    @Test
    void temporal_time() {
        Employee employee = new TemporalTime(List.of("spring", "jpa"));
        assertThat(employee.vacationHours()).isEqualTo(32);
        assertThat(employee.canAccessTo("jpa")).isTrue();
        assertThat(employee.canAccessTo("spring")).isTrue();
        assertThat(employee.canAccessTo("anyProject")).isFalse();
    }
}

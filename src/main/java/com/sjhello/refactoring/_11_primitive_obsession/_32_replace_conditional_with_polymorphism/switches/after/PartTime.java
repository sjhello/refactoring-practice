package com.sjhello.refactoring._11_primitive_obsession._32_replace_conditional_with_polymorphism.switches.after;

import java.util.List;

public class PartTime extends Employee {

    public PartTime(List<String> availableProjects) {
        super(availableProjects);
    }

    @Override
    public int vacationHours() {
        return 80;
    }
}

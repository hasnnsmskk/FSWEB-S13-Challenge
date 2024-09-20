package org.example;

import org.example.enums.Plan;

public class HealthPlan {
    private int id;
    private String name;
    private Plan plan;

    public HealthPlan(int id, String name, Plan plan) {
        this.id = id;
        this.name = name;
        this.plan = plan;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Plan getPlan() {
        return plan;
    }
}

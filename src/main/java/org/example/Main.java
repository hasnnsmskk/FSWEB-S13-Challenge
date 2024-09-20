package org.example;

public class Main {
    public static void main(String[] args) {
        runApplication();
    }

    private static void runApplication() {

        HealthPlan basicPlan = new HealthPlan(1, "A Sigorta", org.example.enums.Plan.BASIC);
        System.out.println(basicPlan);


        String[] healthPlans = {basicPlan.getName()};
        Employee employee = new Employee(1, "John Doe", "jd@test.com", "1234", healthPlans);
        System.out.println(employee);


        String[] developers = {"Alice", "Bob"};
        Company company = new Company(1, "Workintech", 1000, developers);
        System.out.println(company);


        try {
            company.setGiro(-500); // Bu satır hata fırlatmalı
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


        company.setGiro(1500);
        System.out.println(company);
    }
}

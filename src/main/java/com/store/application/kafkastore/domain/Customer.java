package com.store.application.kafkastore.domain;

public class Customer {
    private String name;
    private Integer age;

    public Customer() {
    }

    public Customer(final String name, final Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    void setName(final String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    void setAge(final Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

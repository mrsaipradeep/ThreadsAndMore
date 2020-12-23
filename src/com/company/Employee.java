package com.company;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Employee {

    private String name;
    private long age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        List<Employee> e = new ArrayList<>();
        e.add(new Employee());


        System.out.println(e.getClass().getTypeName());
        System.out.println(Arrays.toString(e.getClass().getTypeParameters()));
        System.out.println(e.getClass().getName());
        System.out.println(e.getClass().getSimpleName());
        System.out.println(e.getClass().getCanonicalName());

            //Method main = Employee.class.getMethod("main", String[].class);

            try {
                System.out.println(e.getClass().getMethod("get",int.class));
            } catch (NoSuchMethodException e1) {
                e1.printStackTrace();
            }

        //System.out.println(e1.getGenericType().getTypeName());

    }
}

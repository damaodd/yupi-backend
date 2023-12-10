package com.yupi.yuapiinterface;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

public class test {
    class Student {
        String name;
        int studentId;
        String gender;
        double[] grades;
        double[] credits;

        public Student(String name, int studentId, String gender, double[] grades, double[] credits) {
            this.name = name;
            this.studentId = studentId;
            this.gender = gender;
            //评分
            this.grades = grades;
            //学分
            this.credits = credits;
        }
        //计算学分
        public double calculateCreditProduct() {
            double product = 1.0;
            for (int i = 0; i < grades.length; i++) {
                product *= grades[i] * credits[i];
            }
            return product;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", studentId=" + studentId +
                    ", gender='" + gender + '\'' +
                    ", creditProduct=" + calculateCreditProduct() +
                    '}';
        }

    }
    @Test
    void test(){

    Student[] students = {
            new Student("John", 1, "Male", new double[]{90.5, 85.0, 78.5}, new double[]{4.0, 3.0, 3.5}),
            new Student("Alice", 2, "Female", new double[]{88.0, 92.5, 76.0}, new double[]{3.5, 4.0, 3.0}),
    };
        for (Student student : students) {
            System.out.println("排序前"+student);
        }
        //排序
        Arrays.sort(students, Comparator.comparingDouble(Student::calculateCreditProduct).reversed());
    for (Student student : students) {
        System.out.println(student);
    }
}
}


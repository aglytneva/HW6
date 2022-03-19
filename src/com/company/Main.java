package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        // Задание 1
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника = " + fullName);
        // Задание 2
        System.out.println("Данные ФИО сотрудника для заполнения отчета " + fullName.toUpperCase());
        // Задание 3
        System.out.println("Данные ФИО сотрудника для административного отдела - "+ fullName.replace(" ","; "));
        fullName = fullName.replace("ё", "е");
        fullName = fullName.replace("Ё", "Е");
        System.out.println("Данные ФИО сотрудника - "+ fullName);

    }
}

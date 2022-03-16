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
        String fullNameUpper = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета " + fullNameUpper);
        // Задание 3
        String fullNameForAdmin =fullName.replace(" ",";");
        System.out.println("Данные ФИО сотрудника для административного отдела - "+ fullNameForAdmin);
        String fullNameWithoutMistake = fullName.replace("ё", "е");
        String fullNameWithoutMistake2 = fullNameWithoutMistake.replace("Ё", "Е");
        System.out.println("Данные ФИО сотрудника - "+ fullNameWithoutMistake2);

    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
        /*Задание 1*/
        int intNumber = 5;
        short shortNumber = 10;
        byte byteNumber = -20;
        long longNumber = 300L;
        float floatNumber = 3.5f;
        double doubleNumber = 5.4;
        boolean booleanNumber = true; // были в шпаргалке
        char charSymbol = 'A'; // были в шпаргалке

        /* Задание 2*/
        System.out.println("*********Задание 2**********");
        double firstBoxerWeight = 78.2;
        double secondBoxerWeight = 82.7;

        double sumWeight = firstBoxerWeight + secondBoxerWeight;
        double substrWeight = secondBoxerWeight - firstBoxerWeight;

        System.out.println("Общий вес двух бойцов: " + sumWeight + " кг");
        System.out.println("Разница в весе составляет: " + substrWeight + " кг");
        System.out.println(" ");

        /*Задание 3*/
        System.out.println("*********Задание 3**********");

        int bananaWeight = 80;
        int bananaNumber = 5;

        int milkHundredMlWeight = 105;
        int milkHundredMl = 2;

        int iceCreamWeight = 100;
        int iceCreamNumber = 2;

        int eggWeight = 70;
        int eggNumber = 4;

        float breakfastWeight = (bananaWeight * bananaNumber) +
                (milkHundredMlWeight * milkHundredMl) +
                (iceCreamWeight * iceCreamNumber) +
                (eggWeight * eggNumber);

        float kgConverter = breakfastWeight / 1000;

        System.out.println("Вес спорт-завтрака составляет: " + kgConverter+ " кг");
        System.out.println(" ");

        /*Задание 4*/
        System.out.println("*********Задание 4**********");
        int loseWeight = 7000;
        int dailyWeightMin = 250;
        int dailyWeightMax = 500;

        int dayNumbersMax = loseWeight / dailyWeightMin;
        int dayNumbersMin = loseWeight / dailyWeightMax;

        int averageDays = (dayNumbersMin+dayNumbersMax) / 2;

        System.out.println("Если сбрасывать по 250 грамм в день похудеешь за " + dayNumbersMax + " дней");
        System.out.println("Если сбрасывать по 500 грамм в день похудеешь за " + dayNumbersMin + " дней");
        System.out.println("В среднем для похудения потребуется: " + averageDays + " день");
        System.out.println(" ");

        /*Задание 5*/
        System.out.println("*********Задание 5**********");
        double salaryMasha = 67760;
        double salaryDenis = 83690;
        double salaryKristina = 76230;

        double newMashaSalary = salaryMasha + salaryMasha * 0.1;
        double newDenisSalary = salaryDenis + salaryDenis * 0.1;
        double newKristinaSalary = salaryKristina + salaryKristina * 0.1;

        double gapYearSalaryMasha = (newMashaSalary * 12) - (salaryMasha * 12);
        double gapYearSalaryDenis = (newDenisSalary * 12) - (salaryDenis * 12);
        double gapYearSalaryKristina = (newKristinaSalary * 12) - (salaryKristina * 12);

        System.out.println("Маша теперь получает " + newMashaSalary
                + " рублей. Годовой доход вырос на " + gapYearSalaryMasha + " рублей." );
        System.out.println("Денис теперь получает " + newDenisSalary
                + " рублей. Годовой доход вырос на " + gapYearSalaryDenis + " рублей." );
        System.out.println("Кристина теперь получает " + newKristinaSalary
                + " рублей. Годовой доход вырос на " + gapYearSalaryKristina + " рублей." );






    }
}

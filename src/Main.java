public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
        task18();
    }

    public static void task1() {
        System.out.println("Задача для самостоятельной работы 1");
        for (int i = 1; i < 11; i = i + 1) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача для самостоятельной работы 2");
        for (int i = 10; i > 0; i = i - 1) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача для самостоятельной работы 3");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача для самостоятельной работы 4");
        for (int i = 10; i > -11; i = i - 1) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task5() {
        System.out.println("Задача для самостоятельной работы 5");
        for (int i = 1904; i < 2097; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
    }

    public static void task6() {
        System.out.println("Задача для самостоятельной работы 6");
        for (int i = 7; i < 99; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task7() {
        System.out.println("Задача для самостоятельной работы 7");
        for (int i = 1; i < 513; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    public static void task8() {
        System.out.println("Задача для самостоятельной работы 8");
        int total = 29000;
        for (int i = 1; i < 13; i++) {
            System.out.println("Месяц " + i + ", сумма накоплений равна " + (i * total));
        }
    }

    public static void task9() {
        System.out.println("Задача для самостоятельной работы 9");
        float total = 29000f;
        for (int i = 0; i < 13; i++) {
            total *= 1.01;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total);
        }
    }

    public static void task10() {
        System.out.println("Задача для самостоятельной работы 10");
        int num1 = 1;
        int num2 = 0;
        int num3 = 0;
        for (int i = 0; i < 11; i++) {
            num3 = num1 + num2;
            System.out.print(num3 + " ");
            num1 = num2;
            num2 = num3;
        }
        System.out.println();
    }

    public static void task11() {
        System.out.println("Задача для самостоятельной работы 11");
        int amount = 15000;
        int month = 0;
        while (amount < 2_459_000) {
            amount += 15000 + amount * 0.01;
            month += 1;
        }
        System.out.println("Месяц " + month + ", сумма накоплений равна " + amount + " рублей. Чтобы накопить 2459000 рублей потребуется " + (month + 1) + " месяцев");
    }

    public static void task12() {
        System.out.println("Задача для самостоятельной работы 12");
        int first = 0;
        while (first < 10) {
            first += 1;
            System.out.print(first + " ");
        }
        System.out.println();
        for (int i = 10; i > 0; i -= 1) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task13() {
        System.out.println("Задача для самостоятельной работы 13");
        int population = 12_000_000;
        int birth = 17;
        int death = 8;
        for (int i = 1; i < 11; i++) {
            population += population / 1000 * (birth - death);
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }
    }

    public static void task14() {
        System.out.println("Задача для самостоятельной работы 14");
        float total = 15_000f;
        int monthCounter = 0;
        while (total < 12_000_000) {
            total *= 1.07;
            monthCounter += 1;
            System.out.println("Месяц: " + monthCounter + ". Накопления: " + (int) total);
        }
    }

    public static void task15() {
        System.out.println("Задача для самостоятельной работы 15");
        float total = 15_000f;
        int monthCounter = 0;
        float percent = 1.07f;
        while (total < 12_000_000) {
            total *= percent;
            monthCounter += 1;
            if (monthCounter % 6 == 0) {
                System.out.println("Месяц: " + monthCounter + ". Накопления: " + (int) total);
            }
        }
    }

    public static void task16() {
        System.out.println("Задача для самостоятельной работы 16");
        float total = 15_000f;
        int monthCounter = 0;
        float percent = 1.07f;
        while (monthCounter <= (12 * 9)) {
            total *= percent;
            monthCounter += 1;
            if (monthCounter % 6 == 0) {
                System.out.println("Месяц: " + monthCounter + ". Накопления: " + (int) total);
            }
        }

    }

    public static void task17() {
        System.out.println("Задача для самостоятельной работы 17");
        int firstFriday = 4;
        int daysInMonth = 31;
        for (; firstFriday <= daysInMonth; firstFriday += 7) {
            System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет.");
        }
    }

    public static void task18() {
        System.out.println("Задача для самостоятельной работы 18");
        int thisYear = 2022;
        int previousYears = thisYear - 200;
        int nextYears = thisYear + 100;
        for (int i = previousYears; i <= nextYears; i++) {
            if (i % 79 == 0) {
                System.out.println(i);

            }
        }
    }
}

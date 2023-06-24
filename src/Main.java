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
    }

    public static void task1() {
        System.out.println("Задача 1");
        int dog = 8;
        System.out.println("Значение переменной dog с типом int равно " + dog);
        byte cat = 3;
        System.out.println("Значение переменной cat с типом byte равно " + cat);
        short paper = 7;
        System.out.println("Значение переменной paper с типом short равно " + paper);
        long pet = 9l;
        System.out.println("Значение переменной pet с типом long равно " + pet);
        float colar = 1f;
        System.out.println("Значение переменной colar с типом float равно " + colar);
        double mask = 2;
        System.out.println("Значение переменной mask с типом double равно " + mask);
    }
    public static void task2() {
        System.out.println("Задача 2");
        int dog = 569;
        System.out.println(dog);
        byte cat = 67;
        System.out.println(cat);
        short paper = -159;
        System.out.println(paper);
        long pet = 987_678_965_549l;
        System.out.println(pet);
        float colar = 27.12f;
        System.out.println(colar);
        double mask = 2.786;
        System.out.println(mask);
        short whip = 27897;
        System.out.println(whip);
    }
    public static void task3() {
        System.out.println("Задача 3");
        byte lP = 23;
        byte aS = 27;
        byte eA = 30;
        short paper = 480;
        int totalStudens = lP + aS + eA;
        int totalPaper = paper / totalStudens;
        System.out.println("На каждого ученика рассчитано" + totalPaper + " листов бумаги");

    }
    public static void task4() {
        System.out.println("Задача 4");
        byte auto = 16;
        byte time = 2;
        byte timeMin = 20;
        int timeMinTotal = timeMin / time * auto;
        System.out.println("За " + timeMin + " минут машина произвела " + timeMinTotal + " штук бутылок");
        short timeOneDay = 1_440;
        int timeOneDayTotal = timeOneDay / time * auto;
        System.out.println("За " + timeOneDay + " минут машина произвела " + timeOneDayTotal + " штук бутылок");
        int timeThreeDay = timeOneDay * 3;
        int timeThreeDayTotal = timeThreeDay / time * auto;
        System.out.println("За " + timeThreeDay + " минут машина произвела " + timeThreeDayTotal + " штук бутылок");
        int timeMonth = timeOneDay * 30;
        int timeMonthTotal = timeMonth / time * auto;
        System.out.println("За " + timeMonth + " минут машина произвела " + timeMonthTotal + " штук бутылок");

    }
    public static void task5() {
        System.out.println("Задача 5");
        byte pot = 120;
        byte potWhite = 2;
        byte potBrown = 4;
        int classAll = pot / (potWhite + potBrown);
        int potWhiteClass = classAll * potWhite;
        int potBrownClass = classAll * potBrown;
        System.out.println("В школе, где " + classAll + " классов, нужно " + potWhiteClass + " банок белой краски и " + potBrownClass + " банок коричневой краски");
    }
    public static void task6() {
        System.out.println("Задача 6");
        byte bananaWeight = 80;
        byte bananaQuantity = 5;
        byte milkWeight = 105;
        int milkQuantity = 200 / 100;
        int iceСreamQuantity = 2;
        byte iceCreamWeight = 100;
        byte eggQuantity = 4;
        byte eggWeight = 70;
        int total = bananaWeight * bananaQuantity + milkWeight * milkQuantity + iceСreamQuantity * iceCreamWeight + eggQuantity * eggWeight;
        System.out.println(total);
        int grPerKg = 1_000;
        float totalAll = total / (float) grPerKg;
        System.out.println(totalAll);
    }

    public static void task7() {
        System.out.println("Задача 7");
        int kg = 7 * 1_000;
        int gr = 250;
        int gra = 500;
        int grAll = kg / gr;
        System.out.println(grAll);
        int graAll = kg / gra;
        System.out.println(graAll);
        int total = (grAll + graAll) / 2;
        System.out.println(total);
        float kg1 = (gr + gra) / 2;
        float totalVar = kg / kg1;
        System.out.println(totalVar);

    }
    public static void task8() {
        System.out.println("Задача 8");
        int masha = 67_760;
        int denis = 83_690;
        int kristina = 76_230;
        float tenProcent = 1.1f;
        float mashaTen = masha * tenProcent;
        float mashaYears = masha * 12;
        float mashaDifference = mashaTen - masha;
        float mashaDifferenceYears = mashaDifference * 12;
        System.out.println("Маша теперь получает " + mashaTen + " рублей. Годовой доход вырос на " + mashaDifferenceYears + " рублей");
        float denisTen = denis * tenProcent;
        float denisDifference = denisTen - denis;
        float denisYears = denis * 12;
        float denisDifferenceYears = denisDifference * 12;
        System.out.println("Динис теперь получает " + denisTen + " рублей. Годовой доход вырос на " + denisDifferenceYears + " рублей");
        float kristinaTen = kristina * tenProcent;
        float kristinaDifference = kristinaTen - kristina;
        float kristinaYears = kristina * 12;
        float kristinaDifferenceYears = kristinaDifference * 12;
        System.out.println("Кристина теперь получает " + kristinaTen + " рублей. Годовой доход вырос на " + kristinaDifferenceYears + " рублей");

    }
}

public class Main {
    public static void main(String[] args) {

//        Task 1
        byte a = 1;
        short b = 200;
        int c = 3000;
        long l = 5000L;
        float f = 3.5f;
        double d = 3.14;

        System.out.println("\nTask 1\n");
        System.out.println("Значение переменной a с типом byte равно " + a);
        System.out.println("Значение переменной b с типом short равно " + b);
        System.out.println("Значение переменной c с типом int равно " + c);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной d с типом double равно " + d);

//        Task 2

        float f2 = 27.12f;
        long l2 = 987678965549L;
        double d2 = 2.786;
        short s2 = 569;
        short s3 = -159;
        int i2 = 27897;
        byte b2 = 67;

        System.out.println("\nTask 2\nNo out");


//        Task 3
        byte studentsClass1 = 23;
        byte studentsClass2 = 27;
        byte studentsClass3 = 30;
        short paperListCount = 480;

        int studentsCount = studentsClass1 + studentsClass2 + studentsClass3;
        int listPerStudent = paperListCount / studentsCount;

        System.out.println("\nTask 3\n");
        System.out.println("На каждого ученика рассчитано " + listPerStudent + " листов бумаги");

//        Task 4
        byte efficiencyBase = 16 / 2;
        short efficiency20min = (short) (efficiencyBase * 20);
        short efficiencyPerDay = (short) (efficiencyBase * 60 * 24);
        int efficiencyPer3Days = efficiencyPerDay * 3;
        int efficiencyPerMonth = efficiencyPerDay * 30;

        System.out.println("\nTask 4\n");
        System.out.println("За 20 минут машина произвела " + efficiency20min + " штук бутылок");
        System.out.println("За сутки машина произвела " + efficiencyPerDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + efficiencyPer3Days + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + efficiencyPerMonth + " штук бутылок");

//        Task 5
        byte paintCanCount = 120;
        byte brownPaintCanPerClass = 4;
        byte whitePaintCanPerClass = 2;

        byte classCount = (byte) (paintCanCount / (brownPaintCanPerClass + whitePaintCanPerClass));
        byte brownPaintCanCount = (byte) (classCount * brownPaintCanPerClass);
        byte whitePaintCanCount = (byte) (classCount * whitePaintCanPerClass);

        System.out.println("\nTask 5\n");
        System.out.println("В школе, где " + classCount + " классов, нужно " + whitePaintCanCount + " банок белой краски и " + brownPaintCanCount + " банок коричневой краски");

//        Task 6
        short bananasWeight = 5 * 80;
        short milkWeight = 200 / 100 * 105;
        short iceCreamWeight = 2 * 100;
        short eggsWeight = 4 * 70;

        short breakfastWeightG = (short) (bananasWeight + milkWeight + iceCreamWeight + eggsWeight);
        float breakfastWeightKG = (float) breakfastWeightG / 1000;

        System.out.println("\nTask 6\n");
        System.out.println("Вес заданной порции спортивного завтрака равен " + breakfastWeightG + " грамм, или " + breakfastWeightKG + " кг");

//        Task 7
        short weightToLose = 7000;

        byte dietDaysCount1 = (byte) (weightToLose / 250);
        byte dietDaysCount2 = (byte) (weightToLose / 500);
        float avgDietDaysCount = (float) (dietDaysCount1 + dietDaysCount2) / 2;

        System.out.println("\nTask 7\n");
        System.out.println("Чтобы скинуть нужный вес с помощью диеты 1, нужно дней: " + dietDaysCount1);
        System.out.println("Чтобы скинуть нужный вес с помощью диеты 2, нужно дней: " + dietDaysCount2);
        System.out.println("В среднем, похудеть можно за " + avgDietDaysCount + " дней");

//        Task 8
        System.out.println("\nTask 8\n");

        printNewAnnualAndSalarySup("Маша", 67760, 10);
        printNewAnnualAndSalarySup("Денис", 83690, 10);
        printNewAnnualAndSalarySup("Кристина", 76230, 10);


    }

    static void printNewAnnualAndSalarySup(String employeeName, int currentSalary, int salarySuppInPercent) {
        int newSalary = currentSalary * (100 + salarySuppInPercent) / 100;
        int yearSalarySupp = (newSalary - currentSalary) * 12;
        System.out.println(employeeName + " теперь получает " + newSalary + " рублей. Годовой доход вырос на " + yearSalarySupp + " рублей");
    }

}

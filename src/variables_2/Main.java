package variables_2;

public class Main {
    public static void main(String[] args) {
        //task1
        int valueOfInteger = 1000000;
        byte valueOfByte = 127;
        short valueOfShort = 255;
        long valueOfLong = 12556978L;
        float valueOfFloat = 1.25f;
        double valueOfDouble = 1.564;
        System.out.println("Значение переменной valueOfByte с типом byte равно " + valueOfByte);
        System.out.println("Значение переменной valueOfShort с типом short равно " + valueOfShort);
        System.out.println("Значение переменной valueOfInteger с типом int равно " + valueOfInteger);
        System.out.println("Значение переменной valueOfLong с типом long равно " + valueOfLong);
        System.out.println("Значение переменной valueOfFloat с типом float равно " + valueOfFloat);
        System.out.println("Значение переменной valueOfDouble с типом double равно " + valueOfDouble);

        //task2
        double a = 27.12;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;

        //task3
        int studentOfLyudmilaP = 23;
        int studentOfAnneS = 27;
        int studentOfCatherineA = 30;
        int sheetsOfPaper = 480;
        int totalStudents = studentOfLyudmilaP + studentOfAnneS + studentOfCatherineA;
        double sheetsPerStudent = (double) sheetsOfPaper / totalStudents; //в данном случае можно воспользоваться и int, т.к. результат целое число.
        System.out.println("На каждого ученика рассчитано " + sheetsPerStudent + " листов бумаги");

        //task4
        int performanceBottlePerTwoMinutes = 16;
        int minutes = 20;
        int days1 = 1;
        int days2 = 3;
        int month = 1;

        //конвертируем время и производительность в минуту
        int t2 = days1 * 1440; //1440 - колл-во минут в дне
        int t3 = days2 * 1440;
        int t4 = month * 30 * 1440; //если 30 дней в месяце
        int performanceBotPerMinute = performanceBottlePerTwoMinutes / 2;

        int performance1 = performanceBotPerMinute * minutes;
        System.out.println("За 20 минут машина произвела " + performance1 + " штук бутылок");
        int performance2 = performanceBotPerMinute * t2;
        System.out.println("За 1 день машина произвела " + performance2 + " штук бутылок");
        int performance3 = performanceBotPerMinute * t3;
        System.out.println("За 3 дня машина произвела " + performance3 + " штук бутылок");
        int performance4 = performanceBotPerMinute * t4;
        System.out.println("За месяц машина произвела " + performance4 + " штук бутылок");

        //task5
        int totalCan = 120;
        int canOfWhitePerClass = 2;
        int canOfBraunPerClass = 4;
        int classes = totalCan / (canOfBraunPerClass + canOfWhitePerClass);
        int totalWhite = classes * canOfWhitePerClass;
        int totalBraun = classes * canOfBraunPerClass;
        System.out.println("В школе, где " + classes + " классов, нужно " + totalWhite + " банок белой краски и " + totalBraun + " банок коричневой краски");

        //task6
        int gramPerKg = 1000;
        int quantityBanana = 5;
        double weightBanana = 80;
        int quantityMilk = 200;
        double weightMilk = 105;
        int quantityIceCream = 2;
        double weightIceCream = 100;
        int quantityEgg = 4;
        double weightEgg = 70;
        double totalWeightBanana = quantityBanana * weightBanana;
        double totalWeightMilk = quantityMilk * weightMilk / 100;
        double totalWeightIceCream = quantityIceCream * weightIceCream;
        double totalWeightEgg = quantityEgg * weightEgg;
        double totalWeightGram = totalWeightBanana + totalWeightMilk + totalWeightIceCream + totalWeightEgg;
        double totalWeightKg = totalWeightGram / gramPerKg;
        System.out.println("Вес спортзавтрака в граммах: " + totalWeightGram + ", вес спортзавтрака в кг: " + totalWeightKg);

        //task7
        int weightToResultKg = 7;
        int weightPerDay1 = 250;
        int weightPerDay2 = 500;
        int weightToResultGram = weightToResultKg * gramPerKg;
        int day1 = weightToResultGram / weightPerDay1;
        System.out.println("При потере " + weightPerDay1 + " г/день уйдет " + day1 + " дней.");
        int day2 = weightToResultGram / weightPerDay2;
        System.out.println("При потере " + weightPerDay2 + " г/день уйдет " + day2 + " дней.");
        int avgDay = (day1 + day2) / 2;
        System.out.println("Среднее кол-во дней на потерю веса: " + avgDay);
        //не однозначная трактовка. Если необходимо среднее кол-во дней при средней потере веса, то:
        int avgDay2 = (int) Math.ceil(weightToResultGram / ((double) (weightPerDay1 + weightPerDay2) / 2));
        System.out.println("Среднее кол-во дней на потерю веса: " + avgDay2);

        //task8
        int percent = 10;
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int monthPerYear = 12;

        int salaryMashaYearsBefore = salaryMasha * monthPerYear; //годовая зп до повышения
        float salaryMashaMonthAfter = salaryMasha * (1 + (percent / 100f)); //месячная зп после повышения
        float salaryMashaYearAfter = salaryMashaMonthAfter * monthPerYear; //годовая зп после повышения
        float deltaMasha = salaryMashaYearAfter - salaryMashaYearsBefore;
        System.out.println("Маша теперь получает " + salaryMashaMonthAfter + " рублей. Годовой доход вырос на " + deltaMasha + " рублей");
        int salaryDenisYearsBefore = salaryDenis * monthPerYear; //годовая зп до повышения
        float salaryDenisMonthAfter = salaryDenis * (1 + (percent / 100f)); //месячная зп после повышения
        float salaryDenisYearAfter = salaryDenisMonthAfter * monthPerYear; //годовая зп после повышения
        float deltaDenis = salaryDenisYearAfter - salaryDenisYearsBefore;
        System.out.println("Денис теперь получает " + salaryDenisMonthAfter + " рублей. Годовой доход вырос на " + deltaDenis + " рублей");
        int salaryKristinaYearsBefore = salaryKristina * monthPerYear; //годовая зп до повышения
        float salaryKristinaMonthAfter = salaryKristina * (1 + (percent / 100f)); //месячная зп после повышения
        float salaryKristinaYearAfter = salaryKristinaMonthAfter * monthPerYear; //годовая зп после повышения
        float deltaKristina = salaryKristinaYearAfter - salaryKristinaYearsBefore;
        System.out.println("Кристина теперь получает " + salaryKristinaMonthAfter + " рублей. Годовой доход вырос на " + deltaKristina + " рублей");
    }
}

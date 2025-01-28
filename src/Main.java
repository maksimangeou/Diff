public class Main {
    public static void main(String[] args) {
        //task1
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        //task2
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        //task3
        for (int i = 0; i < 17; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        //task4
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        //task5
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + "год является високосным");
        }

        //task6
        for (int i = 1; i <= 14; i++) {
            System.out.print(i * 7 + " ");
        }
        System.out.println();

        //task7
        int value = 1;
        for (int i = 0; i < 10; i++) {
            System.out.print(value + " ");
            value *= 2;
        }
        System.out.println();

        //task8
        int salaryPerMonth = 29000;
        int totalSum = 0;
        for (int i = 1; i <= 12; i++) {
            totalSum += salaryPerMonth;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalSum + " рублей");
        }
        System.out.println();

        //task9
        double totalSumPerCent = 0.0;
        for (int i = 1; i <= 12; i++) {
            totalSumPerCent += salaryPerMonth;
            totalSumPerCent += totalSumPerCent / 100;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + Math.ceil(totalSumPerCent * 100) / 100 + " рублей");
        }
        System.out.println();

        //task10
        for (int i = 1; i <= 10; i++) {
            int result = 2 * i;
            System.out.println("2*" + i + "=" + result);
        }
    }
}

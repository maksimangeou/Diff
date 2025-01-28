import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        //task1
        int sumPerMonth = 15000;
        int i = 0;
        int totalSumPerCent = 0;
        while (totalSumPerCent < 2459000) {
            totalSumPerCent = totalSumPerCent + totalSumPerCent / 100;
            totalSumPerCent = totalSumPerCent + sumPerMonth;
            i++;
        }
        System.out.println("Месяц " + i + ", сумма накоплений равна " + totalSumPerCent + " рублей");
        System.out.println();

        //task2
        int j = 0;
        while (j < 10) {
            j++;
            System.out.print(j + " ");
        }
        System.out.println();
        for (; j > 0; j--) {
            System.out.print(j + " ");
        }
        System.out.println();

        //task3
        int populationY = 12_000_000;
        int birthRate = 17;
        int mortalityRate = 8;
        int years = 10;
        int naturalGrowthRate = birthRate - mortalityRate;
        for (int k = 1; k <= years; k++) {
            int naturalGrowth = populationY * naturalGrowthRate / 1000;
            populationY = populationY + naturalGrowth;
            System.out.println("Год " + k + ", численность населения составляет " + populationY);
        }
        System.out.println();

        //task4
        int salaryPerMonth = 15000;
        double totalSalaryPerCent = 0.0;
        int sum = 12000000;
        int month = 0;
        int percent = 7;
        totalSalaryPerCent += salaryPerMonth;
        DecimalFormat df = new DecimalFormat("#");
        df.setMaximumFractionDigits(2);
        while (totalSalaryPerCent < sum) {
            totalSalaryPerCent += totalSalaryPerCent * percent / 100;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + df.format(totalSalaryPerCent) + " рублей");
        }
        System.out.println("Всего потребуется: " + month);
        System.out.println();

        //task6
        totalSalaryPerCent = 0.0;
        month = 0;
        totalSalaryPerCent += salaryPerMonth;
        while (totalSalaryPerCent < sum) {
            totalSalaryPerCent += totalSalaryPerCent * percent / 100;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + df.format(totalSalaryPerCent) + " рублей");
            }
        }
        System.out.println("Всего потребуется: " + month);
        System.out.println();

        //task7
        int firstFriday = 4;
        for (int n = firstFriday; n <= 31; n += 7) {
            System.out.println("Сегодня пятница, " + n + "-е число. Необходимо подготовить отчет");
        }

        //task8
        int yearNow = 2025;
        int periodBefore = 200;
        int yearBefore = yearNow - periodBefore;
        int periodAfter = 100;
        int yearAfter = yearNow + periodAfter;
        for (int q = 0; q <= yearAfter; q += 79) {
            if (q >= yearBefore) {
                System.out.println(q);
            }
        }
    }
}

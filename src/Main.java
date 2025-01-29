import java.text.DecimalFormat;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        //task1
        int[] arrPayout = new int[5];
        int sumPayout = 0;
        for (int i = 0; i < arrPayout.length; i++) {
            arrPayout[i] = i + ThreadLocalRandom.current().nextInt(1000 - i);
            System.out.print(arrPayout[i] + " ");
            sumPayout += arrPayout[i];
        }
        System.out.println();
        System.out.println("Сумма трат за месяц составила " + sumPayout + " рублей");
        System.out.println();

        //task2
        for (int i = 0; i < arrPayout.length; i++) {
            arrPayout[i] = i + ThreadLocalRandom.current().nextInt(1000 - i);
            System.out.print(arrPayout[i] + " ");
        }
        int tempMax = arrPayout[0];
        int tempMin = arrPayout[0];
        for (int i = 0; i < arrPayout.length; i++) {
            if (arrPayout[i] < tempMin) {
                tempMin = arrPayout[i];
            }
            if (arrPayout[i] > tempMax) {
                tempMax = arrPayout[i];
            }
        }
        System.out.println();
        System.out.println("Минимальная сумма трат за неделю составила " + tempMin + " рублей. " +
                "Максимальная сумма трат за неделю составила " + tempMax + " рублей");
        System.out.println();

        //task3
        int totalSum = 0;
        for (int i = 0; i < arrPayout.length; i++) {
            arrPayout[i] = i + ThreadLocalRandom.current().nextInt(1000 - i);
            System.out.print(arrPayout[i] + " ");
            totalSum += arrPayout[i];
        }
        double sumAvg = (double) totalSum / arrPayout.length;
        DecimalFormat df = new DecimalFormat("#");
        df.setMaximumFractionDigits(2);
        System.out.println();
        System.out.println("Средняя сумма трат за месяц составила " + df.format(sumAvg) + " рублей");
        System.out.println();

        //task4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = temp;
        }
        StringBuilder employeeName = new StringBuilder();
        for (int i = 0; i < reverseFullName.length; i++) {
            employeeName.append(reverseFullName[i]);
        }
        System.out.println(employeeName);
        System.out.println();
    }
}

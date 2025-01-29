import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //task1
        System.out.println(defineLeapYear(2024));
        System.out.println();
        //task2
        System.out.println(checkDevice(0, 2025));
        System.out.println();
        //task3
        int deliveryDistance = 700;
        int days = getDeliveryDay(deliveryDistance);
        if (days > 0) {
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Доставки нет.");
        }


    }

    public static String defineLeapYear(int year) {
        int beginYear = 1584;
        boolean isMultipleOfFour = year % 4 == 0;
        boolean isMultiplOfHundred = year % 100 != 0;
        boolean isMultiplOfFourHundred = year % 400 == 0;
        if (year < beginYear) {
            return "недостаточно данных для подсчета";
        }
        if (isMultipleOfFour && isMultiplOfHundred || isMultiplOfFourHundred) {
            return year + " год  - високосный";
        } else {
            return year + " год - не високосный";
        }
    }

    public static String checkDevice(int clientOS, int clientDeviceYear) {
        if (clientOS == 1 && clientDeviceYear < 2015) {
            return "Установите облегченную версию приложения для Android по ссылке";
        }
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            return "Установите версию приложения для Android по ссылке";
        }
        if (clientOS == 0 && clientDeviceYear < 2015) {
            return "Установите облегченную версию приложения для iOS по ссылке";
        }
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            return "Установите версию приложения для iOS по ссылке";
        } else {
            return "Мобильное устройство не опознано";
        }
    }

    public static int getDeliveryDay(int distance) {
        int day;
        if (distance <= 20) {
            return day = 1;
        }
        if (distance <= 60) {
            return day = 2;
        }
        if (distance <= 100) {
            return day = 3;
        }
        return 0;
    }
}

package conditional_2;

public class Main {
    public static void main(String[] args) {
        //task1
        int clientOS = 0;
        //vers1
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Мобильное устройство не опознано");
        }
        //vers2
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Мобильное устройство не опознано");
                break;

        }

        //task2
        int clientDeviceYear = 2015;
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Мобильное устройство не опознано");
        }

        //task3
        int year = 2200;
        int beginYear = 1584;
        //vers1
        boolean isMultipleOfFour = year % 4 == 0;
        boolean isMultiplOfHundred = year % 100 != 0;
        boolean isMultiplOfFourHundred = year % 400 == 0;
        if (year < beginYear) {
            System.out.println("недостаточно данных для подсчета");
        } else if (isMultipleOfFour && isMultiplOfHundred || isMultiplOfFourHundred) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
        //vers2
        if (year < beginYear) {
            System.out.println("недостаточно данных для подсчета");
        } else if (year % 4 != 0) {
            System.out.println("Год не високосный");
        } else if (year % 400 == 0) {
            System.out.println("Год високосный");
        } else if (year % 100 == 0) {
            System.out.println("Год не високосный");
        } else {
            System.out.println("Год високосный");
        }


        //task4
        int deliveryDistance = 105;
        int day = 0;
        if (deliveryDistance <= 20) {
            day = 1;
            System.out.println("Дней доставки: " + day);
        } else if (deliveryDistance <= 60) {
            day = 2;
            System.out.println("Дней доставки: " + day);
        } else if (deliveryDistance <= 100) {
            day = 3;
            System.out.println("Потребуется дней: " + day);
        } else {
            System.out.println("Нет доставки");
        }

        //task5
        int monthNumber = 13;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Месяц с номером " + monthNumber + " не существует");
        }

    }
}

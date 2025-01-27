package conditional_1;

public class Main {
    public static void main(String[] args) {
        //task1
        int age = 1;
        if (age >= 18) {
            System.out.println("Возраст человека " + age + " лет. Он совершеннолетний");
        } else {
            System.out.println("Возраст человека " + age + " лет. Он не достиг совершеннолетия. Нужно немного подождать");
        }

        //task2
        int temperature = 6;
        if (temperature > 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }

        //task3
        int speed = 50;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }

        //task4
        int ages = 25;
        if (ages >= 2 && ages <= 6) {
            System.out.println("Если возраст человека равен " + ages + ", то ему нужно ходить в сад");
        } else if (ages >= 7 && ages <= 17) {
            System.out.println("Если возраст человека равен " + ages + ", то ему нужно ходить в школу");
        } else if (ages >= 18 && ages <= 24) {
            System.out.println("Если возраст человека равен " + ages + ", то ему нужно ходить в университет");
        } else  {
            System.out.println("Если возраст человека равен " + ages + ", то ему нужно ходить на работу");
        }

        //task5
        int ageOnRides = 25;
        if (ageOnRides < 5) {
            System.out.println("Если возраст ребенка равен "+ ageOnRides +", то ему нельзя кататься на аттракционе");
        } else if (ageOnRides < 14) {
            System.out.println("Если возраст ребенка равен "+ ageOnRides +", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен "+ ageOnRides +", то ему можно кататься на аттракционе без сопровождения взрослого)");
        }

        //task6
        int placesInWagon = 102;
        int seatInWagon = 60;
        int ticket = 102;
        if (ticket <= seatInWagon) {
            System.out.println("Сидячие места есть");
        } else if (ticket <= placesInWagon) {
            System.out.println("Стоячие места есть");
        } else {
            System.out.println("Вагон полностью забит");
        }

        //task7
        int one = 12;
        int two = 11;
        int three = 10;
        if (one > two && one > three) {
            System.out.println(one);
        } else if (two > three){
            System.out.println(two);
        } else {
            System.out.println(three);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        //task1
        StringBuilder strConcatenation = new StringBuilder();
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = strConcatenation.append(lastName).append(" ").append(firstName).append(" ").append(middleName).toString();
        System.out.println("Ф.И.О. сотрудника - " + fullName);

        //task2
        fullName = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName);

        //task3
        fullName = "Иванов Семён Семёнович";
        String fullNameUpper = fullName.replace('ё', 'е');
        System.out.println("Данные Ф. И. О. сотрудника — " + fullNameUpper);
    }
}

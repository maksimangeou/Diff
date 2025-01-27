package variables_1;

public class Main {
    public static void main(String[] args) {
        //task 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //task 2
        dog +=4;
        cat +=4;
        paper +=4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //task 3
        dog -= 3.5;
        cat -= 1.6;
        paper -=7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //task4
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /=7;
        System.out.println(friend);

        //task 5
        var frog = 3.5;
        System.out.println(frog);
        frog *=10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog +=4;
        System.out.println(frog);

        //task 6
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalWeight = firstBoxerWeight+secondBoxerWeight;
        System.out.println(totalWeight);
        var weightDifference = secondBoxerWeight-firstBoxerWeight;
        System.out.println(weightDifference);
        //task 7
        var remains = secondBoxerWeight%firstBoxerWeight;
        System.out.println(remains);

        //task8
        var totalTime = 640;
        var timePerMan = 8;
        var countOfEmployers = totalTime/timePerMan;
        System.out.println("Всего работников в компании - "+countOfEmployers+" человек");
        var newEmployers = 94;
        countOfEmployers+=newEmployers;
        var newTotalTime = timePerMan*countOfEmployers;
        System.out.println("Если в компании работает "+countOfEmployers+" человек, то всего "+newTotalTime+
                " часов работы может быть поделено между сотрудниками");

    }
}
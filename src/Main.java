import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //task1
        int size = 3;
        int[] arr1 = new int[size];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i + 1;
        }
        double[] arr2 = {1.57, 7.654, 9.986};
        char[] arr3 = new char[size];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = (char) (i + 'a');
        }

        //task2
        String resultArr1 = Arrays.toString(arr1).replace("[", "").replace("]", "");
        System.out.println(resultArr1);
        String resultArr2 = Arrays.toString(arr2).replace("[", "").replace("]", "");
        System.out.println(resultArr2);
        String resultArr3 = Arrays.toString(arr3).replace("[", "").replace("]", "");
        System.out.println(resultArr3);

        //task3
        for (int i = 0; i < arr1.length / 2; i++) {
            int tempInt = arr1[i];
            arr1[i] = arr1[size - 1 - i];
            arr1[size - 1 - i] = tempInt;

            double tempDouble = arr2[i];
            arr2[i] = arr2[size - 1 - i];
            arr2[size - 1 - i] = tempDouble;

            char tempChar = arr3[i];
            arr3[i] = arr3[size - 1 - i];
            arr3[size - 1 - i] = tempChar;
        }
        String resultArrHelp1 = Arrays.toString(arr1).replace("[", "").replace("]", "");
        System.out.println(resultArrHelp1);
        String resultArrHelp2 = Arrays.toString(arr2).replace("[", "").replace("]", "");
        System.out.println(resultArrHelp2);
        String resultArrHelp3 = Arrays.toString(arr3).replace("[", "").replace("]", "");
        System.out.println(resultArrHelp3);


        //task4
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i + 1; //присвоение элементами массива значений i+1
            if (arr1[i] % 2 != 0) {
                arr1[i] += 1;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}

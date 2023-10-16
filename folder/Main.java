package com.company;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

/*
public class Main {
    public static void main(String[] args) {
//Task_1
        System.out.println("Vvedite razmer massiva");
        Scanner scanner = new Scanner(System.in);
        String num_0 = scanner.nextLine();
        double num_1 = Double.parseDouble(num_0);
        int num = (int) (Math.round(num_1));
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = (int) (Math.random() * 77);
        }
        String lineArray = Arrays.toString(array);
        System.out.println("Vash massiv v pryamom poryadke - " + lineArray);
        System.out.print("Vash massiv v obratnom poryadke - ");
        for (int i = num - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
 */
/*
public class Main {
    public static void main(String[] args) {
//Task_2
        System.out.println("Vvedite razmer massiva");
        Scanner scanner = new Scanner(System.in);
        String num_0 = scanner.nextLine();
        double num_1 = Double.parseDouble(num_0);
        int num = (int) (Math.round(num_1));
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = (int) (Math.random() * 77);
        }
        String lineArray = Arrays.toString(array);
        System.out.println("Vash massiv  - " + lineArray);
        Arrays.sort(array);
        System.out.println("Maximalni element massiva - " + array[num - 1]);
        System.out.println("Minimalni element massiva - " + array[0]);
    }
}
 */
/*
public class Main {
    public static void main(String[] args) {
//Task_3
        System.out.println("Vvedite razmer massiva");
        Scanner scanner = new Scanner(System.in);
        String num_0 = scanner.nextLine();
        double num_1 = Double.parseDouble(num_0);
        int num = (int) (Math.round(num_1));
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = (int) (Math.random() * 77);
        }
        String lineArray = Arrays.toString(array);
        System.out.println("Vash massiv  - " + lineArray);
        int max = 0;
        int element = 0;
        for (int i = 0; i < num; i++) {
            if (array[i] > max) {
                max = array[i];
                element = i;
            }
        }
        int element_min = 0;
        int min = max;
        for (int i = 0; i < num; i++) {
            if (array[i] < min) {
                min = array[i];
                element_min = i;
            }
        }
        System.out.println("Index Maximal'nogo elementa raven = " + element);
        System.out.println("Index Minimal'nogo elementa raven = " + element_min);
    }
}
 */
/*
public class Main {
    public static void main(String[] args) {
//Task_4
        System.out.println("Vvedite razmer massiva");
        Scanner scanner = new Scanner(System.in);
        String num_0 = scanner.nextLine();
        double num_1 = Double.parseDouble(num_0);
        int num = (int) (Math.round(num_1));
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = (int) (Math.random() * 3);
        }
        String lineArray = Arrays.toString(array);
        System.out.println("Vash massiv  - " + lineArray);
        int zero = 0;
        for (int i = 0; i < num; i++) {
            if (array[i] == 0) {
                zero++;
            }
        }
        if (zero == 0) {
            System.out.println("V massive netu nylevix elementov ");
        }
        if (zero >= 1) {
            System.out.println("Kol-vo nylevix elementov " + zero);
        }
    }
}
 */
/*
public class Main {
    public static void main(String[] args) {
//Task_5
        System.out.println("Vvedite razmer massiva");
        Scanner scanner = new Scanner(System.in);
        String num_0 = scanner.nextLine();
        double num_1 = Double.parseDouble(num_0);
        int num = (int) (Math.round(num_1));
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = (int) (Math.random() * 77);
        }
        String lineArray = Arrays.toString(array);
        System.out.println("Vash massiv  - " + lineArray);
        for (int i = 0; i < num / 2; i++) {
            int a = array[i];
            array[i] = array[num - i - 1];
            array[num - i - 1] = a;
        }
        String lineArray1 = Arrays.toString(array);
        System.out.println("Vash izmenenni massiv  - " + lineArray1);
    }
}
 */
/*
public class Main {
    public static void main(String[] args) {
//Task_6
        System.out.println("Vvedite razmer massiva");
        Scanner scanner = new Scanner(System.in);
        String num_0 = scanner.nextLine();
        double num_1 = Double.parseDouble(num_0);
        int num = (int) (Math.round(num_1));
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = (int) (Math.random() * 77);
        }
        Arrays.sort(array);
        String lineArray = Arrays.toString(array);
        System.out.println("Vash massiv  - " + lineArray);
        boolean ysl = true;
        for (int i = 0; i < num - 1; i++) {
            if (array[i] > array[i + 1]) {
                ysl = false;
                break;
            }
        }
        if (ysl == true) {
            System.out.println("Massiv posledovatelen");
        } else {
            System.out.println("Massiv ne posledovatelen");
        }
    }
}
 */
/*
public class Main {
    public static void main(String[] args) {
//Task_7
        int[] array = {7, 9, 8};
        for (int line : array) {
            System.out.print(line + " ");
        }
        int arrayNum = 100 * array[0] + 10 * array[1] + array[2];
        System.out.println(" ");
        if (array[2] == 9) {
            String numberStr = String.valueOf(arrayNum + 1);
            int newArray = Integer.parseInt(numberStr);
            System.out.println(newArray);
            int[] array_2 = {newArray / 100 % 10, newArray / 10 % 10, newArray % 10};
            for (int line : array_2) {
                System.out.print(line + " ");
            }
        } else {
            String numberStr1 = String.valueOf(arrayNum);
            String s1 = "1";
            String newString = numberStr1 + s1;
            int newArray2 = Integer.parseInt(newString);
            System.out.println(newArray2);
            int[] array_22 = {newArray2 / 1000, newArray2 / 100 % 10, newArray2 / 10 % 10, newArray2 % 10};
            for (int line : array_22) {
                System.out.print(line + " ");
            }
        }
    }
}
 */




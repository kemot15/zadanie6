package zadanie6.zad2;

import java.util.Scanner;

public class Array {
    public void setArray (int[] array){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe 1");
        array[0] = scanner.nextInt();
        System.out.println("Podaj liczbe 2");
        array[1] = scanner.nextInt();
        System.out.println("Podaj liczbe 3");
        array[2] = scanner.nextInt();
        System.out.println("Podaj liczbe 4");
        array[3] = scanner.nextInt();
        System.out.println("Podaj liczbe 5");
        array[4] = scanner.nextInt();
        scanner.close();
    }

    public String showArray(int[] array){
        return "Suma liczb: " + (array[0] + array[2] + array[4]);
    }


}

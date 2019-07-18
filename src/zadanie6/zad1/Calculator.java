package zadanie6.zad1;

import java.util.Scanner;

public class Calculator {

    public int[] getNumbers(){
        int[] num = new int[2];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe");
        num[0] = scanner.nextInt();
        System.out.println("Podaj druga liczbe ");
        num[1] = scanner.nextInt();
        scanner.close();
        return  num;
    }

    public String checkNumbers(int[] num){
        if (num[0]>num[1])
            return "Suma liczb " + (num[0]+num[1]);
        else if (num[0]<num[1])
            return "Iloczyn liczb " + num[0]*num[1];
        else
            return "Kwadrat liczb " + num[0]*num[1];
        //return num[0]>num[1]?num[0]+num[1]:num[0]*num[1];
    }


}

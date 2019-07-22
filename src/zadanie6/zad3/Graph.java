package zadanie6.zad3;

import java.util.Scanner;

public class Graph {
    private int x;
    private int y;

    public void setPoints (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj x");
        x = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj y");
        y = scanner.nextInt();
        scanner.nextLine();
        scanner.close();
    }

    public String checkQuarter (){
        if (x>0 && y>0)
            return "I";
        if (x>0 && y<0)
            return "II";
        if (x<0 && y<0)
            return "III";
        if (x<0 && y>0)
            return "IV";
        else
            return "os";
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String showPoint (){
        return x +", " + y;
    }
}

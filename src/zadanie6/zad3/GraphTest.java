package zadanie6.zad3;

import java.util.Scanner;

public class GraphTest {
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.setPoints();
        System.out.println("Punkt (" + graph.getX() +", " + graph.getY() +") lezy w " + graph.checkQuarter() + "  cwiartce ukladu wspolrzednych");
        System.out.println("Punkt (" + graph.showPoint() +") lezy w " + graph.checkQuarter() + "  cwiartce ukladu wspolrzednych");
    }
}

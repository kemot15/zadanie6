package zadanie6.zad3;

import java.util.Scanner;

public class GraphTest {
    public static void main(String[] args) {
        Graph graph = new Graph();
        Point point = new Point();
        graph.setPoints();
        System.out.println("Punkt (" + point.showPoint(graph.getX(), graph.getY()) +") lezy w " + graph.checkQuarter() + " cwiartce ukladu wspolrzednych");
    }
}

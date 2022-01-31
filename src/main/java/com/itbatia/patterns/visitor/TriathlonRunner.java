package main.java.com.itbatia.patterns.visitor;

public class TriathlonRunner {
    public static void main(String[] args) {
        Sportsmen russia = new RussianSportsman();
        Sportsmen france = new FrenchSportsmen();
        Sportsmen germany = new GermanSportsman();

        Triathlon triathlon = new Triathlon();

        System.out.println("Russian sportsman: ");
        triathlon.beExecute(russia);
        System.out.println("-----------------------------------------------");
        System.out.println("French sportsmen: ");
        triathlon.beExecute(france);
        System.out.println("-----------------------------------------------");
        System.out.println("German sportsmen: ");
        triathlon.beExecute(germany);
        System.out.println("-----------------------------------------------");
    }
}

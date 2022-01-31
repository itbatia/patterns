package main.java.com.itbatia.patterns.iterator;

public class BelarusInfo {
    public static void main(String[] args) {
        String[] regions = {"Vitebsk", "Mogilev", "Brest", "Minsk", "Gomel", "Grodno" };

        Country belarus = new Country("Belarus", 207_600, 9_500_000, regions);
        Iterator iterator = belarus.getIterator();

        System.out.println("Country: " + belarus.getNameCountry());
        System.out.println("Square: " + belarus.getSquare() + " square kilometers");
        System.out.println("Population: " + belarus.getPopulation() + " people");
        System.out.print("Regions: ");

        while (iterator.hasNext()){
            System.out.print(iterator.next().toString() + " ");
        }
    }
}

package main.java.com.itbatia.patterns.iterator;

public class Country implements Collection {

    private String nameCountry;
    private int square;
    private int population;
    private String[] regions;

    public Country(String nameCountry, int square, int population, String[] regions) {
        this.nameCountry = nameCountry;
        this.square = square;
        this.population = population;
        this.regions = regions;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry() {
        this.nameCountry = nameCountry;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String[] getRegions() {
        return regions;
    }

    public void setRegions(String[] regions) {
        this.regions = regions;
    }

    @Override
    public Iterator getIterator() {
        return new RegionsIterator();
    }

    private class RegionsIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if (index < regions.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return regions[index++];
        }
    }
}

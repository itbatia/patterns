package main.java.com.itbatia.patterns.mediator;

import java.util.Map;

public interface Supplier extends Client {
    Map<String, Integer> supplies(String product, Integer amount);
}

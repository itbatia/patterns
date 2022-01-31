package main.java.com.itbatia.patterns.mediator;

import java.util.Map;

public interface Warehouse {
    void sendEmail(Map<String, Integer> productList, Client client);
}

package main.java.com.itbatia.patterns.mediator;

import java.util.Map;

public interface Store extends Client {
    Map<String, Integer> sale(String product, Integer amount);

    void getProductList();
}

package main.java.com.itbatia.patterns.mediator;

import java.util.Map;

public class OnlineStore implements Store {
    private Warehouse warehouse;
    private String name;
    private Map<String, Integer> productList;

    public OnlineStore(Warehouse warehouse, String name, Map<String, Integer> productList) {
        this.warehouse = warehouse;
        this.name = name;
        this.productList = productList;
    }

    public String getName() {
        return name;
    }

    @Override
    public Map<String, Integer> sale(String product, Integer amount) {
        System.out.printf("Store %s sale: %s %s.\n", this.getName(), amount, product);
        int currentAmount = productList.get(product);
        int newAmount = currentAmount - amount;
        productList.put(product, newAmount);
        warehouse.sendEmail(productList, this);
        return productList;
    }

    @Override
    public void getEmail(Map<String, Integer> productList) {
        this.productList = productList;
    }

    @Override
    public void getProductList() {
        System.out.printf("Current number of clothes in store %s: %s\n", this.getName(), productList);
    }
}

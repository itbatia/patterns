package main.java.com.itbatia.patterns.mediator;

import java.util.Map;

public class ClothingSupplier implements Supplier {
    Warehouse warehouse;
    String name;
    Map<String, Integer> productList;

    public ClothingSupplier(Warehouse warehouse, String name, Map<String, Integer> productList) {
        this.warehouse = warehouse;
        this.name = name;
        this.productList = productList;
    }

    public String getName() {
        return name;
    }

    @Override
    public Map<String, Integer> supplies(String product, Integer amount) {
        System.out.printf("Supplier %s brought: %s %s to the warehouse\n", this.getName(), amount, product);
        int currentAmount = productList.get(product);
        int newAmount = currentAmount + amount;
        productList.put(product, newAmount);
        warehouse.sendEmail(productList, this);
        return productList;
    }

    @Override
    public void getEmail(Map<String, Integer> productList) {
        this.productList = productList;
    }
}




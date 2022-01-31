package main.java.com.itbatia.patterns.mediator;

import java.util.HashMap;
import java.util.Map;

public class SalesTest {
    public static void main(String[] args) {

        Map<String, Integer> productList = new HashMap<>();
        productList.put("dress", 10);
        productList.put("pants", 10);
        productList.put("shirt", 10);

        ClothesWarehouse warehouse = new ClothesWarehouse(productList);

        Store store1 = new OnlineStore(warehouse, "1", productList);
        Store store2 = new OnlineStore(warehouse, "2", productList);
        Store store3 = new OnlineStore(warehouse, "3", productList);
        Supplier supplier1 = new ClothingSupplier(warehouse, "Zara", productList);
        Supplier supplier2 = new ClothingSupplier(warehouse, "Next", productList);

        warehouse.addClient(store1);
        warehouse.addClient(store2);
        warehouse.addClient(store3);
        warehouse.addClient(supplier1);
        warehouse.addClient(supplier2);

        store1.sale("dress", 2);
        store1.getProductList();
        store2.getProductList();
        store3.getProductList();
        supplier1.supplies("shirt", 30);
        store1.getProductList();
        store2.getProductList();
        store3.getProductList();
        supplier2.supplies("pants", 120);
        store1.sale("shirt", 35);
        store1.getProductList();
        store2.getProductList();
        store3.getProductList();
    }
}

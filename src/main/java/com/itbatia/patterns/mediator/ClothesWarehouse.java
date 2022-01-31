package main.java.com.itbatia.patterns.mediator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ClothesWarehouse implements Warehouse {
    ClothingSupplier supplier;
    List<Client> clients = new ArrayList<>();
    Map<String, Integer> productList;

    public ClothesWarehouse(Map<String, Integer> productList) {
        this.productList = productList;
    }

    public void setSupplier(ClothingSupplier supplier) {
        this.supplier = supplier;
    }

    public void addClient(Client client) {
        this.clients.add(client);
    }

    @Override
    public void sendEmail(Map<String, Integer> productList, Client client) {
        for (Client s : clients) {
            if (s != client) {
                s.getEmail(productList);
            }
        }
    }
}

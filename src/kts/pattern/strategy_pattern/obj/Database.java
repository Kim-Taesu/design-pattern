package kts.pattern.strategy_pattern.obj;

import java.util.HashMap;

public class Database {

    private static Database database = new Database();


    private Database() {
        System.out.println("database init..");
    }

    public static Database getInstance() {
        return database;
    }

    private HashMap<Integer, Client> clientData = new HashMap<>();
    private HashMap<Integer, Product> productData = new HashMap<>();

    public HashMap<Integer, Client> getClientData() {
        return clientData;
    }

    public HashMap<Integer, Product> getProductData() {
        return productData;
    }

    public Integer getUserId(String userName) {
        for (Integer integer : clientData.keySet()) {
            if (clientData.get(integer).getName().equals(userName)) {
                return integer;
            }
        }
        return -1;
    }
}

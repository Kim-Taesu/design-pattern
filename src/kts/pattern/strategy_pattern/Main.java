package kts.pattern.strategy_pattern;

import kts.pattern.strategy_pattern.obj.Client;
import kts.pattern.strategy_pattern.obj.Database;
import kts.pattern.strategy_pattern.obj.Product;
import kts.pattern.strategy_pattern.strategy.ByCard;
import kts.pattern.strategy_pattern.strategy.ByCash;
import kts.pattern.strategy_pattern.strategy.Strategy;

import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static Map<Integer, Product> productData;
    private static Map<Integer, Client> clientData;
    private static Database database = Database.getInstance();

    private static Context context = new Context();
    private static Strategy strategy;

    public static void main(String[] args) {
        initDatabase();
        while (!context.isClosed()) {
            clientData.keySet().forEach(c -> {
                System.out.println(clientData.get(c).toString());
            });
            int cost;
            System.out.println("\n구매 물품 번호를 입력하세요");
            productData.keySet().forEach(product -> {
                System.out.println(product + "번 " + productData.get(product).toString());
            });
            int choice = Integer.parseInt(scan.nextLine());
            cost = productData.get(choice).getPrice();
            System.out.println("구매 물품 수 입력");
            int count = Integer.parseInt(scan.nextLine());
            context.setTotalCost(cost * count);

            System.out.println("구매 방법(전략) 선택\n" +
                    "1. 현금\n" +
                    "2. 카드");
            String paymentStrategy = scan.nextLine();

            if (paymentStrategy.equals("1")) {
                strategy = new ByCash();
            } else {
                strategy = new ByCard();
            }

            if (strategy.execute(context.getTotalCost())) {
                System.out.println("결제 완료");
            } else {
                System.out.println("결제 실패(잔액 부족 or 사용자 불일치)");
            }

        }
    }

    private static void initDatabase() {
        productData = database.getProductData();
        productData.put(productData.size() + 1, new Product("item 1", 1000));
        productData.put(productData.size() + 1, new Product("item 2", 2000));
        productData.put(productData.size() + 1, new Product("item 3", 3000));

        clientData = database.getClientData();
        clientData.put(clientData.size() + 1, new Client("kts", 10000, 0));
        clientData.put(clientData.size() + 1, new Client("phg", 10000, 10000));
    }
}

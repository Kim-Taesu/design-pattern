package kts.pattern.strategy_pattern.strategy;

import kts.pattern.strategy_pattern.obj.Client;
import kts.pattern.strategy_pattern.obj.Database;

import java.util.HashMap;
import java.util.Scanner;

public class ByCash implements Strategy {
    private Database database = Database.getInstance();
    private HashMap<Integer, Client> clientData = database.getClientData();
    private Scanner scan = new Scanner(System.in);

    @Override
    public boolean execute(int paymentAmount) {
        System.out.println("사용자 이름 입력");
        String userName = scan.nextLine();

        Integer userId = database.getUserId(userName);

        if (clientData.containsKey(userId)) {
            Client client = clientData.get(userId);
            int userCash = client.getCash();
            if (userCash < paymentAmount) {
                System.out.println("현금 잔액 부족");
                return false;
            } else {
                System.out.println("결제 진행..");
                client.setCash(userCash - paymentAmount);
                System.out.println("결제 완료!");
                return true;
            }
        } else {
            System.out.println("일치하는 id 없음");
            return false;
        }
    }

}

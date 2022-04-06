package task6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        Map<User,BankAccount> userBankAccountMap = new HashMap<>();
                User user1 = new User("Azat","Ibraev");
                User user2 = new User("Dilbara","Asanalieva");
                User user3 = new User("Tologon","Tekebaev");
                User user4 = new User("Adilet","Jumakadyrov");
                User user5 = new User("Altynbek","Altynbekov");
                User user6 = new User("Zahid","Zahitov");
                User user7 = new User("Kynzaada","Abdraeva");
                User user8 = new User("Bekjan","Esenov");
                User user9 = new User("Nurgazy","Isaev");
                User user10 = new User("Seiitbek","Narynbaev");

                BankAccount bankAccount1 = new BankAccount(10000);
                BankAccount bankAccount2 = new BankAccount(15000);
                BankAccount bankAccount3 = new BankAccount(20000);
                BankAccount bankAccount4 = new BankAccount(25000);
                BankAccount bankAccount5 = new BankAccount(30000);
                BankAccount bankAccount6 = new BankAccount(35000);
                BankAccount bankAccount7 = new BankAccount(40000);
                BankAccount bankAccount8 = new BankAccount(45000);
                BankAccount bankAccount9 = new BankAccount(50000);
                BankAccount bankAccount10 = new BankAccount(55000);

                userBankAccountMap.put(user1,bankAccount1);
                userBankAccountMap.put(user2,bankAccount2);
                userBankAccountMap.put(user3,bankAccount3);
                userBankAccountMap.put(user4,bankAccount4);
                userBankAccountMap.put(user5,bankAccount5);
                userBankAccountMap.put(user6,bankAccount6);
                userBankAccountMap.put(user7,bankAccount7);
                userBankAccountMap.put(user8,bankAccount8);
                userBankAccountMap.put(user9,bankAccount9);
                userBankAccountMap.put(user10,bankAccount10);

                transaction(userBankAccountMap,user1,bankAccount1,5000);

    }
     private static void transaction(Map map, User user, BankAccount bankAccount, int money) {
             bankAccount = (BankAccount) map.get(user);
             System.out.println("Amount before transaction: \n"+user+" "+bankAccount);
             bankAccount.takeBalance(money);
             System.out.println("Amount after transaction: \n"+user+" "+bankAccount);
    }
}

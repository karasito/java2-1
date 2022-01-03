public class Main {
    public static void main(String[] args) {
        int userAccount = 100; // Счет пользователя
        int receiptOofMoney = 1500; // Поступление денег
        int fullBonusAmount = 100; // Полная сумма бонуса
        int numberOfbonuses = 1; // Количество бонусов
        int check = userAccount + receiptOofMoney; //Проверка поступлений на счет
        boolean bonus = receiptOofMoney > 1000;
        if (receiptOofMoney > 1000) {
            int FinalBonus = userAccount + receiptOofMoney + (receiptOofMoney / 100) * numberOfbonuses;
            System.out.println("Счет с бонусами: " + FinalBonus);

        } else {
            int finalBonus = userAccount + receiptOofMoney;
            System.out.println("Счет без бонусов: " + finalBonus);
        }


    }
}

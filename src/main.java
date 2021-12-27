public class main {
    public static void main (String[] args) {
        int UserAccount = 100 ; // Счет пользователя
        int  ReceiptOofMoney = 1500 ; // Поступление денег
        int fullBonusAmount = 100 ; // Полная сумма бонуса
        int numberOfbonuses = 1 ; // Количество бонусов
        int check = UserAccount + ReceiptOofMoney ; //Проверка поступлений на счет
        boolean bonus = ReceiptOofMoney > 1000 ;
        if (ReceiptOofMoney > 1000)  {
            int FinalBonus = UserAccount + ReceiptOofMoney + (ReceiptOofMoney / 100) * numberOfbonuses    ;
            System.out.println("Счет с бонусами: " + FinalBonus ) ;

        }
        else {
            int FinalBonus = UserAccount + ReceiptOofMoney   ;
            System.out.println("Счет без бонусов: " + FinalBonus) ;
        }


    }
}
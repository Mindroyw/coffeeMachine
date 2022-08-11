import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму: ");
        int moneyAmount = scanner.nextInt();
        String[] products = new String[4];
        products[0] = "капучино";
        products[1] = "латте";
        products[2] = "эспрессо";
        products[3] = "вода";

        //========================================================

        int cappucinoPrice = 180;
        int lattePrice = 120;
        int espressoPrice = 80;
        int waterPrice = 20;

        if (moneyAmount >= cappucinoPrice)
        {
            System.out.println("[1] Вы можете купить капучино 180р.");
        }
        if (moneyAmount >= lattePrice)
        {
            System.out.println("[2] Вы можете купить латте 120р.");
        }
        if (moneyAmount >= espressoPrice)
        {
            System.out.println("[3] Вы можете купить эспрессо 80р.");
        }
        if (moneyAmount >= waterPrice)
        {
            System.out.println("[4] Вы можете купить воду 20р.");
        }else{
            System.out.println("У вас недостаточно средств");
        }

        //========================================================

        System.out.print("Введите цифру товара, который хотите купить: ");
        int selectedProduct = scanner.nextInt();
        if (selectedProduct == 1 && moneyAmount >= 180) //выбираем капучинно
        {
            System.out.print("Вы купили " + products[0]+ ".");
            System.out.println(" Приятного дня!");
            moneyAmount = moneyAmount - cappucinoPrice;
            if (moneyAmount > 0){
                System.out.println("Ваша сдача: " + moneyAmount);
            }
        }
        if (selectedProduct == 2 && moneyAmount >= 120) //выбираем латте
        {
            System.out.print("Вы купили " + products[1]+ ".");
            System.out.println(" Приятного дня!");
            moneyAmount = moneyAmount - lattePrice;
            if (moneyAmount > 0){
                System.out.println("Ваша сдача: " + moneyAmount);
            }
        }
        if (selectedProduct == 3 && moneyAmount >= 80) //выбираем эспрессо
        {
            System.out.print("Вы купили " + products[2]+ ".");
            System.out.println(" Приятного дня!");
            moneyAmount = moneyAmount - espressoPrice;
            if (moneyAmount > 0){
                System.out.println("Ваша сдача: " + moneyAmount);
            }
        }
        if (selectedProduct == 4 && moneyAmount >= 20) // выбираем воду
        {
            System.out.print("Вы купили " + products[3]+ ".");
            System.out.println(" Приятного дня!");
            moneyAmount = moneyAmount - waterPrice;
            if (moneyAmount > 0){
                System.out.println("Ваша сдача: " + moneyAmount);
            }
        }
        if (selectedProduct > 4 || selectedProduct < 1)
        {
            System.out.println("Неверный номер!");
        }

        //========================================================
    }
}
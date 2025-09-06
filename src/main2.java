import java.util.Scanner;

public class main2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя пользователя:");
        String name = scanner.nextLine();
        PersonAccount user = new PersonAccount(name);

        System.out.println("Хотите открыть счёт в RUB?");
        System.out.println("1 - Да");
        System.out.println("2 - Нет");
        int command = scanner.nextInt();
        if (command == 1) {
            user.rubAccount = new Account();
        }

        System.out.println("Хотите открыть счёт в USD?");
        System.out.println("1 - Да");
        System.out.println("2 - Нет");
        command = scanner.nextInt();
        if (command == 1) {
            user.usdAccount = new Account();
        }

        System.out.println("Хотите открыть счёт в EUR?");
        System.out.println("1 - Да");
        System.out.println("2 - Нет");
        command = scanner.nextInt();
        if (command == 1) {
            user.eurAccount = new Account();
        }

        System.out.println("Поздравляем, аккаунт для пользователя " + user.name + " создан.");
        System.out.println("Открытые счета:");
        if (user.rubAccount != null) {
            System.out.println("- RUB");
        }
        if (user.usdAccount != null) {
            System.out.println("- USD");
        }
        if (user.eurAccount != null) {
            System.out.println("- EUR");
        }
    }
}

class PersonAccount {
    String name;
    Account rubAccount;
    Account usdAccount;
    Account eurAccount;

    PersonAccount(String userName) {
        this.name = userName;
    }
}

class Account {
    double balance;
    Account() {
        this.balance = 0.0;
    }
}
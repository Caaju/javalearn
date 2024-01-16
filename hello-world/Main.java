import java.util.Locale;
import java.util.Scanner;

import Entities.Account;
import Entities.Product;
import Entities.Room;
import Entities.Student;

/**
 * MainTV
 */
public class Main {

    public static void main(String[] args) {
        // exercise01();
        // exerciseA301();
        // exerciseA302();
        // exerciseA303();
        // exerciseA801();
        // exerciseA901();
        exerciseA1001();
    }

    static void exerciseA1001(){
        Scanner sc=new Scanner(System.in);

        Room[] rooms=new Room[10];

        System.out.print("How many rooms will be rented? ");
        int roomsRented=sc.nextInt();
        
        for (int i = 0; i < roomsRented; i++) {
            System.out.println();
            System.out.println("Rent #"+(i+1));
            sc.nextLine();
            System.out.print("Name: ");
            String name=sc.nextLine();
            System.out.print("Email: ");
            String email=sc.nextLine();
            System.out.print("Room: ");
            int room=sc.nextInt();

            rooms[room]=new Room();
            rooms[room].rented(new Student(name, email));
        }

        System.out.println("\nBusy rooms:");
        for (int i = 0; i < rooms.length; i++) {
            if(rooms[i]!=null){
                Student student=rooms[i].getStudent();
                System.out.printf("%d: %s,%s%n",i,student.getName(),student.getEmail());
            }
        }
        sc.close();
    }

    static void exerciseA0902() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int number = sc.nextInt();

        System.out.print("Enter account holder: ");
        String holder = sc.next();

        Account account = new Account(number, holder);

        System.out.print("Is there initial deposit (y/n)? ");
        char initialDeposit = sc.next().charAt(0);

        if (initialDeposit == 'y') {
            System.out.print("Enter initial deposit value: ");
            double depositValueInitial = sc.nextDouble();

            account.deposit(depositValueInitial);
        }

        System.out.println("Account data:");
        System.out.println(account);

        System.out.print("Enter deposit value: ");
        double depositValue = sc.nextDouble();

        account.deposit(depositValue);

        System.out.println("Account data:");
        System.out.println(account);

        System.out.print("Enter a withdraw value: ");
        double drawValue = sc.nextDouble();

        account.draw(drawValue);

        System.out.println("Account data:");
        System.out.println(account);

        sc.close();
    }

    static void exerciseA901() {
        Scanner sc = new Scanner(System.in);

        System.out.println("New product");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity: ");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);
        System.out.println(product);

        System.out.print("Add product in stock: ");
        quantity = sc.nextInt();

        product.addProduct(quantity);
        System.out.println(product);

        System.out.print("Out product in stock: ");
        quantity = sc.nextInt();

        product.removeProduct(quantity);
        System.out.println(product);

        sc.close();
    }

    static void exerciseA801() {
        double iOF = 0.06;

        Scanner sc = new Scanner(System.in);
        System.out.print("Preço dolar?");
        double d = sc.nextDouble();
        System.out.print("Quantos dolares comprar?");
        double v = sc.nextDouble();

        double p = d * v * (iOF + 1);
        System.out.printf("Preço pagar em reais %.2f%n", p);

        sc.close();
    }

    static void exerciseA303() {
        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        int opcao = sc.nextInt();

        while (opcao != 4) {
            switch (opcao) {
                case 1:
                    alcool += 1;
                    break;
                case 2:
                    gasolina += 1;
                    break;
                case 3:
                    diesel += 1;
                    break;
                default:
                    break;
            }

            opcao = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }

    static void exerciseA302() {
        Scanner sc = new Scanner(System.in);

        int x, y;
        x = sc.nextInt();
        y = sc.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 & y > 0) {
                System.out.println("Primeiro");
            } else if (x < 0 & y > 0) {
                System.out.println("Segundo");
            } else if (x < 0 & y < 0) {
                System.out.println("Terceiro");
            } else {
                System.out.println("Quarto");
            }

            x = sc.nextInt();
            y = sc.nextInt();
        }

        sc.close();
    }

    static void exerciseA301() {
        Scanner sc = new Scanner(System.in);

        int senha;
        senha = sc.nextInt();
        while (senha != 2002) {
            System.out.println("Senha inválida!");
            senha = sc.nextInt();
        }
        System.out.println("Acesso permitido");
        sc.close();
    }

    static void exercise01() {
        String p1 = "Computer";
        String p2 = "Office desk";

        int age = 36;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        Locale.setDefault(Locale.forLanguageTag("PT-BR"));
        System.out.printf("%nProducts:%n%s, which price is $ %.2f%n%s, which price is $ %.2f%n", p1, price1, p2,
                price2);
        System.out.printf("%nRecord: %d years old code %d and gender %s%n", age, code, gender);
        System.out.printf("%nMeasue with eight decimal places: %f%n", measure);
        System.out.printf("Rouded (three decimal places): %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point): %.3f%n%n", measure);
    }
}
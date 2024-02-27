import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("what is the name of the contact? ");
        String name = input.nextLine();
        System.out.println("what is the email of the contact? ");
        String email = input.nextLine();
        System.out.println("what is the contacts number? ");
        int phone = input.nextInt();



        ContactBook contact = new ContactBook(name, email);
        contact.display();
        System.out.println();
        BuisnessContact buisnessContact = new BuisnessContact(name, email, phone);
        buisnessContact.display();

    }
}
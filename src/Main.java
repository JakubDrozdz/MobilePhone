import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {
        boolean quit=false;
        printMenu();
        while(!quit){
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 0:
                    printMenu();
                    break;
                case 1:
                    addContact();
                    break;
                case 2:
                    printContactBook();
                    break;
                case 3:
                    modifyContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printMenu(){
        System.out.println("Mobile phone menu:");
        System.out.println("0 - show menu");
        System.out.println("1 - add contact");
        System.out.println("2 - print contact book");
        System.out.println("3 - modify contact");
        System.out.println("4 - remove contact");
        System.out.println("5 - search contact");
        System.out.println("6 - quit");
    }

    public static void addContact(){
        System.out.print("Enter contact name: ");
        String name = scanner.nextLine();
        System.out.print("Enter contact number: ");
        String phoneNumber = scanner.nextLine();
        mobilePhone.addContact(name,phoneNumber);
    }

    public static void printContactBook(){
        System.out.println("Contact book: ");
        mobilePhone.printContactBook();
    }
    public static void modifyContact(){
        System.out.print("Enter contact name: ");
        String name = scanner.nextLine();
        mobilePhone.modifyContact(name);
    }
    public static void removeContact(){
        System.out.print("Enter contact name: ");
        String name = scanner.nextLine();
        mobilePhone.removeContact(name);
    }
    public static void searchContact(){
        System.out.print("Enter contact name: ");
        String name = scanner.nextLine();
        mobilePhone.searchContact(name);
    }


}

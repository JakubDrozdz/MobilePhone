import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> contactBook = new ArrayList<Contact>();

    public void addContact(String name, String phoneNumber){
        Contact contact = new Contact(name, phoneNumber);
        int position = findContact(contact.getName());
        if(position>=0){
            contactBook.add(contact);
            System.out.println("Contact \"" + contact.getName() + "\" has been added");
        }else{
            System.out.println("You already have contact " + contact.getName() + " in your contact book");
        }
    }
    public void printContactBook(){
        for (int i = 0; i < contactBook.size(); i++) {
            System.out.println((i+1) + ". " +contactBook.get(i));
        }
    }
    public void modifyContact(String name){
        int position = findContact(name)*(-1);
        if(position==100000){
            contactBook.get(0).setName("Anna");
        }
        else if (position>=1){
            contactBook.get(position).setName("Anna");
        }
        else{
            System.out.println("You dont have such contact");
        }
    }
    public void removeContact(String name){
        int position = findContact(name)*(-1);
        if(position==100000){
            contactBook.remove(0);
        }
        else if (position>=1){
            contactBook.remove(position);
        }
        else{
            System.out.println("You dont have such contact");
        }
    }
    public void searchContact(String name){
        int position = findContact(name)*(-1);
        if(position==100000){
            System.out.println(1 + ". " + contactBook.get(0));
        }
        else if (position>=1){
            System.out.println((position + 1) + ". " + contactBook.get(position));
        }
        else{
            System.out.println("You dont have such contact");
        }
    }
    private int findContact(String name){
        boolean quit = false;
        int position = 0;
        for (int i = 0; i < contactBook.size() && !quit; i++) {
           if(contactBook.get(i).getName().equals(name)){
               if(i==0)
                   position = -100000;
               else
                   position = i*(-1);
               return position;
           }
           position = i;
        }
        return position;
    }
}

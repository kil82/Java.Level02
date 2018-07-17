import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {
    private HashMap<String, List<String>> phoneBook;

    public PhoneBook(HashMap<String, List<String>> phoneBook) {
        this.phoneBook = phoneBook;
    }

    public void add(String name, String phoneNumber) {
        List<String> values = new ArrayList<String>();
        values.add(phoneNumber);
        if (this.phoneBook.containsKey(name)) {
            values.addAll(this.phoneBook.get(name));
            this.phoneBook.put(name, values);
        } else {
            this.phoneBook.put(name, values);
        }
        System.out.println("Entry added");
    }

    public void get(String name) {
        if (this.phoneBook.containsKey(name)) {
            System.out.println("Name " + name + " phone: " + this.phoneBook.get(name));
        } else {
            System.out.println("Name not found");
        }
    }
}

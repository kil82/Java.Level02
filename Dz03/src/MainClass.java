import java.util.*;

public class MainClass {
    public static ArrayList<String> testList = new ArrayList<>();

    public static void main(String[] args) {
        HashMap<String, Integer> hashCountWord = new HashMap<>();

        fillArrayList();
        System.out.println("Initial testList: " + testList);

        HashSet<String> hashUniqWord = new HashSet<String>(testList);
        System.out.println("Uniq testList: " + hashUniqWord);

        for (int i = 0; i < testList.size(); i++) {
            if (hashCountWord.containsKey(testList.get(i))) {
                hashCountWord.put(testList.get(i), hashCountWord.get(testList.get(i)) + 1);
            } else {
                hashCountWord.put(testList.get(i), 1);
            }
        }
        System.out.println("Count word testList: " + hashCountWord);

        PhoneBook phoneBook = new PhoneBook(new HashMap<>());
        phoneBook.add("Kirill","9182794334");
        phoneBook.add("Kirill", "9181111111");
        phoneBook.add("Ivanov", "0000000000");
        phoneBook.get("Kirill");


    }

    public static void fillArrayList() {
        for (int i = 1; i < 20; i++) {
            testList.add("word_" + i);
            if (i % 4 == 0) {
                testList.add("word_" + (i - 4));
            }
        }
    }
}

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String string = sc.nextLine();

        LinkedList<Character> result = new LinkedList<>();

        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                }
            }
            if (list.size() > result.size()) {
                result.clear();
                ;
                result.addAll(list);
            }
            list.clear();
        }
        for (Character character : result)
            System.out.print(character);
        System.out.println();

    }
}

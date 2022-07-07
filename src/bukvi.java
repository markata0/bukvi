import java.util.Scanner;

public class bukvi {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter word:");
        String word = myObj.nextLine();
        System.out.println("The spelled word is:");
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }

    }
}

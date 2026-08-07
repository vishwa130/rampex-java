import java.util.*;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int vowels = 0, consonants = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);

                if ("aeiou".indexOf(ch) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println(vowels + " " + consonants);

        sc.close();
    }
}
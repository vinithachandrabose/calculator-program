public class RepeatingCharacters {
    public static void main(String[] args) {
        String str = "banana";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            
            if (str.indexOf(ch) != i) continue;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }

            if (count > 1) {
                System.out.println(ch + " = " + count);
            }
        }
    }
}

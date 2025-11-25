public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        // Replace the following statement with your code
        
        String strLowerCase = "";
        
        for(int i = 0; i < str.length(); i++) {
           char c = str.charAt(i);

           if( c >= 'A' && c <= 'Z') {
            c = (char)(c + 32);
           }

           strLowerCase += c;

        }
        return strLowerCase;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        // Replace the following statement with your code
        String lowerCaseStr1 = lowerCase(str1);
        String lowerCaseStr2 = lowerCase(str2);
        
        int outerLoop = lowerCaseStr1.length() - lowerCaseStr2.length();

        for(int i = 0; i <= outerLoop; i++) {
            boolean math = true;

            for(int j = 0; j < lowerCaseStr2.length(); j++) {
                    if(lowerCaseStr1.charAt(i + j) != lowerCaseStr2.charAt(i)) {
                        math = false;
                        break;
                    }
            }

            if(math = false) {
                return false;
            }

        }

        return true;
    }
}

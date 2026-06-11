package Day_4;
public class DecodeString {

    static int index = 0;

    public static String decodeString(String s) {
        StringBuilder result = new StringBuilder();

        while (index < s.length() && s.charAt(index) != ']') {

            char ch = s.charAt(index);

            if (Character.isDigit(ch)) {

                int num = 0;

                while (index < s.length() &&
                       Character.isDigit(s.charAt(index))) {
                    num = num * 10 + (s.charAt(index) - '0');
                    index++;
                }

                index++; // skip '['

                String decodedPart = decodeString(s);

                index++; // skip ']'

                while (num-- > 0) {
                    result.append(decodedPart);
                }

            } else {
                result.append(ch);
                index++;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String s = "3[a2[c]]";

        index = 0;

        System.out.println("Encoded: " + s);
        System.out.println("Decoded: " + decodeString(s));
    }
}
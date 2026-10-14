package String;

public class EfficientRevers {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal, Panama";
        String str2 = "racecar2";
        System.out.println(isPalinDrome(str2));
        System.out.println(isPal(str2));
        System.out.println(isPal(str));

    }

    public static boolean isPalinDrome(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(c);
            }
            System.out.println(sb);
        }
        str = sb.toString().toLowerCase();
        System.out.println(str);
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static boolean isPal(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            while (i < j && !Character.isLetterOrDigit(str.charAt(i)))
                i++;
            while (i < j && !Character.isLetterOrDigit(str.charAt(j)))
                j--;

            if (Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(j))) {
                return false;
            }
            i++;
            j--;

        }
        return true;

    }

}


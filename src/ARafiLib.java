public class ARafiLib {

    /**
     * Checks whether a given string is a palindrome or not.
     * Reverses the order of each letter in the string to see if it matches the original string.
     *
     * @param str a string given by the user.
     * @return true or false based on the string being a palindrome or not.
     */

    public static boolean isPalindrome(String str) {
        int i = 0;
        int x = str.length();
        String result = str;
        String result2 = "";
        while (i < x) {
            String str1 = result.substring(x - 1);
            String str2 = result.substring(0, x - 1);
            result = str1 + str2;
            result2 = result2 + str1;
            i++;
        }
        if (result2.equals(str)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Takes out a given string from another given string.
     *
     * @param mainStr A string given by the user.
     * @param subStr  A second string given by the user to take out from mainStr.
     * @return The result of subStr taken out from mainStr.
     */

    public static String cutOut(String mainStr, String subStr) {
        int i = mainStr.indexOf(subStr);
        String one = mainStr.substring(0, i);
        String two = mainStr.substring(i + subStr.length());
        return one + two;
    }

    /**
     * Adds all the integers preceding the given input n.
     *
     * @param n An integer value given by the user.
     * @return An integer value that is the sum of all the numbers before the given integer n.
     */

    public static int sumUpTo(int n) {
        int result = 0;
        for (int i = 0; i <= n; i++) {
            result = result + i;
        }
        return result;
    }

    /**
     * Reformats the given date from mm/dd/yyyy to dd-mm-yyyy.
     *
     * @param str An string input by the user in the format mm/dd/yyyy.
     * @return A string in the format dd-mm-yyyy.
     */

    public static String dateStr(String str) {
        String month = str.substring(0, 2);
        String date = str.substring(3, 5);
        String year = str.substring(6);
        return date + "-" + month + "-" + year;
    }

    /**
     * Prints a multiplication table with the product of the base * n (all integers from 0 to n).
     *
     * @param base  An integer input by the user.
     * @param range An integer input by the user.
     * @return A String of integers that are the product of the base * n.
     */

    public static String multiplicationTable(int base, int range) {
        String result = "";
        int a;
        for (int n = 0; n <= range; n++) {
            a = base * n;
            result = result + a + " ";
        }
        return result;
    }
}

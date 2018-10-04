public class ARafiLib {
    public static boolean isPrime(int n){
        for (int i = 2; i < n; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(String str){
        int i = 0;
        int x = str.length();
        String result = str;
        String result2 = "";
        while (i < x) {
            String str1 = result.substring(x - 1); // getting the last character
            String str2 = result.substring(0, x - 1);
            result = str1 + str2;
            result2 = result2 + str1;
            i++;
        }
        if (result2.equals(str)){
            return true;
        }
        else {
            return false;
        }
    }

    public static String cutOut(String mainStr, String subStr){
        int i = mainStr.indexOf(subStr);
        String one = mainStr.substring(0,i);
        String two = mainStr.substring(i + subStr.length());
        return one + two;
    }

    public static int sumUpTo(int n){
        int result = 0;
        for(int i = 0; i <= n; i++){
            result = result + i;
        }
        return result;
    }

    public static int
}

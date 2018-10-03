public class ARafiLib {
    public static boolean isPrime(int n){
        for (int i = 2; i < n; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static String isPalindrome(String str){
        int i = 0;
        String result = "";
        while (i <= str.length()){
            String str1 = str.substring(str.length() - 1);
            String str2 = str.substring(0, str1.length());
            result = str1 + str2;
            i++;
        }
        if (result.equals(str)){
            return true;
        }
        else{
            return false;
        }
    }
}

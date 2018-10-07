public class ARafiLib {

    public static boolean isPalindrome(String str){
        int i = 0;
        int x = str.length();
        String result = str;
        String result2 = "";
        while (i < x) {
            String str1 = result.substring(x - 1); // Getting the last character
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

    public static String primePrinter(int num) {
        String result = " ";
        int i = 1;
        while (i < num){
            for (int a = 2; a < i; a++){
                if(i % a == 0){

                }
            }
            result = i + result;
            i++;
        }
        return result;
    }

    public static String dateStr(String str){
        String month = str.substring(0,2);
        String date = str.substring(3,5);
        String year = str.substring(6);
        return date + "-" + month + "-" + year;
    }

    public static int leastCommonMultiple(int num1, int num2, int num3){
        int i = 2;
        while (i < num1){
            if (num1%i == 0 && num2%i == 0 && num3%i == 0){
                return i;
            }
            i++;
        }
        return i;
    }
}

public class TestFile {
    public static void main(String[] args) {
        System.out.println("Is it a palindrome: " + ARafiLib.isPalindrome("ana"));
        System.out.println("The cut-out word is: " + ARafiLib.cutOut("string", "ring"));
        System.out.println("The sum off all integers from 0 to n is: " + ARafiLib.sumUpTo(4));
        System.out.println("The reformatted date is: " + ARafiLib.dateStr("10/07/2018"));
        System.out.println("All the products of base * (0 to range) is: " + ARafiLib.multiplicationTable(2,3));
    }
}

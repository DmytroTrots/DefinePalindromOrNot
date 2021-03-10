package project;

public class isPalindrome {
    String number;
    int indexOfNumber;
    public isPalindrome(int indexOfNumber, String number){
        this.number = number;
        this.indexOfNumber = indexOfNumber;
        char[] array = number.toCharArray();
        first:{
            for (int i = 0; i < array.length/2; i++) {
                if(array[array.length-1-i] != array[i]){
                    System.out.println(indexOfNumber + " number is not palindrome");
                    break first;
                } else{}
            }
            System.out.println(indexOfNumber + " number is palindrome");
            }
    }
}


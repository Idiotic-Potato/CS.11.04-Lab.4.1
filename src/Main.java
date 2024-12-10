public class Main {
    public static void main(String[] args) {

    }
    public static boolean parenthesesCheck(String str){
        int count1 = 0;
        int count2 = 0;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i)=='(')
                count1++;

        }
        for(int i = 0; i<str.length();i++){
            if(str.charAt(i)==')')
                count2++;
        }
        return count1==count2;
    }
    public static String reverseInteger(int number) {

        String numberString = String.valueOf(number);

        char[] charArray = numberString.toCharArray();

        for(int i = 0; i<charArray.length/2;i++){
            char temp = charArray[i];
            charArray[i]=charArray[charArray.length - 1 -i];
            charArray[charArray.length - 1 - i] = temp;
        }
        String reversed = new String(charArray);
        if(number<0){
            reversed = "-"+reversed;
        }
        return reversed;
}































































































}
import javax.swing.text.AttributeSet;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Solutions{

    public static void reverseString(String s){
        char[] chars = s.toCharArray();
        int l = 0;
        int r = s.length()-1;
        while(l<=r){
            char temp = chars[l];
            chars[l] = chars[r];
            chars[r] = temp;
            l++;
            r--;

        }
        String op = new String(chars);
        System.out.println(op);
    }

    public static void swapTwoNums(int a, int b){
        a =a+b;
        b=a-b;
        a=a-b;
        System.out.println(a +" " +b);

    }

    public static void countTheNumberOfWords(String s){
        Map<String, Integer> op= new HashMap<>();
        String[] s1 = s.split("\\s+");

        for (String word : s1){
            op.put(word, op.getOrDefault(word, 0)+1);
        }

       for(Map.Entry<String, Integer> entry : op.entrySet()){
           System.out.println(entry.getKey() + " " + entry.getValue());
       }

        Iterator<Map.Entry<String, Integer>> it = op.entrySet().iterator();
       while(it.hasNext()){
           Map.Entry<String, Integer> entry = it.next();
           System.out.println(entry.getKey() +" " + entry.getValue());
       }

    }

    public static boolean primeOrNot(int a) {
        if (a <= 1) return false;
        if (a <= 3) return true;
        if (a % 2 == 0 || a % 3 == 0) return false;
        for (int i = 5; i * i <= a; i += 6) {
            if (a % i == 0 || a % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean palindrome(String s){
        int l=0; int r=s.length()-1;
        while(l<r){
            if(s.charAt(l) == s.charAt(r)){
                return true;
            }
            l++;
            r--;
        }
        return false;
    }

    public static void duplicateChars(String s){
        Map<Character, Integer> op = new HashMap<>();
        for (char c : s.toCharArray()){
            op.put(c, op.getOrDefault(c, 0)+1);
        }

        for(Map.Entry<Character, Integer> entry : op.entrySet()){
            if(entry.getValue() > 1){
                System.out.println("duplicate chars are," + entry.getKey() + " " + entry.getValue());
            }
        }
    }

    public static void secondHighest(int [] arr){
        int firstHighest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++) {
            if (arr[i] > firstHighest) {
                firstHighest = arr[i];
            }
        }
        for(int j=0; j<arr.length;j++){
            if(arr[j] > secondHighest && arr[j] < firstHighest){
                secondHighest = arr[j];
            }
        }
        System.out.println(firstHighest);
        System.out.println(secondHighest);

    }

    public static void checkArmstrong(int a){
        int original = a;
        int sum =0;
        int digit = String.valueOf(a).length();
        while(a>0){
            int rem = a%10;
            sum+= (int) Math.pow(rem, digit);
            a= a/10;
        }
        if(sum == original){
            System.out.println("its armstrong");
        }
        else{
            System.out.println("its not atrmstrong");
        }
    }
    public static int [] twoSum(int[] nums, int target){
        Map<Integer, Integer> numMap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int c= target - nums[i];
            if(numMap.containsKey(c)){
                return new int[] {numMap.get(c),i};
            }
            numMap.put(nums[i], i);
        }

        throw new IllegalArgumentException("no solutions found");
    }
    public static void sortString(String s){
        String[] ns = s.split(",");
        Arrays.sort(ns);
        String op= String.join(" ", ns);
        System.out.println(op);
    }

}











public class Main {
    public static void main(String[] args) {
//        Solutions.reverseString("SANDEEPa");
//        Solutions.swapTwoNums(287,390);
//        Solutions.countTheNumberOfWords("sandeep has a intrest in java has");
//        System.out.println(Solutions.primeOrNot(25));
       // System.out.println(Solutions.palindrome("asasa"));

//        Solutions.duplicateChars("sandeep");
//        int[] nums = {2,4,1,98,65,3,3, 32};
////        Solutions.secondHighest(nums);
//
//        Solutions.checkArmstrong(152);
//        int[] sol = Solutions.twoSum(nums, 6);
//        System.out.println(Arrays.toString(sol));
        Solutions.sortString("hi, i , am ,sandeep");

    }
}


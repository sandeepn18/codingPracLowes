import factory.FactoryPattern;


import javax.swing.text.AttributeSet;
import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;
@FunctionalInterface
interface sums{
    void adds(int a, int b);
}
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
        //Solutions.sortString("hi, i , am ,sandeep");

        List<Integer> numbers = Arrays.asList(33, 21, 65,11,33);
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
       // numbers.stream().filter(n-> n%2==0).toList().forEach(s-> System.out.println(s));// even nums
        //System.out.println(numbers.stream().mapToInt(n-> n).max().getAsInt());// max
      //  System.out.println(numbers.stream().mapToInt(n-> n).sum());// sum
       // names.stream().map(String::toUpperCase).toList().forEach(System.out::println);// touppercase
        //numbers.stream().sorted(Comparator.naturalOrder()).toList().forEach(System.out::println); // sort
        //System.out.println(numbers.stream().count());// count
       // numbers.stream().distinct().toList().forEach(System.out::println);// distinct
        //System.out.println(numbers.stream().findFirst().get());// findany
        List<String> fullNames = Arrays.asList("Alice Johnson", "Bob Harris", "Charlie Lou");
        //fullNames.stream().map(n-> n.split(" ")[0]).toList().forEach(System.out::println);//fisrtname
        //System.out.println(numbers.stream().allMatch(n-> n>0));// allmatch
        //System.out.println(numbers.stream().noneMatch(n-> n<0));// nonematch
        List<List<Integer>> nestedNumbers = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4, 5));//flatmap

       // nestedNumbers.stream().flatMap(List::stream).toList().forEach(System.out::println);// flatmap
        //numbers.stream().skip(3).toList().forEach(System.out::println);//limit and skip//

//        Set<Integer> sets = numbers.stream().collect(Collectors.toSet());
//        System.out.println(sets);
//
//        IntSummaryStatistics summ = numbers.stream().mapToInt(Integer::valueOf).summaryStatistics();
//        System.out.println(summ); //summary
//        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
//
//        myList.stream().map(n-> String.valueOf(n)).filter(n-> n.startsWith("1")).toList().forEach(System.out::println);// startswith
//        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> sets = new HashSet<>();
//                myList.stream().filter(n-> !sets.add(n)).collect(Collectors.toSet()).forEach(System.out::println); // duplicate

            String s = "ssandeep";
       // System.out.println(s.chars().mapToObj(n-> (char) n).filter(n-> s.indexOf(n) == s.lastIndexOf(n)).findFirst().get());// first non repeating char

        //System.out.println(numbers.stream().anyMatch(n-> !sets.add(n)));// any dupicates

//        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println(localDateTime); // current datetime
        //Java 8 program to perform cube on list elements and filter numbers greater than 50.
//        List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);
//        integerList.stream().map(n-> Math.pow(n,3)).filter(n-> n>50).map(n-> Math.round(n)).toList().forEach(System.out::println);
         // SORT HASHMAP
//        Map<Integer, String> mp = new HashMap<>();
//        mp.put(4, "banana");
//        mp.put(2, "apple");
//        mp.put(1, "orange");
//        mp.put(3, "mango");
//
//        Map<Integer, String> newMap = mp.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2) -> e1, LinkedHashMap::new));
//        System.out.println(newMap);
//
//        Map<Integer, String> m = new HashMap<>();
//        mp.put(4, "banana");
//        mp.put(2, "apple");
//        mp.put(1, "orange");
//        mp.put(3, "mango");
//
//        Map<Integer, String > m1 = m.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2) ->e1, LinkedHashMap::new));

///////   TOP FREQUENT WORDS
//        String paragraph = "java cracking java java by learning Java ";
//        List<String> words = Arrays.stream(paragraph.toLowerCase().split("\\s+")).toList();

        sums s1 = (a,b) -> System.out.println(a+b);

//BUBBLE SORT
//        s1.adds(2,3);
//
//        int[] nums = {34,21,11,23,45,32,98};
//
//        for(int i=0; i<nums.length-1; i++){
//            for(int j=0; j<nums.length-i-1; j++ ){
//                if(nums[j] > nums[j+1]){
//                    int temp = nums[j];
//                    nums[j] = nums[j+1];
//                    nums[j+1] = temp;
//                }
//            }
//        }
//        for(int i:nums){
//            System.out.println(i);




    }
}


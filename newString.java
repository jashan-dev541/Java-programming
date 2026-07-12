import java.util.*;
public class newString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // String s2 = sc.next();

        //Palindrome check
        // int left = 0 , right = s.length()-1 ;
        // boolean isPalin = false;
        // while(left<=right){
        //     if(s.charAt(left) == s.charAt(right)){
        //         isPalin = true;
        //         left++; right--;
        //     }
        //     else{
        //         break;
        //     }
        // }
        // if(isPalin == false) System.out.println("No");
        // else System.out.println("Yes");

        
        //Anagram

        // if(s.length() != s2.length()) System.out.println("Not an anagram.");
        // else{
        //     char arr1[] = s.toCharArray();
        //     char arr2[] = s2.toCharArray();
        //     Arrays.sort(arr1);
        //     Arrays.sort(arr2);
        //     if(Arrays.equals(arr1,arr2)) System.out.println("These are the anagrams!");
        //     else System.out.println("Not an anagram");
        // }


        //Longest word in sentence
        // String words[] = s.split(" ");
        // String longestWord = "";
        // for(String word: words){
        //     if(word.length()>longestWord.length()){
        //         longestWord = word;
        //     }
        // } 
        // System.out.println(longestWord);

        //Remove duplicates
        StringBuilder sb = new StringBuilder();
        HashSet<Character> present = new HashSet<>();
        for(char character: s.toCharArray()){
            if(!present.contains(character)){
                present.add(character);
                sb.append(character);
            }
        }
        System.out.println("Original: " + s);
        System.out.println("Without duplicates: "+ sb.toString());
        sc.close();
    }
}

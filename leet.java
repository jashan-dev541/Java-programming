//Roman to Integer
import java.util.*;
public class leet{
    public static int RomantoInt(String roman){
        int current = 0,intg,result = 0;
        for(int i=0; i<roman.length(); i++){
        switch(roman.charAt(i)){
            case 'I': current = 1; break;
            case 'V': current = 5; break;
            case 'X': current = 10; break;
            case 'L': current = 50; break;
            case 'C': current = 100; break;
            case 'D': current = 500; break;
            case 'M': current = 1000; break;
        }
            if(i+1 < roman.length()){
                intg = 0;
                switch(roman.charAt(i+1)){
                    case 'I': intg = 1; break;
                    case 'V': intg = 5; break;
                    case 'X': intg = 10; break;
                    case 'L': intg = 50; break;
                    case 'C': intg = 100; break;
                    case 'D': intg = 500; break;
                    case 'M': intg = 1000; break;
                }     
                if(current<intg){
                    result -= current; 
                }  
                else{
                    result += current;
                }
            }
            else result += current;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String roman = sc.next();
        System.out.println(RomantoInt(roman));
        sc.close();
    }
}
package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ParanthesisImp {
   public static void main() {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int count=0;
        Stack<Character> s1=new Stack<>();
        for(int i=0;i<a.length();i++) {
            if (a.charAt(i) == '(') {
                s1.push('(');
            }
            else{
                if(!s1.isEmpty()){
                    s1.pop();
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

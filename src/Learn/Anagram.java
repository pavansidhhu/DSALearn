package Learn;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s="cool";
        String s1="lo2co";
        char ch[]=s.toCharArray();
        char ch1[]=s1.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        String g= Arrays.toString(ch);
        String v=Arrays.toString(ch1);
        if(ch.length== ch1.length){
        if(g.equals(v)){
            System.out.println("founs");
        }
        else{
            System.out.println("not");
        }}
        else{
            System.out.println("not5");
        }


    }
}

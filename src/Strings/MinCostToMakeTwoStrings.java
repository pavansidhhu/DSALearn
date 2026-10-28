    package Strings;

    import java.util.ArrayList;
    import java.util.LinkedList;
    import java.util.List;

    public class MinCostToMakeTwoStrings {
        public static void main(String[] args) {
            String a="abcd";
            String b="acdb";
            int ac=10;
            int bc=20;
            char ch[]=a.toCharArray();
            char ch1[]=b.toCharArray();
            List<Character> l1=new LinkedList<>();
            List<Character> l2=new LinkedList<>();
            for(char c:ch){
                l1.add(c);
            }
            for(char c:ch1){
               l2.add(c);
            }
            int count=0;
            int count1=0;
            for(char b1:l1){
                if(!l2.contains(b1)){
                    count++;
                }
            }
            for(char b1:l2){
                if(!l1.contains(b1)){
                    count1++;
                }
            }
            System.out.println((count*ac)+(count1*bc));
        }
    }

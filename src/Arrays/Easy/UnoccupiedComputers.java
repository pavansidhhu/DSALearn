package Arrays.Easy;

import java.util.ArrayList;
import java.util.List;

public class UnoccupiedComputers {
    public static void main(String[] args) {
        int a=1;
        String s="ABCBAC";
        char ch[]=s.toCharArray();
        List<Character> l1=new ArrayList<>();
        List<Character> l2=new ArrayList<>();
        int count=0;
        int k=0;
        for(int i=0;i<ch.length;i++){
            if(l1.contains(ch[i])){
                l1.remove((Character) ch[i]);
                count--;
            }
            else if(l2.contains(ch[i])){

            }
            else{
                if(count<a){
                    l1.add(ch[i]);
                    count++;

                }
                else{
                    l2.add(ch[i]);
                    k++;
                }
            }




        }
        System.out.println(count);
        System.out.println(k);
    }
}

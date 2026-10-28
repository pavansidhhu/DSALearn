package SirClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubStringPrb {
    public static void main(String[] args) {
        String a = "1111";
        int st = 1;
       // String Fst1= a.substring(0,1);
//System.out.println(Fst1);

        List<Integer>l1=new ArrayList<>();
            for (int i = 0; i < a.length(); i++) {
                String Fst = a.substring(0,st);
                String Lst=a.substring(st,a.length());
                if(Lst.length()==0){
                    break;
                }
                int fst1=0;
                int lst1=0;
                for(int j=0;j<Fst.length();j++){

                    if(Fst.charAt(j)=='0'){
                        fst1++;
                        //.out.println(Fst.charAt(j));
                    }
                }
                for(int k=0;k<Lst.length();k++){
                    if(Lst.charAt(k)!='0'){
                        lst1++;
                      //  System.out.println(Lst.charAt(k));
                    }
                }
                //System.out.println(fst1+" "+lst1);
                l1.add((fst1+lst1));
                st++;

            }
        Collections.sort(l1,Collections.reverseOrder());
        System.out.println(l1.get(0));
        }

}
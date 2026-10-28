package Learn;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class RotatedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer>l1= Arrays.asList(1,2,3,4,5);
        List<Integer>l2=new LinkedList<>(l1);
        int c=1;
        l2.stream().forEach(System.out::print);

        for(int i=0;i<c;i++){

          int a=l2.removeFirst();
          l2.addLast(a);

        }
        System.out.println("-----");
        l2.stream().forEach(System.out::println);
    }
}

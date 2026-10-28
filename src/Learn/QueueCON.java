package Learn;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
/*3
1 2 3 4 5
3

1 2 3
4 5*/
public class QueueCON {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        List<Integer> l1=new ArrayList<>();
        for(int i=0;i<a;i++){
            l1.add(sc.nextInt());
        }
        int b=sc.nextInt();
        l1.stream().forEach(e-> System.out.print(e+" "));
        System.out.println();
        for(int i=0;i<a;i++){

            System.out.print(l1.removeFirst()+" ");
            if((i+1)==b){
                System.out.println();
                continue;

            }
        }
        if(l1.isEmpty()){
            System.out.println("queue is empty");
        }
    }
}

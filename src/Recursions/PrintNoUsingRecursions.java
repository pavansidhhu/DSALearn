package Recursions;

public class PrintNoUsingRecursions {
    public static void main(String[] args) {
        PrintNoUsingRecursions p1=new PrintNoUsingRecursions();
        p1.print();
    }
    int count=0;
    public void print(){
        if(count==4){
            return;
        }
        count++;
        System.out.println(count);
        print();
    }
}


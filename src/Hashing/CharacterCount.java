package Hashing;

public class CharacterCount {
    public static void main(String[] args) {
        char ch[]={'a','b','c','d','e','a','b','a'};
        char target='e';
        int count=0;
        char f=target;
        for(int i=0;i<ch.length;i++){
            if(ch[i]==target){
                f=ch[i];
                count++;
            }
        }
        System.out.println(f+" "+count);
    }
}

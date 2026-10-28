package Algorithms.Greedy;

import java.util.Scanner;

public class Lemonade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int bills[]={5, 5, 10, 10, 20};
        int f=0;
        int t=0;
        boolean bh =true;
        for(int i=0;i<bills.length;i++) {
            if (bills[i] == 5) {
                f++;
            } else if (bills[i] == 10) {
                if (f <= 0) {
                    bh = false;
                    break;
                }

                f--;
                t++;
            }

            else {
                if(f>=3){
                    f=f-3;
                }
                else if((f>=1)&&(t>=1)){
                    f=f-1;
                    t--;
                }
                else{
                    bh=false;
                    break;
                }
            }

            }
        if(bh){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        }
    }


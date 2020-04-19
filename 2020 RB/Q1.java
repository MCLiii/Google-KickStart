

import java.util.Scanner;

public class Q1{
    public static String out="";
    public static Scanner scan=new Scanner(System.in);
    public static void main(String[]args){
        int caseNum=scan.nextInt();
        for(int i = 1;i <=caseNum;i++){
            int num= scan.nextInt();
            int [] mtH=new int [num];
            for(int j=0;j<num;j++){
                mtH[j]=scan.nextInt();
            }
            out=out+"\nCase #"+i+": "+finder(mtH);
        }
        System.out.println(out);
    }
    public static int finder(int[] arr){
        int total=0;
        for(int i = 1 ; i<arr.length-1;i++){
            if(arr[i]>arr[i+1] && arr[i]>arr[i-1]){
                total++;
                i++;
            }
        }
        return total;
    }
}
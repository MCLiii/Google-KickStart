
import java.util.Scanner;

public class Q2{
    public static long[] r;
    public static String out="";
    public static Scanner scan=new Scanner(System.in);
    public static void main(String[]args){
        int caseNum=scan.nextInt();
        for(int i = 1;i <=caseNum;i++){
            int route=scan.nextInt();
            long fDay=scan.nextLong();
             r=new long[route];
            for(int j = 0 ; j < route ; j++){
                r[j]=scan.nextLong();
            }
            out=out+"\nCase #"+i+": "+solve(fDay,r.length-1);
        }
        System.out.println(out);
    }
    public static long solve(long fDay,int a){
        if(a>0){
            return solve((fDay/r[a])*r[a],a-1);
        }
        return (fDay/r[a])*r[a];
    }
}
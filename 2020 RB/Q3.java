
import java.util.Scanner;
import java.util.Stack;

public class Q3 {
    public static long S=1,E=1;
    public static String out="";
    public static Scanner scan=new Scanner(System.in);
    public static void main(String[]args){
        int caseNum=scan.nextInt();
        for(int i = 1;i <=caseNum;i++){
            String dir=scan.next();
            solve(dir);
            out=out+"\nCase #"+i+": "+coor(E)+" "+coor(S);
            S=1;
            E=1;
        }
        System.out.println(out);
    }
    public static long coor(long a){ 
        long b=(1000000000+a%1000000000)%1000000000;
        if(b==0)
            return 1000000000;
        else
            return b;
    }
    public static void solve(String dir){
        Stack<Long> add=new Stack<>();
        long a=1;
        for(int i = 0 ; i<dir.length();i++){
            char tmp=dir.charAt(i);
            if(tmp>47 && tmp<58){
                add.push(a);
                a=a*(tmp-48);
                i++;
            }
            else if(tmp==')')
                a=add.pop();
            else{
                if(tmp=='N')
                    S=S-a;
                else if(tmp=='S')
                    S=S+a;
                else if(tmp=='E')
                    E=E+a;
                else if(tmp=='W')
                    E=E-a;
            }
        }
    }
}
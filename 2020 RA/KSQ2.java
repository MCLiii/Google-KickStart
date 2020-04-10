
import java.util.*;

public class KSQ2 {
    public static Stack<int[]> data=new Stack<int[]>();
    public static int[] result;
    public static String out="";
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int caseNum=scan.nextInt();
        for(int i = 0; i< caseNum;i++){
            int N=scan.nextInt();
            int K=scan.nextInt();
            int P=scan.nextInt();
            int[][] score= new int[N][K];
            input(score,scan);
            numGen(N,K,P,new int[N]);
            calc(score);
            int max= findMax();
            out = out + "\nCase #"+(i+1)+": "+max;
            }
        System.out.println(out);
        }
    public static void input(int[][] score,Scanner scan){
        for(int i = 0 ; i < score.length;i++){
            for(int j = 0 ; j < score[0].length; j ++){
                score[i][j] = scan.nextInt();
            }
        }
    }
    public static int findMax(){
        int max=0;
        for(int i = 0 ; i < result.length ; i++){
            if(result[i]>result[max])
                max=i;
        }
        return result[max];
    }
    public static void numGen(int n,int k,int p,int [] num){
        if(n!=1) {
            int a;
            if (p > k)
                a = k;
            else
                a = p;
            for (int i = 0; i <= a; i++) {
                num[num.length - n] = i;
                numGen(n - 1, k, p - i, num);
            }
        }else {
            if (p <= k) {
                num[num.length - n] = p;
                data.push(num.clone());
            }
        }
    }
    public static void calc(int[][] arr){
        int size= data.size();
        result= new int[size];
        for(int i = 0 ; i < size;i++){
            int[] temp = data.pop();
            for(int j = 0 ; j < temp.length;j++){
                for(int k = 0;k<temp[j];k++){
                    result[i]=result[i]+arr[j][k];
                }
            }
        }
    }
}


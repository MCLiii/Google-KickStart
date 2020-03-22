import java.util.Scanner;

public class KSQ1 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int caseNum=scan.nextInt();
        int[] result= new int[caseNum];
        for(int i = 0; i< caseNum;i++) {
            int housNum = scan.nextInt();
            int Budget = scan.nextInt();
            int[] price=new int[housNum];
            input(price,scan);
            result[i]=calculator(price,Budget);
        }
        for(int i=0;i<result.length;i++){
            System.out.println("Case #"+(i+1)+": "+result[i]);
        }
    }
    private static int calculator(int[] arr, int budget){
        int a=0;
        int i=0;
        while(a<budget && i!=arr.length){
            a=a+arr[i];
            i++;
        }
        if(a>budget)
            return i-1;
        else
            return i;
    }
    private static void input(int[]arr, Scanner a){
        for(int i = 0 ; i<arr.length;i++){
            arr[i] = a.nextInt();
        }
        QuickSort(arr,0,arr.length-1);
    }
    public static int QuickPartition(int[] a, int start, int end) {
        int temp;
        int pivot=a[end];
        int pIndex=start;
        for(int i=start;i<end;i++) {
            if(a[i]<=pivot) {
                temp=a[i];
                a[i]=a[pIndex];
                a[pIndex]=temp;
                pIndex++;
            }
        }
        temp=a[pIndex];
        a[pIndex]=a[end];
        a[end]=temp;
        return pIndex;
    }
        public static void QuickSort(int[] a, int start, int end) {
            if(start<end) {
                int pIndex=QuickPartition(a,start,end);
                QuickSort(a,start,pIndex-1);
                QuickSort(a,pIndex+1,end);
            }
            else
                return;
        }
}

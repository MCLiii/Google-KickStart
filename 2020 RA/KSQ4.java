import java.util.Scanner;

public class KSQ4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int [] Score=new int[T];
        for (int a = 0; a < T; a++) {
            int N=scan.nextInt();
            int K = scan.nextInt();
            String[] arr=new String[N];
            io(arr,scan);
            for(int c = 0;c<N;c+=K){
                Score[a]=Score[a]+Gen(arr,c,c+K);
            }
        }
        for(int i = 0;i<Score.length;i++){
            System.out.println("Case #"+(i+1)+": "+Score[i]);
        }
    }
    public static int Gen(String[] arr,int start, int end){
        String sample=arr[start];
        for(int i= start+1;i<end;i++){
            boolean goOn=true;
            int j=0;
            while(goOn && j<sample.length()){
                if(j<arr[i].length()) {
                    if (sample.charAt(j) == arr[i].charAt(j)) {
                        j++;
                    } else {
                        sample = sample.substring(0, j);
                        goOn = false;
                    }
                }else{
                    sample=arr[i];
                }
            }
        }
        return sample.length();
    }
    public static void io(String [] arr,Scanner scan){
        for(int i = 0;i<arr.length;i++){
            arr[i]=scan.next();
        }
        bubble(arr);
    }
    public static void bubble(String[] origin){
        boolean nEnd=true;

        while (nEnd){
            nEnd=false;
            for(int i=0;i<origin.length-1;i++){
                if(origin[i+1].compareTo(origin[i])<0) {
                    swap(origin, i, i + 1);
                    nEnd=true;
                }
            }
        }
    }
    public static void swap(String[] origin,int i,int min){
        String temp;
        temp=origin[i];
        origin[i]=origin[min];
        origin[min]=temp;

    }
}

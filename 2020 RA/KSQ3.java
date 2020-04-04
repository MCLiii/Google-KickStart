import java.util.LinkedList;
import java.util.Scanner;

public class KSQ3
{
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        String output = "";
        int caseNum = scan.nextInt();
        for (int i = 0; i < caseNum; i++) {
            int timeNum = scan.nextInt();
            int addNum = scan.nextInt();
            LinkedList<Integer> time = new LinkedList<>();
            input(time, scan, timeNum);
            add(time,addNum);
            output=output+"\ncase #"+(i+1)+": "+ ans(time);
        }
        System.out.println(output);
    }
    public static int ans(LinkedList<Integer> time){
        int max=0,temp;
        for(int i =0;i<time.size()-1;i++){
            temp=time.get(i + 1) - time.get(i);
            if(temp>max)
                max=temp;
        }
        return max;
    }
    public static void add(LinkedList<Integer> time,int loop){
        for(int j = 0;j<loop ;j++) {
            int maxIndex = 0, max = 0;
            for(int i =0;i<time.size()-1;i++) {
                if (time.get(i + 1) - time.get(i) > max) {
                    maxIndex = i;
                    max=time.get(i + 1) - time.get(i);
                }
            }
            time.add(maxIndex+1, (time.get(maxIndex) + time.get(maxIndex + 1)) / 2);
        }
    }
    public static void input(LinkedList<Integer> time,Scanner scan,int timeNum){
        for (int i = 0; i<timeNum;i++){
            time.add(scan.nextInt());
        }
    }
}
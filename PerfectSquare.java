import java.util.Scanner;
public class PerfectSquare {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        for (int i=1;i<=n;i++){
            if(n%i==0){
                count+=1;
            }
        }
        if(count%2!=0){
            System.out.println("Perfect Square");
        }
        else{
            System.out.println("Not Perfect Square");
        }
    }
}

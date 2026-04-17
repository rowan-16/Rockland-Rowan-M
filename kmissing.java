
import java.util.Scanner;
public class kmissing
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] a = new int[10];
        System.out.print("Enter n value:");
        int n = sc.nextInt();
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter K value:");
        int k = sc.nextInt();
        int l = 0, r = n-1;
        int m = 0;
        while(l<=r)
        {
            m = (l+r)/2;
            if((a[m]-(m+1))<k){
                l=m+1;
            }
            else{
                r=m-1;
            }
        
        }
        System.out.println("Missing element is:"+(l+k));
        int t=k;
        int c = a[m]-m;
        int b = c-t;
        if(a[m]<k){
            System.out.println(a[m]-b+1);
        }
        else{
            System.out.println(a[m]-b);
        }
        sc.close();
    }
}

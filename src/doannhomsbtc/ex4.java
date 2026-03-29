
package doannhomsbtc;
package doannhomsbtc;
import java.util.*;
public class ex1 {
    int []a;
    void sinhMang(int n){
        Random rd = new Random();
        a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = rd.nextInt(1,10);
        }
    }
    void in(String t){
        System.out.println("\n"+ t);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    void timMax() {
        if (a == null || a.length == 0) {
            System.out.println("Mang rong!");
            return;
        }
        
        int max = a[0]; 
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i]; 
            }
        }
        System.out.println("\nGia tri lon nhat trong mang la: " + max);
    }
    public static void main(String[] args) {
        ex1 l = new ex1();
        l.sinhMang(10);
        l.in("Hien thi mang");
        l.timMax();
    }
    
}

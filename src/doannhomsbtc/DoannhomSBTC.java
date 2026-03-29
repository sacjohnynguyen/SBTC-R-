
package doannhomsbtc;
import java.util.*;
public class DoannhomSBTC {
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
    public static void main(String[] args) {
        DoannhomSBTC l = new DoannhomSBTC();
        l.sinhMang(10);
        l.in("Hien thi mang");
    
    }
    
}

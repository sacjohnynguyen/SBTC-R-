package doannhomsbtc;
import java.util.*;
public class ex2 {
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
    void sapXepTangDan() {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        ex2 l = new ex2();
        l.sinhMang(10);
        l.in("Hien thi mang");
        l.sapXepTangDan();
        l.in("Sau khi sap xep: ");
    }
}


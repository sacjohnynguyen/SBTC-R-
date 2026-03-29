
package doannhomsbtc;

import java.util.Random;
import java.util.*;
public class ex4 {
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
    void timMin() {
        if (a == null || a.length == 0) {
            System.out.println("Mảng rỗng!");
            return;
        }
        
        int min = a[0]; // Giả sử phần tử đầu tiên là lớn nhất
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i]; // Cập nhật lại max nếu tìm thấy số lớn hơn
            }
        }
        System.out.println("\nGia tri nho nhat: " + min);
    }
    public static void main(String[] args) {
        ex4 l = new ex4();
        l.sinhMang(10);
        l.in("Hien thi mang");
        l.timMin();
    }
}

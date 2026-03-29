package test;

import java.util.Random;

public class Test {
    int[] a;

    // Sinh mảng
    void sinh(int n) {
        a = new int[n];
        Random rd = new Random();
        for (int i = 0; i < n; i++)
            a[i] = rd.nextInt(1, 100);
    }

    // In mảng
    void in(String t) {
        System.out.println("\n" + t);
        for (int x : a)
            System.out.print(x + " ");
        System.out.println();
    }

    // Đảo mảng
    void dao() {
        int i = 0, j = a.length - 1;
        while (i < j) {
            int t = a[i];
            a[i++] = a[j];
            a[j--] = t;
        }
    }

    // Sắp xếp tăng dần
    void sapxep() {
        for (int i = 0; i < a.length - 1; i++)
            for (int j = i + 1; j < a.length; j++)
                if (a[i] > a[j]) {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
    }

    // Tìm x
    int timx(int x) {
        for (int i = 0; i < a.length; i++)
            if (a[i] == x)
                return i;
        return -1;
    }

    // Kiểm tra mảng tăng dần
    boolean tang() {
        int i = 0;
        while (i < a.length - 1 && a[i] < a[i + 1])
            i++;
        return i == a.length - 1;
    }

    // ===== DANH SÁCH ĐẶC =====
    void demcd() {
        int dd = 0, n = a.length, dem = 0;
        while (dd < n) {
            int cd = dd;
            while (cd < n - 1 && a[cd] < a[cd + 1])
                cd++;

            System.out.print("\nDoan thu " + (++dem) + ": ");
            for (int k = dd; k <= cd; k++)
                System.out.print(a[k] + " ");

            dd = cd + 1;
        }
    }

    // MAIN
    public static void main(String[] args) {
        Test m = new Test();

        m.sinh(10);
        m.in("Noi dung mang:");

        m.dao();
        m.in("Mang sau khi dao:");

        m.sapxep();
        m.in("Mang sau khi sap xep:");

        int x = 50;
        if (m.timx(x) >= 0)
            System.out.println("Co " + x + " trong mang");
        else
            System.out.println("Khong co " + x + " trong mang");

        if (m.tang())
            System.out.println("Mang tang dan");
        else
            System.out.println("Mang KHONG tang dan");

        m.demcd();

        System.out.println("\nXONG!");
    }
}

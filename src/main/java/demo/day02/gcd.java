package demo.day02;

import java.sql.SQLOutput;
import java.util.Scanner;

//输入两个正整数 m 和 n，求其最大公约数和最小公倍数
public class gcd {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.println("请输入正整数m: ");
        System.out.println("请输入正整数n: ");
        int m = ab.nextInt();
        int n = ab.nextInt();
        if(m<n){
            int o = m;
            m = n;
            n = o;
        }
        for (int i = n; i <m ; i++) {
            if( (n%i==0) && (m%i==0) ){
                System.out.println("m和n的最大公约数是："+i);
                System.out.println("m和n的最小公倍数是："+ m * n / i);
            }
        }
    }
}

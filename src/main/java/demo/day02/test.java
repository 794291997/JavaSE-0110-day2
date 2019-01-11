package demo.day02;
//用条件运算符实现：
//- 接收用户输入的成绩 int score
//- 大于等于 85，输出 A
//- 大于等于60， 输出 B
//- 小于 60，输出 C
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入成绩：");
        int score = s.nextInt();
        if(score>=85){
            System.out.println("A");
        }
        else if(score>=60) {
            System.out.println("B");
        }else{
                System.out.printf("C");
        }
    }
}

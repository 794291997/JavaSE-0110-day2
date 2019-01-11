package demo.day02;
//打印出所有的“水仙花数”，所谓“水仙花数”是指一个三位数，其各位数字立方和等于该数本身。
public class num {
    public static void main(String[] args) {
        for (int i = 100; i <1000 ; i++) {
            if (i==(i/100)*(i/100)*(i/100)+(i%10)*(i%10)*(i%10)+(i/10%10)*(i/10%10)*(i/10%10)){
                System.out.println("水仙花："+i);
            }
        }
    }
}

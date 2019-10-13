import java.util.Scanner;
public class Addition{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int firstNumber;                    // 声名三个整型变量
        int secondNumber;
        int sum;
        System.out.print("请输入第一个数:");
        firstNumber = input.nextInt();       // 从键盘读入一个数
        System.out.print("请输入第二个数:");
        secondNumber = input.nextInt();
        sum = firstNumber + secondNumber;
        System.out.printf("相加后的结果是:%d\n",sum);    // 将字符串显示到命令行
    }
}
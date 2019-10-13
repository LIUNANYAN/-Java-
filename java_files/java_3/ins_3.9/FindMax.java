/*
从键盘输入3个整数，求三个数中最大的那一个
if 语句的使用
*/
import javax.swing.JOptionPane;
public class FindMax{
    public static void main(String args[]){
        String input1,input2,input3;
        int a,b,c,max;
        input1 = JOptionPane.showInputDialog("请输入第一个数:");
        input2 = JOptionPane.showInputDialog("请输入第二个数:");
        input3 = JOptionPane.showInputDialog("请输入第三个数:");
        a = Integer.parseInt(input1);
        b = Integer.parseInt(input2);
        c = Integer.parseInt(input3);
        if ((a>b)&&(a>c))
            max = a;
        else if((b > a)&&(b > c))
            max = b;
        else
            max = c;
        JOptionPane.showMessageDialog(null,a+","+b+","+c+","+"中的最大数为:"+max,"最大数结果",JOptionPane.PLAIN_MESSAGE);
    }
}
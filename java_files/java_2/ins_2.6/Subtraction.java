/*
JOptionPane类提供静态方法showInputDialog()和showMessageDialog()分别用于输入和输出。
这两个方法的头的声明如下：
staticString showInputDialog(Object message)
staticString showMessageDialog(Component parentComponent,object message,String title,int messageType)
静态方法可以直接用类名直接调用
*/
import javax.swing.JOptionPane;
public class Subtraction{
    public static void main(String[] args){
        String firstNumber;               // 定义变量
        String secondNumber;
        int number1;
        int number2;
        int sub;
        firstNumber = JOptionPane.showInputDialog("输入第一个数:");       // 变量的赋值
        secondNumber = JOptionPane.showInputDialog("输入第二个数:");
        number1 = Integer.parseInt(firstNumber);                        // 将字符串型转换成整型
        number2 = Integer.parseInt(secondNumber);
        sub = number1 - number2;
        JOptionPane.showMessageDialog(null,"结果是"+sub,"结果",JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }
}
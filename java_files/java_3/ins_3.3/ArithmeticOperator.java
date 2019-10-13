import javax.swing.JOptionPane;
public class ArithmeticOperator{
    public static void main(String args[]){
        String input1;
        String input2;
        int a,b;
        int plus,minus;
        input1 = JOptionPane.showInputDialog("输入第一个数");
        input2 = JOptionPane.showInputDialog("输入第二个数");
        a = Integer.parseInt(input1);
        b = Integer.parseInt(input2);
        plus = a + b;
        minus = a - b;
        String s1 = a + "+" + b + "=" + plus + "\n";
        s1 += a + "-" + b + "=" + minus + "\n";
        s1 += a + "*" + b + "=" + (a*b) + "\n";
        s1 += a + "/" + b + "=" + (a/b) + "\n";
        s1 += a + "%" + b + "=" + (a%b) + "\n";
        JOptionPane.showMessageDialog(null,s1,"算术运算符",JOptionPane.PLAIN_MESSAGE);
    }
}
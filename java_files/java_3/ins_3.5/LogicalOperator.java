import javax.swing.JOptionPane;
public class LogicalOperator{
    public static void main(String args[]){
        String input1;
        String input2;
        boolean a,b;
        boolean ee;
        input1 = JOptionPane.showInputDialog("输入第一个布尔值:");
        input2 = JOptionPane.showInputDialog("输入第二个布尔值:");
        a = Boolean.valueOf(input1).booleanValue();
        b = Boolean.valueOf(input2).booleanValue();
        String s1 = "";
        s1 += a + "&&" + b + "=" + (a&&b) + "\n";
        s1 += a + "||" + b + "=" + (a||b) + "\n";
        s1 += "!" + a + "=" + (!a) + "\n";
        s1 += a + "&" + b + "=" + (a&b) + "\n";
        s1 += a + "|" + b + "=" + (a|b) + "\n";
        s1 += a + "^" + b + "=" + (a^b);
        JOptionPane.showMessageDialog(null,s1,"逻辑运算结果",JOptionPane.PLAIN_MESSAGE);
    }
}
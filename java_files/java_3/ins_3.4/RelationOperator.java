import javax.swing.JOptionPane;
public class RelationOperator{
    public static void main(String[] args){
        String input1;
        String input2;
        int a,b;
        boolean ee;
        input1 = JOptionPane.showInputDialog("输入第一个数:");
        input2 = JOptionPane.showInputDialog("输入第二个数:");
        a = Integer.parseInt(input1);
        b = Integer.parseInt(input2);
        ee = (a != b);
        String s1 = a + ">" + b + "=" + (a>b) + "\n";
        s1 += a + "<" + b + "=" + (a<b) + "\n";
        s1 += a + ">=" + b + "=" + (a >= b) + "\n";
        s1 += a + "<=" + b + "=" + (a<=b) + "\n";
        s1 += a + "==" + b + "=" + (a == b) + "\n";
        s1 += a + "!=" + b + "!=" + ee + "\n";
        JOptionPane.showMessageDialog(null,s1,"比较关系运算结果",JOptionPane.PLAIN_MESSAGE);
    }
}
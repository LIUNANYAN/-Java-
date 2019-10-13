// 用do-while语句实现从1加到n的结果
import javax.swing.JOptionPane;
public class DoWhileTry{
    public static void main(String args[]){
        int m = 1;
        int n = Integer.parseInt(JOptionPane.showInputDialog("请输入你的数字:"));
        int sum = 0;
        do{
            sum = sum + m;
            m++;
        }while(m <= n);
        JOptionPane.showMessageDialog(null,"从1加到"+n+"的结果是:"+sum,"结果",JOptionPane.PLAIN_MESSAGE);
    }
}
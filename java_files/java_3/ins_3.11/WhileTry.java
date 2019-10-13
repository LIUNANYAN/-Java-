// 用while语句实现从1加到n的和
import javax.swing.JOptionPane;
public class WhileTry{
    public static void main(String args[]){
        String n;
        int sum = 0;
        int m = 1;
        n = JOptionPane.showInputDialog("请输入数字:");
        int n_int = Integer.parseInt(n);
        while(m <= n_int){
            sum = sum + m;
            m++;
        }
        System.out.println("从1加到"+n+"的结果是:"+sum);
    }
}
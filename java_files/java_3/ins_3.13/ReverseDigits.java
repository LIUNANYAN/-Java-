/*输入一个整数，将各位数字反转后输出
*2019.10.5
*liunanyan
*《java面向对象程序设计-张桂珠》
*/
import javax.swing.JOptionPane;
class ReverseDigits{
    public static void main(String args[]){
        int n,rightDight;
        String str = JOptionPane.showInputDialog("Input a Integer number: ");
        String output = "";
        n = Integer.parseInt(str);
        do{
            rightDight = n % 10;
            output = output + rightDight;
            n = n /10;
        }while(n!=0);
        JOptionPane.showMessageDialog(null, "the reverse dights is: "+output,"结果",JOptionPane.PLAIN_MESSAGE);
    }
}
// 输入2019年的日期，输出是2019年第几天
import javax.swing.JOptionPane;
public class Problem_2{
    public static void main(String args[]){
        int yue = Integer.parseInt(JOptionPane.showInputDialog("请输入月份: "));
        int ri = Integer.parseInt(JOptionPane.showInputDialog("请输入日期: "));
        int num = 0;
        for (int i = 1;i< yue;i++){
        if((i==1)||(i ==3)||(i==5)||(i==7)||(i==8)||(i==10)||(i==12)){
            num = num + 31;
        }
        if((i==4)||(i==6)||(i==11)||(i==9)){
            num = num + 30;
        }
        if (i == 2){
            num = num + 28;
        }
        }
        num = num+ri;
        JOptionPane.showMessageDialog(null,"今天是2019年第 "+num+" 天");
    }
}
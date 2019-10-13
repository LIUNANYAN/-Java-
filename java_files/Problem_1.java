// i以内的所有素数之和
import javax.swing.JOptionPane;
public class Problem_1{
    public static void main(String args[]){
        int i = Integer.parseInt(JOptionPane.showInputDialog("请输入一个数"));
        int sum = 0;
        for(int j = 1;j<=i;j++){
        int flag = 0;
        for(int m = 1;m <=j;m++){
            if(j%m == 0){
                flag = flag + 1;
            }
        }
        if (flag==2){
            sum = sum + j;
        }
        else{
        }
        }
        JOptionPane.showMessageDialog(null,i+" 以内的素数之和为: "+sum);
    }
}
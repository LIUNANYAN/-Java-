import javax.swing.JOptionPane;
public class Ti_1{
    public static void main(String[] args){
        String xin_min;
        String sex;
        xin_min = JOptionPane.showInputDialog("请输入你的姓名:");
        sex = JOptionPane.showInputDialog("请输入你的性别:");
        JOptionPane.showMessageDialog(null,xin_min + " " + sex,"personal message",JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }
}
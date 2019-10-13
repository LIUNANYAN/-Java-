// if 语句的使用
// 一个java应用程序由n个类组成，在这n个类中只能有一个是public类，只能有一个主类，主类中有一个main方法，它是应用程序执行的入口点
import javax.swing.JOptionPane;
class LeapYear{
    public static void main(String args[]){
        int year;
        boolean isLeapYear;
        String sYear = JOptionPane.showInputDialog("Enter the year:");
        year = Integer.parseInt(sYear);
        isLeapYear = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
        if(isLeapYear)
            sYear = year + " is a leap year";
        else
            sYear = year + " is not a leap year";
        JOptionPane.showMessageDialog(null,sYear,"结果",JOptionPane.PLAIN_MESSAGE);
    }
}
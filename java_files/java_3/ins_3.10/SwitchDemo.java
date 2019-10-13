// 输入一个0-100的整数，实现学生成绩的百分制到等级制的转换
public class SwitchDemo{
    public static void main(String args[]){
        String input = args[0];
        int score = Integer.parseInt(input);
        char grade;
        switch(score/10)
        {
            case 10:
            case 9:grade = 'A';
                break;
            case 8:grade = 'B';
                break;
            case 7:grade = 'C';
                break;
            case 6:grade = 'D';
                break;
            default:grade = 'F';
        }
        System.out.println("Your grade is "+grade);
    }
}
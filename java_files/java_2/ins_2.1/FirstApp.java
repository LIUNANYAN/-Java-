/*
一个java application由n个类组成，但这n个类中只能有一个是public类，且程序名必须与公共类名相同，一定要有一个类包含main方法
main方法的符号解释：
public:指明为公共方法，public方法可以被类的对象使用
static：指明方法是一个静态方法，而不是对象的方法，静态方法可以通过类名直接调用
void：表示main方法执行后不会有任何返回值
括号中的 String args[]是定义传递给main方法的参数，参数名为args，类型为String的数组
*/
public class FirstApp{
    public static void main (String args[]){
        System.out.println("This is the first Java Application!");    // 在命令行窗口输出一行文本
    }
}
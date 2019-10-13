/*用for语句求 1+2+3……+100
*2019.10.5
*liunanyan
*《java面向对象程序设计-张桂珠》
*/
public class ForTry{
    public static void main(String args[]){
        int i;
        int sum = 0;
        for(i = 1; i<=100; i++){
            sum += i;
        }
        System.out.println("sum = "+sum);
    }
}

/*输入一个整数，求出它的所有因子
*2019.10.5
*liunanyan
*《java面向对象程序设计-张桂珠》
*/
class Factors{
    public static void main(String args[]){
        int n = Integer.parseInt(args[0]);
        for(int k = 1;k<= n;k++){
            if(n%k == 0){
                System.out.print(k+" ");
            }
//        System.out.println("");
        }
    }
}
public class Leixing_zhuanhuan{
    public static void main(String args[]){
        int ival = 128;
        long lval = 1000;
        short sval = 12;
        byte bval = 2;
        char cval = 'a';
        float fval = 5.67f;
        double dval = .1234;
        lval = ival;
        dval = fval;             // 自动转换，加宽转换                                    余数范围：-128～127
        bval = (byte) ival;      // 被强制转换位byte变量时，其结果是 这个数除以256得到的余数， 如：128 / 256 的余数为128，则结果是-128
                                 //                                                    258 / 256 的余数为2，则结果为2
        ival = cval + 1;         // 自动转换，将‘a’对应的Unicode值97转换为32位的int型再加1，得到结果128
        lval = (long) fval;      // 强制转换
        System.out.printf("sval = %d\n",sval);
        System.out.println(bval);
        
    }
}

/*
在java中print,printf,println的区别
print(),将参数显示在命令行窗口
printf(),格式化输出
println(),将参数显示在命令行窗口后换行
*/
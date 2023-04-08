package 数据类型;
        /* 基本数据类型转换
         * 介绍：当java程序在进行赋值或者运算时，精度小的类型自动转环为精度大的数据类型的过程叫做基本数据类型转换
         * 数据类型按精度（容量）大小排序为（规则）：
         * char->int->long->float->double
         * byte->short->int->long->float->double
         */
         
         /* 自动类型转换注意和细节
          * 有多种类型数据混合运算时，系统首先自动将所有数据转换成容量最大的那种数据，然后再进行计算 
          * 当我们把精度大的数据类型赋值给精度小的数据类型时，就会报错，反之就会进行自动类型转换
          * （byte，short）和char之间无法进行相互自动转换
          * byte，short，char他们三者可以计算，在计算时首先转换为int类型
          * boolean不参与转换
          * 自动提升原则：表达式运算结果的类型自动提升为操作数中精度最大的数据类型
          * 
          * 
          */
        public class AutoConvertDetail {
             public static void main(String[]args){
            	 //演示自动转换
            	 int num='a';//正确，char类型->int类型
            	 double d=10;//正确，int类型->double类型
            	 System.out.println(num);//输出97
            	 System.out.println(d);//输出10.0
            	 //细节1：
            	 //有多种类型数据混合运算时，系统首先自动将所有数据转换成容量最大的那种数据，然后再进行计算 
            	 int n1=10;
            	 //float d1=n1+1.1;//错误，因为1.1在java中默认为double型，1.1+n1=>结果类型为double
            	 double d1=n1+1.1;//正确，因为1.1+n1=>结果类型为double型
            	 float d2=n1+1.1F;//正确，因为1.1F为float型，1.1+n1=>结果类型为float型	
            	 
            	 //细节2
            	 //当我们把精度大的数据类型赋值给精度小的数据类型时，就会报错，反之就会进行自动类型转换
            	 double d3=20;//正确，讲int类型赋值给double类型没有问题
            	 //int n2=5.0// 错误，不能讲double类型赋值给int类型
            	 
            	 //细节3
            	 //（byte，short）和char之间无法进行相互自动转换
            	 //当把具体数赋值给byte时，先判断该数是否在byte范围内，如果是就可以
            	 byte b1=10;//正确，byte范围在-128~127之间
            	 //int n2=1;
            	 //byte b2=n2;//错误，因为先前已经明确讲n2定义为int类型，int类型不可以赋值给byte类型
            	 //
            	 //char c1=b1;//错误，因为byte类型不可以与char类型相互转换
            	 
            	 //细节4:
            	 //byte，short，char他们三者可以计算，在计算时首先转换为int类型
            	 byte b2=1;
            	 short s1=1;
            	 byte b3=2;
            	 //short s2=s1+b2;//错误，b2+s1=>int类型 ，不能赋值给short类型
            	 int s2=s1+b2;//正确，b2+s1=>int类型          	 
            	 //**byte b4=b2+b3;//错误，因为b2+b3=>int类型，不能赋值给byte类型 **
            	 
            	 //细节5
            	 //boolean不参与转换
            	 boolean pass=true; 
            	 //int num=pass;//错误，因为boolean不参与转换
            	 
            	 //细节6
            	 //自动提升原则：表达式运算结果的类型自动提升为操作数中精度最大的数据类型
            	 //例题
            	 byte b4=1;
            	 short s3=100;
            	 int num200=1;
            	 float num300=1.5F;
            	 double num500=b4+s3+num200+num300;//正确，该式运算结果类型为float型，把float型赋值给double型没有问题
            	 
            	 
             }
        	
        	
        	
}

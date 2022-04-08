package cyber.succes.biz;

public class Test {

    
		int a;
		int b;
		int c;
	
		public Test()
		{
         a=10;
         b=20;
         c=30;
         System.out.println("running zero parameter constructor");
	}
        public Test(int num1)
        {
        	a=num1;
        	System.out.println("the value of a is "+a);
        	System.out.println("running constructor with one parameter");
        }
        public Test(int num1,int num2)
        {
        	a=num1;
        	b=num2;
        	System.out.println("running constructor with two parameter");
        
        }
        public Test(int num1,int num2,int num3)
        {
        	a=num1;
        	b=num2;
        	c=num3;
        	System.out.println("running constructor with three parameter");
        
        }
        public static void main(String[] args)
        {
			Test t=new Test();
			t.addition();
			Test t1=new Test(100);
			t1.addition();
			Test t2=new Test(100,200);
			t2.addition();
			Test t3=new Test(100,200,300);
        	t3.addition();
        	Test1 tx=new Test1(12,6,73);
        	tx.multiplication();
        	
        	Test1 tx1=new Test1();
        	
        	tx1.intro("pravin", 23);
        	
        }
		
        
        public void addition()
        {
        	int sum =a+b+c;
        	System.out.println(sum);
        }
     
        
        	
        
}


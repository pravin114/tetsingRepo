package constructor;

public class Sample {
     int a=10;
     int b=15;
     int c=25;
     Sample()
     {
    	 System.out.println("zero parameter const");
     }
     Sample(int num1)
     {//this();
    	
    	 a=num1;
    	 System.out.println(num1);
     }
     Sample(int num1,int num2)
     { 
    	 a=num1;
    	 b=num2;
    	int sum=num1+num2;
    	System.out.println(sum);
     }
     Sample(int num1,int num2,int num3)
     {
    	 a=num1;
    	 b=num2;
    	 c=num3;
     int sum=num1+num2+num3;
     System.out.println(sum);
  
     }
	public static void main(String[] args) {
		Sample obj=new Sample();
		Sample obj1=new Sample(17);
		Sample obj2=new Sample(16,26);
		Sample obj3=new Sample(18,76,2);
	}
	
public void test(float h)
{
   System.out.println("this is non static method "+h);

}
}

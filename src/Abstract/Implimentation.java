package Abstract;

import IF_ELSE.candidate_details;
import net.bytebuddy.asm.Advice.This;

public class Implimentation extends Addition{
int a=100;
int b=200;
	public static void main(String[] args) {
	Implimentation obj=new Implimentation ();
           obj.Pss();
           candidate_details obj1=new candidate_details();
           obj1.database(); 
	}

	@Override
	public void Pss() 
	{ 
		int Sum=super.a+super.b;
	
	System.out.println(Sum);
	
	int sub=this.a-this.b;
	System.out.println(sub);
	}
}

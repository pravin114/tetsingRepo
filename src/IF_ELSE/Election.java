package IF_ELSE;

import java.util.Scanner;

public class Election {

	

	
	public static void main(String[] args) {
		int votes=12345;
		candidate_details obj=new candidate_details ();
      obj.candidate_name="pravin bhau";
      obj.age=27;
      obj.gender='m';
      obj.property_value=547546744.0f;
      obj.region="rajura";
      obj.married=false;
      
      if(votes>=12345)
      {
    	  obj.database();
      }
      else 
      {
    	  System.out.println("no one is eligible");
      }
	}
}


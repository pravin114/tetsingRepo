package inheritance;

public class Inheritance1 {

	public static void main(String[] args) {
		
		Mother m= new Mother();
		m.nature();
		Daughter d=new Daughter();
		d.nature();
		Mother.marriage();
        Daughter.marriage(); 
        Daughter.husband();
        Son s=new Son();
        		s.bullet();
        		s.rajdoot();
        Father f=new Father();
        f.rajdoot();
        f.bullet();
	}

}
 
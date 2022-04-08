package acces_specifier;

import constructor.Practise;

public class AccessM {
    public int a=123456;
    private int b=232323;
    protected int c=31321;
	public static void main(String[] args) {
		int a=98765;
System.out.println(a);
AccessM obj=new AccessM();
obj.ashu();
AccessM. pss();

	}
  void ashu()
{
	System.out.println(this.a);
}
static void pss()
{
    System.out.println("indian emmbacy");
}
}

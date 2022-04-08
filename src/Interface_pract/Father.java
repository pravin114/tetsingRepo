package Interface_pract;
    
public interface Father {
	public void money();
	public void rule();
	int b=10;
	
	static void property()
	{
		System.out.println("father have large property");
	}
	default void con()
	{
		System.out.println("defalut method");
	}
}

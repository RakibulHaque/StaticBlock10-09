class Name
{
	static int i;
	
	static {
		i=10;
		System.out.println("static block called");
		
	}
	Name(){
		System.out.println("Constructor called");
		
	}
	
}
public class StaticMain {
	public static void main(String[] args)
	{
		Name a1 = new Name();
		
		Name a2 = new Name();
		
		System.out.println("value of i= "+Name.i);
		
	}

}

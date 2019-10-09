
public class InitializerBlock {
//initializer block
	
	{
		System.out.println("initial block");
	}
	
	public InitializerBlock()
	{
		System.out.println("default constructor");
		
	}
	public InitializerBlock(int x)
	{
		System.out.println("Parameterized costructor");
	}
	
	public static void main(String[] args)
	{
		InitializerBlock a1 = new InitializerBlock();
		InitializerBlock a2 = new InitializerBlock(5);
		
	}
	
}

package lab3;

public class exercise8 {

public static void main(String[] args) {
		
		exercise8 ex8=new exercise8();
		boolean b = ex8.isPositiveString("ACDE");
		System.out.println(b);
	}
	public boolean isPositiveString(String str)
	{
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)>=str.charAt(i+1))
			{
				return false;
			}
		
		}
		return true;
	}

}


package lab3;
/*
 * Create a method which accepts a String 
 * and replaces all the consonants in the String with the next alphabet
 */
public class exercise2 {


	public static void main(String[] args)
	{
		
		String name="jupiter";
		exercise2 ex2=new exercise2();
		System.out.println(ex2.getImage(name));
	}
	
	public String getImage(String img)
	{
		StringBuffer sb= new StringBuffer(img);
		sb.reverse();
		String img2 = img.concat("|");
		String img1=new String(sb);
		String img3= img2.concat(img1);
		return img3;
	
	}
}

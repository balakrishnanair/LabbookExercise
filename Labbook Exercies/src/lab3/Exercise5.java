package lab3;

//Write a Java program that displays the number of characters, 
//lines and words in a text? 


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exercise5 {

	public static void main(String args[]) {
		

		String str=" What is Lorem Ipsum?\r\n"
				+ "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
		Exercise5 ex5 = new Exercise5();
		ex5.charlinewordcalc(str);
	}
	public void charlinewordcalc(String str)
	{
		int charcount=0;
		int linecount=0;
		int wordcount=1;
		for(int i=0;i<str.length();i++)
		{
			charcount++;
			if(str.charAt(i)==' ')
			{
				wordcount++;
			}
			if(str.charAt(i)==',')
			{
				wordcount++;
				i++;
				charcount++;
			}
			if(str.charAt(i)=='/')
			{
				wordcount++;
			}
			
			if(str.charAt(i)=='.')
			{
				linecount++;
			}
		}
		System.out.println("Number of lines="+linecount);
		System.out.println("Number of words="+wordcount);
		System.out.println("Number of characters="+charcount);
	}
}

	



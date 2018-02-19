package assignment1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Student {
	int rollno;
	String name;
	char grade;
	double eng_marks, math_marks, sci_marks, total_marks, average;
	
	void cal_total()
	{
		total_marks=eng_marks+math_marks+sci_marks;
		System.out.println("total_marks are");

		System.out.println(total_marks);
	}
	void cal_average()
	{
		average=total_marks/3;
		System.out.println("average is ");

		System.out.println(average);
		}
	void find_grade()
	{
		if(average>=80)
		{
			System.out.println("Grade is A");
			}
		else if(average<80 && average>=70)
		{
			System.out.println("Grade is B");

		}
		else if(average<70 && average<=60)
		{
			System.out.println("Grade is C");

		}
		else
			System.out.println("Grade is D");

	}
	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub

		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		Student[] s=new Student[5];
		for(int i=0;i<5;i++)
		{
			s[i]=new Student();
		}
		int count=0;
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the rollno of the student");
		s[i].rollno=Integer.parseInt(br.readLine());
		for(int j=0;j<i;j++)
			{
				if(s[i].rollno==s[j].rollno)
					
				{
				count++;
				}
			}
			if(count!=0)
			{
				System.out.println("Two students can not have same roll no");
				continue;
				
			}
			System.out.println("Enter the name of the student");
			s[i].name=br.readLine();
			System.out.println("Enter english marks");
			s[i].eng_marks=Integer.parseInt(br.readLine());
			System.out.println("Enter math marks");
			s[i].math_marks=Integer.parseInt(br.readLine());
			System.out.println("Enter science marks");
			s[i].sci_marks=Integer.parseInt(br.readLine());
			
			s[i].cal_total();
			s[i].cal_average();
			s[i].find_grade();
			
		}
		
		{
			
		}
		
	}

}

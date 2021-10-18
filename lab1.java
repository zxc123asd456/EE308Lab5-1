package lab5;

import java.util.Random;
import java.util.Scanner;
public class lab1 {
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your grade? input:");
		int Grade = sc.nextInt();
		System.out.print("Please enter the number of questions? input:");
		double Q_num = sc.nextDouble();
		double score = 0;
		if(Grade == 1||Grade == 2) 
		{
			score = grade1_2(Q_num);
		}
		else if(Grade == 3||Grade == 4)
		{
			score = grade3_4(Q_num);
		}
		else if(Grade == 5||Grade == 6)
		{
			score = grade5_6();
		}
		if(score == 100) {
			System.out.println("end! All right, that's great! Your score is 100.");
		}else {
			System.out.println("end! Wrong question, your score is "+ score +".");
		}
	}
	
	public static double grade1_2(double Q_num) 
	{
		int MAX = 99;
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		int sign;//'-'=0,'+'=1
		int result = 0;
		int reply = 0;
		double right_num = 0;
		double score  = 0;
		for(int i = 0;i<Q_num;i++) {
			num1 = rand.nextInt(MAX+1);//0-99
			num2 = rand.nextInt(MAX+1);//0-99
			sign = rand.nextInt(2);
			if(sign == 1) {
				System.out.print(num1+""+"+"+""+num2+"=?"+" input reply = ");
			}
			else if(sign == 0)
			{
				System.out.print(num1+""+"-"+""+num2+"=?"+" input reply = ");
			}
			reply = sc.nextInt();
			if(sign == 1) {
				result = num1+num2;
			}
			else if(sign == 0)
			{
				result = num1-num2;
			}
			if(result == reply) {
				right_num++;
			}
		}
		score = 100.0*(right_num/Q_num);
		return score;
	}
	public static double grade3_4(double Q_num)
	{
		int MAX = 99;
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		int sign;//'-'=0,'+'=1,'*'= 2,'/' = 3
		String result = "";
		String reply = "";
		double right_num = 0;
		double score  = 0;
		for(int i = 0;i<Q_num;i++) {
			num1 = rand.nextInt(MAX+1);//0-99
			num2 = rand.nextInt(MAX+1);//0-99
			sign = rand.nextInt(4);
			if(sign == 1) 
			{
				System.out.print(num1+"+"+num2+"=?"+" input reply = ");
			}
			else if(sign == 0)
			{
				System.out.print(num1+"-"+num2+"=?"+" input reply = ");
			}
			else if(sign == 2)
			{
				System.out.print(num1+"*"+num2+"=?"+" input reply = ");
			}
			else if(sign == 3)
			{
				System.out.print(num1+"/"+num2+"=?"+" input reply = ");
			}
			double Temp = sc.nextDouble();
			reply  = String.format("%.2f", Temp);
			if(sign == 1) 
			{
				Temp = num1+num2;
				result = String.format("%.2f",Temp);
			}
			else if(sign == 0)
			{
				Temp = num1-num2;
				result = String.format("%.2f",Temp);
			}
			else if(sign == 2)
			{
				Temp = num1*num2;
				result = String.format("%.2f",Temp);
			}
			else if(sign == 3)
			{
				Temp = (double)num1/num2;
				result = String.format("%.2f",Temp);
			}
			if(result.equals(reply)) {
				right_num++;
			}
		}
		score = 100.0*(right_num/Q_num);
		return score;
	}
	public static double grade5_6(double Q_num)
	{
		int MAX = 99;
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		int sign;//'-'=0,'+'=1,'*'= 2,'/' = 3
		String result = "";
		String reply = "";
		double right_num = 0;
		double score  = 0;
		for(int i = 0;i<Q_num;i++) {
			num1 = rand.nextInt(MAX+1);//0-99
			num2 = rand.nextInt(MAX+1);//0-99
			sign = rand.nextInt(4);
			if(sign == 1) 
			{
				System.out.print(num1+"+"+num2+"=?"+" input reply = ");
			}
			else if(sign == 0)
			{
				System.out.print(num1+"-"+num2+"=?"+" input reply = ");
			}
			else if(sign == 2)
			{
				System.out.print(num1+"*"+num2+"=?"+" input reply = ");
			}
			else if(sign == 3)
			{
				System.out.print(num1+"/"+num2+"=?"+" input reply = ");
			}
			double Temp = sc.nextDouble();
			reply  = String.format("%.2f", Temp);
			if(sign == 1) 
			{
				Temp = num1+num2;
				result = String.format("%.2f",Temp);
			}
			else if(sign == 0)
			{
				Temp = num1-num2;
				result = String.format("%.2f",Temp);
			}
			else if(sign == 2)
			{
				Temp = num1*num2;
				result = String.format("%.2f",Temp);
			}
			else if(sign == 3)
			{
				Temp = (double)num1/num2;
				result = String.format("%.2f",Temp);
			}
			if(result.equals(reply)) {
				right_num++;
			}
		}
		score = 100.0*(right_num/Q_num);
		return score;
	}
}

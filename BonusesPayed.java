import java.util.Scanner;

public class BonusesPayed {
	public static void main(String[] args) {

		int bonuse[][]={{25,45,80,110,150},{50,75,90,120,180},{100,125,160,210,265},{160,190,225,275,340},{235,265,325,385,450},{300,360,420,480,600},{425,500,585,725,875}};
        try (Scanner calc = new Scanner(System.in)) {
			System.out.print("How many employees are there working currently? ");
			 int c=calc.nextInt();
			 int sum=0;
			 while(c>0)
			 {
			     System.out.print("What is the number of weeks that the employee has worked? ");
			     int row=calc.nextInt();
			     System.out.print("What is the number of positive reviews that the employee has received? ");
			     int col=calc.nextInt();
			     if(col>=4)
			     {
			         col=4;
			     }
			     if(row>=6)
			         row=6;
			     System.out.println("The bonus the employee will get for there work review $"+bonuse[row][col]);
			     
			     sum+=bonuse[row][col];
			     
			     c--;
			 }
			 System.out.println("Total amount of bonus payed to employee $"+sum);
		}

		}
}

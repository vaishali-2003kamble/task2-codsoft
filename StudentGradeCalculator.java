import java.util.*;
class StudentGradeCalculator
{
public static void main(String[] argus)
{
Scanner sc=new Scanner(System.in);
int i;
System.out.println("Enter how many subject are there :- ");
int SubNo=sc.nextInt();
int marks[]=new int[SubNo];
int total=0;
double avg=0;
System.out.println("Enter subject marks out of 100 :- ");
for(i=0;i<SubNo;i++)
{
marks[i]=sc.nextInt();

total=total+marks[i];

avg=total/SubNo;

}
System.out.println("Total marks in all subject :- "+total);
System.out.println("Average is :- "+avg);
if(avg>80)
{
System.out.println("Grade is :- A");
}
else if(avg<=80 && avg>60)
{
System.out.println("Grade is :- B");
}
else if(avg<=60 && avg>50)
{
System.out.println("Grade is :- C");
}
else if(avg<=50 && avg>40)
{
System.out.println("D");
}
else
{
System.out.println("Grade is :- Fail");
}

}
}
import java.util.Scanner;

class Student{
    String studentname;
    int rollno;
    int s1,s2,s3;
    int total;
    double percentage;
    Scanner sp = new Scanner(System.in);
  void studentdetails(){
System.out.println("enter the name of student");
      studentname = sp.nextLine();
      System.out.println("enter th roll number");
      rollno = sp.nextInt();
      System.out.println("enter the  firstsubject  marks");
      s1 = sp.nextInt();
      System.out.println("enter the secondsubject marks");
      s2 = sp.nextInt();
      System.out.println("enter the thirdsubject marks");
      s3 = sp.nextInt();
      sp.nextLine();
  }

// total and percentage 
void calc(){
    total = s1+s2+s3;
    System.out.println("total is " + total);
    percentage = total/3.00;
    System.out.println("percentage is "+ percentage);
    System.out.println("the caluculation is completed");
}

void show(){
System.out.println("----student details ----");
System.out.println(" name of student is " + studentname);
System.out.println(" roll number is  " + rollno);
System.out.println(" s1 marks is " + s1);
System.out.println(" s2 marks is " + s2);
System.out.println(" s3 marks is " + s3);
System.out.println(" total marks is " + total);
System.out.println(" total percentage  is " + percentage);
}

}
public class StudentProgram {
    public static void main(String[] args) {

Scanner sp = new Scanner(System.in);
Student st = new Student();
int choice;
do{
    System.out.println("--- student utuility program----");
    System.out.println("1.enter student details ");
    System.out.println("2.calc total and percentage");
    System.out.println("3.show result");
    System.out.println("4.exit");
    System.out.println("enter your choice");
choice = sp.nextInt();

switch(choice){

case 1:
    st.studentdetails();
    break;
case 2:
    st.calc();
    break;
case 3:
    st.show();
    break;
 case 4:
    System.out.println("exited ");    
    break;
 default :
 System.out.println("invalid choice");          
}
}

while (choice != 4) ;

sp.close();        
    }
}

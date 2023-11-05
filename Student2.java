import java.util.Scanner;
public class Student2 {
    int marks;
    String rollno;
    String name;
    public Student2(String name,String rollno,int marks){
        this.name=name;
        this.rollno=rollno;
        this.marks=marks;
    }
    public int getMarks(){
        return this.marks;
    }
    public String getRollno(){
        return this.rollno;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String rollno){
        this.rollno=rollno;
    }
    public void setMarks(){
        this.marks=marks;
    }
    public void setRollno(String rollno){
        this.rollno=rollno;
    }
    public static void main(String[]args){
        Student2 s1=new Student2("anirudh","22scse1012524",85);
        Student2 s2=new Student2("Anubhav","22Scse1012437",33);
        System.out.println(" Name is "+s1.getName()+" Roll no. is "+s1.getRollno()+"Marks is "+s1.getMarks());
    }
}

import java.io.PrintStream;
import java.util.Scanner;
public class Student {
        int age;
        String rollno;
        String name;
        //non-parameterised constructor
        public Student(){

        }
        //parameterised constructor
        public Student(int age,String rollno,String name){
            this.age=age;
            this.rollno=rollno;
            this.name=name;
        }
        public int getAge(){
            return this.age;
        }
    public String getRollno(){
        return this.rollno;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
            this.age=age;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setRollno(String rollno){
        this.rollno=rollno;
    }
    public static void main(String[]args){
            Student s1=new Student(21,"22SCSE1012524","Anirudh");
            Student s2=new Student(22,"22SCSE1012437","Anubhav");
            s2.setName("Tripathi");
            s2.setAge(17);
            System.out.println("Age is "+s1.getAge()+" Roll no. is "+s1.getRollno()+" Name is "+s1.getName());
            System.out.println("Updated Age is "+s2.age+" Roll no. is "+s2.rollno+" updated Name is "+s2.name);
    }
}

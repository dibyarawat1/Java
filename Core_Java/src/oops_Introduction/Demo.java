package oops_Introduction;

public class Demo {
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student();
        s1.name = "Rohan";
        s1.age = 18;
        s1.rollNumber=12;
        s1.college="GLA";


        s2.name = "Mohan";
        s2.age = 19;
        s2.rollNumber = 14;
        s2.college = "GLA";
        s1.markAttendance();
        s2.markAttendance();
        s1.print();
        s2.print();
    }

}
class Student{
    String name;
    int age;
    int rollNumber;
    String college;
    void markAttendance(){
        System.out.println("Attendance marked by" + name);
    }
    void print(){
        System.out.println(name+" "+age+" "+rollNumber+" "+college);
    }
}

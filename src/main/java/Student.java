import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {
    int rollNo;
    String name;
    int marks;

    Student(int rollNo,String name,int marks){
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public static Student findTopper(List<Student> students){
        Student topper = null;
        int maxmarks=0;
        for(int i=0;i<students.size();i++){
            if(students.get(i).marks>maxmarks){
                topper = students.get(i);
                maxmarks = students.get(i).marks;
            }
        }
        return topper;
    }

    public static void main(String[] args){
        Student student1 = new Student(12,"rakesh",95);
        Student student2 = new Student(1,"gulshan",35);
        Student student3 = new Student(2,"manjunath",50);
        Student student4 = new Student(6,"suhas",12);
        Student student5 = new Student(7,"praveen",70);

        List<Student> students = Arrays.asList(student1, student2, student3, student4, student5);

        Student topper = findTopper(students);

        System.out.println("The topper is " + topper.name + " marks is " + topper.marks);

    }

}

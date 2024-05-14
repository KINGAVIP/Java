package OOP;
// Write a Java program to create a class called "Student" with a name, grade, and courses attributes, and methods to add and remove courses.
class Student {
    private  String name;
    private String grade;
    private String courses[];
    private int idx;
    Student(String name,String grade){
        idx=0;
        courses=new String[10];
        this.name=name;
        this.grade=grade;
    }

    void addcourse(String course)
    {
        courses[idx]=course;
        idx++;
    }

    void removecourse(int val)
    {
        idx--;
        for(int i=val;i<courses.length-1;i++)
        {
            courses[i]=courses[i+1];
        }
    }
    void displaycourses()
    {
        for(int i=0;i<idx;i++)
        {
            System.out.print(courses[i]);
            System.out.print(" ");
        }
    }
}
public class oop2{
    public static void main(String[] args) {
        Student avi=new Student("avi","A");
        avi.addcourse("Java");
        avi.addcourse("python");
        avi.addcourse("C++");
        // avi.displaycourses();
        avi.removecourse(1);
        avi.displaycourses();
        System.out.println("");
        avi.addcourse("RAM");
        avi.addcourse("ROM");
        avi.removecourse(2);
        avi.removecourse(2);
        avi.displaycourses();

    }
}

// next time use an arraylist
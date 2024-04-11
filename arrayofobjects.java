class Student {
    //they are instance variables because they are of class not methods

    int rollno;
    int marks;
    String name;
}


public class arrayofobjects {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.rollno = 44;
        s1.marks = 95;
        s1.name = "Kabin";

        Student s2 = new Student();
        s2.rollno = 33;
        s2.marks = 90;
        s2.name = "Kanchan";

        Student s3 = new Student();
        s3.rollno = 15;
        s3.marks = 85;
        s3.name = "Kabina";


        Student students[] = new Student[3]; //on this line we are not creating three Student object rather we are creating array that holds Student references 
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        //displaying every objects
        for (int i = 0; i < students.length; i++) {
            System.out.println("Name: "+ students[i].name);
            System.out.println("Roll No: " + students[i].rollno);
            System.out.println("Marks: " + students[i].marks);
            
        }
    }
    
}

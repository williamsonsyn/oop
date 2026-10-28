class student{
    int rollNo;
    String name;

    student(String name,int rollNo) {

        name = name;
        rollNo = rollNo;    


    }

    

  



}
public class a{
    public static void main(String[] args) {
        
        student s1 = new student("hariom",21);
        System.out.println(s1.rollNo);
        System.out.println(s1.name);


    }
}
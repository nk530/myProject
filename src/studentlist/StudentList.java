
package studentlist;

/**
 *
 * @author nkjee
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //for storing and printing student list
        //Array
        Student[] list = new Student[3];
        //###
        
        Student s1 = new Student();
        s1.setStudentAge(23);
        s1.setStudentName("MamE");
        //###
        
        Student s2 = new Student();
        s2.setStudentAge(23);
        s2.setStudentName("Visen");
        //###
        
        Student s3 = new Student();
        s3.setStudentAge(23);
        s3.setStudentName("Munean");
        //###
        
        //Manual assigning values of s1, s2 and s3 to array //Can also use for loop
        list[0]=s1;
        list[1]=s2;
        list[2]=s3;
        
        //Displaying (output) data to screen
        for(int i=0;i<3;i++){
            System.out.println("Student name and age is: " + list[i].getStudentName() + " " + list[i].getStudentAge());
        }
    }
    
}

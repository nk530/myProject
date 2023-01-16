/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentlist;

/**
 *
 * @author nkjee
 */
public class Student {
    private int studentAge;
    private String studentName; //so that other classes cannot access and modify class "Student" variable

    /**
     * @return the studentAge
     */
    public int getStudentAge() {
        return studentAge;
    }

    /**
     * @param studentAge the studentAge to set
     */
    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    /**
     * @return the studentName
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * @param studentName the studentName to set
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
}

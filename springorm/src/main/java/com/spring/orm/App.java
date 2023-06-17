package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        
        
//        Student student = new Student(12345, "Aditya Gautam", "Kolkata");
//		int r = studentDao.insert(student);
//		
//		System.out.println("done " + r);
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        boolean runApp = true;
        while(runApp) {
        	 System.out.println("PRESS 1 to add new Student");
             System.out.println("PRESS 2 to display all student");
             System.out.println("PRESS 3 to get detail of single student");
             System.out.println("PRESS 4 to delete student");
             System.out.println("PRESS 5 to update student");
             System.out.println("PRESS 6 to Exit");
             
             try {
            	
            	 int input = Integer.parseInt(bufferedReader.readLine());
            	 
            	 switch (input) {
				case 1:
					//add new Student
					System.out.println("Enter studentId : ");
					 int studentId = Integer.parseInt(bufferedReader.readLine());	 
					 
					System.out.println("Enter studentName : ");
					 String studentName = bufferedReader.readLine(); 
					 
					System.out.println("Enter studentCity : ");
					 String studentCity = bufferedReader.readLine();
					
					Student student = new Student(studentId, studentName, studentCity);
					int r = studentDao.insert(student);
					System.out.println(r + " : student added");
					System.out.println("************************************************");
					System.out.println();
					break;
				case 2:
					//display all student
					 System.out.println("************************************************");
					 List<Student> students = studentDao.getAllStudent();
					 for(Student list: students) {
						 System.out.println("___________________");
//						 System.out.println(list.toString());
						 System.out.println(list.getStudentId());
						 System.out.println(list.getStudentName());
						 System.out.println(list.getStudentCity());
					 }
					 System.out.println("************************************************");
						System.out.println();
					break;
				case 3:
					//get detail of single student
					  System.out.println("Enter studentId: ");
					   int u_id = Integer.parseInt(bufferedReader.readLine());
					   
					System.out.println(studentDao.getStudent(u_id));
					break;
				case 4:
					//delete student
					System.out.println("Enter studentId: ");
					 int delete_id = Integer.parseInt(bufferedReader.readLine());
					 
					 studentDao.deleteStudent(delete_id);
					 System.out.println(delete_id + " deleted");
					break;
				case 5:
					//update student
					System.out.println("Enter studentId to find then update : ");
					 int findStudentId = Integer.parseInt(bufferedReader.readLine());
					 
					 System.out.println(studentDao.getStudent(findStudentId));
					 
					System.out.println("Enter updateStudentName : ");
					 String updateStudentName = bufferedReader.readLine(); 
					 
					System.out.println("Enter updateStudentCity : ");
					 String updateStudentCity = bufferedReader.readLine();
					
					Student updatedStudent = new Student(findStudentId, updateStudentName, updateStudentCity);
					studentDao.updateStudent(updatedStudent);
					
					System.out.println(updatedStudent + " : student updated");
					break;
				case 6:
					//Exit
					runApp = false;
					break;
				}
				
			} catch (Exception e) {
				System.out.println("Invalid Input, Please Press a Valid Key");
			}
        }
        System.out.println("Thankyou for Using my Application!");
        System.out.println("Great day Ahead!!!!:)");
    }
}

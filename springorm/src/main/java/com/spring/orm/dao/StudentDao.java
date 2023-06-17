package com.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.Student;

public class StudentDao {
	
	private HibernateTemplate hibernateTemplate;
	
	//CRUD - CREATE, READ, UPDATE, DELETE
	
	//save student -CREATE
	@Transactional
	public int insert(Student student) {
		//insert
		Integer i = (Integer) this.hibernateTemplate.save(student);
		return i;
	}
	
	//READ single student
	public Student getStudent(int studentId) {
		Student student = (Student) this.hibernateTemplate.get(Student.class, studentId);
		return student;
	}
	//READ list of student
		public List<Student> getAllStudent() {
			List<Student>  student = this.hibernateTemplate.loadAll(Student.class);
			return student;
		}
	@Transactional
	//Delete student
		public void deleteStudent(int studentId) {
			Student student = this.hibernateTemplate.get(Student.class, studentId);
			this.hibernateTemplate.delete(student);
		}
	@Transactional
	//UPDATE student
		public void updateStudent(Student student) {
			this.hibernateTemplate.update(student);
		}
		
		
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
}

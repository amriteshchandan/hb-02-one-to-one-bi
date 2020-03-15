package com.amritesh.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.amritesh.hibernate.entity.demo.Instructor;
import com.amritesh.hibernate.entity.demo.InstructorDetail;

public class CreateDemo {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration()
										.configure("hibernate.cfg.xml")
										.addAnnotatedClass(Instructor.class)
										.addAnnotatedClass(InstructorDetail.class)
										.buildSessionFactory();
		
		Session session = null;
		
		try {
			session = sessionFactory.getCurrentSession();
			session.beginTransaction();

//			Instructor instructor1 = new Instructor("Ankur", "B", "ankur.b@gmail.com");
//			Instructor instructor2 = new Instructor("Amritesh", "C", "amritesh.c@gmail.com");
//			Instructor instructor3 = new Instructor("Aman", "R", "aman.r@gmail.com");
//
//			InstructorDetail instructorDetail3 = new InstructorDetail("https://www.youtube.com/aman", "Sitar");
//			InstructorDetail instructorDetail1 = new InstructorDetail("https://www.youtube.com/ankur", "Guitar");
//			InstructorDetail instructorDetail2 = new InstructorDetail("https://www.youtube.com/amritesh", "Violin");
//			
//			instructor1.setInstructorDetail(instructorDetail3);
//			instructor2.setInstructorDetail(instructorDetail1);
//			instructor3.setInstructorDetail(instructorDetail2);
//			
//			session.save(instructor1);
//			session.save(instructor2);
//			session.save(instructor3);
			
			
			Instructor instructor1 = new Instructor("AA", "BB", "AABB@gmail.com");
			InstructorDetail instructorDetail3 = new InstructorDetail("https://www.youtube.com/AABB", "xxxxx");
			instructor1.setInstructorDetail(instructorDetail3);
			session.save(instructor1);
			
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
		sessionFactory.close();
	}

}
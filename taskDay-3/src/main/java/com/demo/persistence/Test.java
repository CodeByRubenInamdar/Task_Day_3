package com.demo.persistence;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Test { // Changed class name to Test
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Ruben");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		// Persisting Student
		Student stud = new Student();
		stud.setName("Ruben");
		stud.setEmail("rubeninamdar@gmail.com");
		em.persist(stud);

		// Persisting Teacher
		Teacher teacher = new Teacher(); // Changed 'teacher' to 'Teacher'
		teacher.settName("Vipul");
		teacher.settDept("BBA");
		em.persist(teacher); // Removed duplicate persist

		em.getTransaction().commit();

		em.close();
		emf.close();

		System.out.println("Table Created and data Inserted");
	}
}

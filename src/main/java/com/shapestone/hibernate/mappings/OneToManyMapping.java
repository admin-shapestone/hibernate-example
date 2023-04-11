package com.shapestone.hibernate.mappings;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.shapestone.hibernate.entity.Student;
import com.shapestone.hibernate.util.HibernateUtil;
import com.shapestone.hibernate.util.MockData;

public class OneToManyMapping {

	public void insertData() {
		Session openSession = HibernateUtil.getSessionFactory().openSession();
		try (openSession) {
			Transaction beginTransaction = openSession.beginTransaction();
			List<Student> studentData = MockData.getStudentData();
			
			for (int index = 0 ; index < studentData.size(); index++) {
				Student student = studentData.get(index);
				openSession.persist(studentData.get(index));
			}
			beginTransaction.commit();
		}
		
	}

}

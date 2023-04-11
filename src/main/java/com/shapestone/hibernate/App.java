package com.shapestone.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.shapestone.hibernate.entity.Employee;
import com.shapestone.hibernate.mappings.OneToManyMapping;
import com.shapestone.hibernate.mappings.OnetoOneMappingExample;
import com.shapestone.hibernate.util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		OnetoOneMappingExample oneMappingExample = new OnetoOneMappingExample();
		oneMappingExample.insertData();
		getData(session);
		
		OneToManyMapping  oneToManyMapping = new OneToManyMapping();
		oneToManyMapping.insertData();
	}


	private static void getData(Session session) {
		try (session) {
			List<Employee> list = session.createQuery("from Employee", Employee.class).list();
			list.stream().forEach(employee -> System.out.println(employee.toString()));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

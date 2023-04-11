package com.shapestone.hibernate.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.shapestone.hibernate.entity.Address;
import com.shapestone.hibernate.entity.Certificates;
import com.shapestone.hibernate.entity.Employee;
import com.shapestone.hibernate.entity.Student;

public class MockData {
	public static List<Employee> getEmployeeList() {
		List<Employee> list = new ArrayList<>();
		
		Employee emp1 = new Employee();
		emp1.setFirstName("Naveen");
		emp1.setLastName("Ganta");
		emp1.setAge(27);
		
		Employee emp2 = new Employee();
		emp2.setFirstName("Vardhan");
		emp2.setLastName("Chava");
		emp2.setAge(27);
		
		Employee emp3 = new Employee();
		emp3.setFirstName("Karthik");
		emp3.setLastName("Darapaneni");
		emp3.setAge(27);
		
		Employee emp4 = new Employee();
		emp4.setFirstName("Krishnasri");
		emp4.setLastName("Athukuri");
		emp4.setAge(27);
		
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp1);
		return list;
		
	}
	
	public static List<Address> getAddressList() {
		List<Address> list = new ArrayList<>();
		Address add1 = new Address();
		add1.setAddressLine1("Manikonda");
		add1.setCity("Hyderabad");
		add1.setCountry("IN");
		add1.setPincode(500089);
		add1.setState("TS");
		
		Address add2 = new Address();
		add2.setAddressLine1("Nandigama");
		add2.setCity("Vijayawada");
		add2.setCountry("IN");
		add2.setPincode(521185);
		add2.setState("AP");
		
		Address add3 = new Address();
		add3.setAddressLine1("Kodad");
		add3.setCity("Kodad");
		add3.setCountry("TS");
		add3.setPincode(500089);
		add3.setState("TS");
		
		Address add4 = new Address();
		add4.setAddressLine1("Revuru");
		add4.setCity("Kodad");
		add4.setCountry("TS");
		add4.setPincode(500089);
		add4.setState("TS");
		
		list.add(add1);
		list.add(add2);
		list.add(add3);
		list.add(add4);
		
		return list;
	}
	
	public static List<Student> getStudentData() {
		List<Student> list = new ArrayList<>();
		Student student1 = new Student();
		student1.setEmail("naveen@shapestone.in");
		student1.setFatherName("RamaRao");
		student1.setName("Naveen");
		student1.setPhoneNumber(11111111);
		
		Set<Certificates> certificates = getCertificates();
		Certificates cert2 = new Certificates();
		cert2.setCost(10000);
		cert2.setCourseName("Spoken english");
		cert2.setInstituteName("Cambley");
		certificates.add(cert2 );
		student1.setCertifications(certificates);
		
		
		Student student2 = new Student();
		student2.setEmail("vardhan@shapestone.in");
		student2.setFatherName("Vardhan's Dad");
		student2.setName("Vardhan");
		student2.setPhoneNumber(2222222);
		student2.setCertifications(getCertificates());
		
		
		list.add(student1);
		list.add(student2);
		return list;
		
	}

	private static Set<Certificates> getCertificates() {
		Set<Certificates> certificates = new HashSet<>();
		Certificates cert1 = new Certificates();
		cert1.setCost(45000);
		cert1.setCourseName("Java programming");
		cert1.setInstituteName("Shapestone");
		certificates.add(cert1);
		return certificates;
	}
}

package com.shapestone.hibernate.mappings;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.shapestone.hibernate.entity.Address;
import com.shapestone.hibernate.entity.Employee;
import com.shapestone.hibernate.util.HibernateUtil;
import com.shapestone.hibernate.util.MockData;

public class OnetoOneMappingExample {

	public void insertData() {
		Session openSession = HibernateUtil.getSessionFactory().openSession();
		try (openSession) {
			Transaction beginTransaction = openSession.beginTransaction();
			List<Employee> employeeList = MockData.getEmployeeList();
			for(int index = 0 ; index < employeeList.size(); index++) {
				Employee emp = employeeList.get(index);
				Address address = MockData.getAddressList().get(index);
				emp.setAddress(address);
				openSession.save(emp);
			}
			beginTransaction.commit();			
		}
		
	}

}

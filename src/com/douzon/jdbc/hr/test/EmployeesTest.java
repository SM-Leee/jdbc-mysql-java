package com.douzon.jdbc.hr.test;

import java.util.List;

import com.douzon.jdbc.hr.dao.EmployeesDao;
import com.douzon.jdbc.hr.vo.EmployeesVo;

public class EmployeesTest {

	public static void main(String[] args) {
		
		getListTest("Georgi");
		getListTest("Parto");
		getListTest("Bamford");
		
		
	}
	
	public static void getListTest(String name) {
		EmployeesVo vo = new EmployeesVo();
		vo.setFirst_name(name);
		vo.setLast_name(name);
		
		List<EmployeesVo> list = new EmployeesDao().getList(vo);
		
		for(EmployeesVo vo1 : list) {
			System.out.println(vo1);
		}
	}

}

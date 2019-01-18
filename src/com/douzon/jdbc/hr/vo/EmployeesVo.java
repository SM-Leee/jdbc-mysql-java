package com.douzon.jdbc.hr.vo;

public class EmployeesVo {
	private Long emp_no;
	private String first_name;
	private String last_name;
	private String hire_date;
	public Long getEmp_no() {
		return emp_no;
	}
	public void setEmp_no(Long emp_no) {
		this.emp_no = emp_no;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getHire_date() {
		return hire_date;
	}
	public void setHire_date(String hire_date) {
		this.hire_date = hire_date;
	}
	@Override
	public String toString() {
		return "EmployeesVo [emp_no=" + emp_no + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", hire_date=" + hire_date + "]";
	}
	
	
	
}

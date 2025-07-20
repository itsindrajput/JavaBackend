package com.springCollection.Injection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
	private String emp_Code;
	private List<String> subject_Code;
	private Set<String> class_Code;
	private Map<String, String> sub_Duration;
	private Properties emp_Prop;
	
	public String getEmp_Code() {
		return emp_Code;
	}
	public void setEmp_Code(String emp_Code) {
		this.emp_Code = emp_Code;
	}
	public List<String> getSubject_Code() {
		return subject_Code;
	}
	public void setSubject_Code(List<String> subject_Code) {
		this.subject_Code = subject_Code;
	}
	public Set<String> getClass_Code() {
		return class_Code;
	}
	public void setClass_Code(Set<String> class_Code) {
		this.class_Code = class_Code;
	}
	public Map<String, String> getSub_Duration() {
		return sub_Duration;
	}
	public void setSub_Duration(Map<String, String> sub_Duration) {
		this.sub_Duration = sub_Duration;
	}
	public Properties getEmp_Prop() {
		return emp_Prop;
	}
	public void setEmp_Prop(Properties emp_Prop) {
		this.emp_Prop = emp_Prop;
	}
	
	public Employee(String emp_Code, List<String> subject_Code, Set<String> class_Code,
			Map<String, String> sub_Duration, Properties emp_Prop) {
		super();
		this.emp_Code = emp_Code;
		this.subject_Code = subject_Code;
		this.class_Code = class_Code;
		this.sub_Duration = sub_Duration;
		this.emp_Prop = emp_Prop;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
		
}

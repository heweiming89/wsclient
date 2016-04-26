package cn.heweiming.cxf.service.impl;

import java.util.List;

import org.junit.Test;

import cn.heweiming.cxf.client.Student;
import cn.heweiming.cxf.client.StudentService;
import cn.heweiming.cxf.client.StudentServiceWS;

public class StudentServiceTest {

	@Test
	public void test() {
		StudentServiceWS ws = new StudentServiceWS();
		StudentService studentService = ws.getStudentServicePort();
		List<Student> students = studentService.getStudents(false, "name");
		for (Student student : students) {
			System.out.println(student);
		}
	}

}

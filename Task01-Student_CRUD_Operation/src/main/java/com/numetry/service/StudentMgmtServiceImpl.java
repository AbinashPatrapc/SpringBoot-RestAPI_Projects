package com.numetry.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.numetry.model.Student;
import com.numetry.repository.IStudentRepo;
@Service("studService")
public class StudentMgmtServiceImpl implements IStudentMgmtService {
	@Autowired
	private IStudentRepo studrepo;

	@Override
	public List<Student> getAllStudent() {
		return studrepo.findAll();
	}

	@Override
	public String addStudent(Student stud) {
		int val=studrepo.save(stud).getStudRollNo();
		return "Student Registered With "+val+" Roll No";
	}

	@Override
	public String deleteStudent(int rollNo) {
		studrepo.deleteById(rollNo);
		return " Student having roll Number "+rollNo+" has been Deleted Successfully";
	}

	@Override
	public String editStudent(Student stud) {
		int val=studrepo.save(stud).getStudRollNo();
		return " Roll Number "+val+" Student Data is Updated";
	}

	@Override
	public Student getStudentByRollNo(int rollNo) {
		Student stud=studrepo.findById(rollNo).get();
		return stud;
	}

	

}

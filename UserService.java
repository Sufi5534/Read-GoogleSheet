package com.wheebox.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wheebox.dao.UserDao;
import com.wheebox.model.student_data;

@Service
public class UserService {

	@Autowired
	private UserDao userdao;
	
	public List <student_data> getAlldata()
	{
		System.out.println("service is working");
		return this.userdao.getAllitems();
	}
	
}

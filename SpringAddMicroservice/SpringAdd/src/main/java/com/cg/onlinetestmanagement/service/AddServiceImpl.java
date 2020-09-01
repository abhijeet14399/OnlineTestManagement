package com.cg.onlinetestmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.onlinetestmanagement.AdmDao.UserDao;
import com.cg.onlinetestmanagement.dto.UserDto;
import com.cg.onlinetestmanagement.entity.User;

@Service
public class AddServiceImpl implements AddService {

	@Autowired
	private UserDao udao;
	@Override
   @Transactional(readOnly=false)
	public String addUser(UserDto udto) {
	
		    User user=new User();
		    user.setUserId(udto.getUserId());
		    user.setUserName(udto.getUserName());
		    user.setUserPassword(udto.getUserPassword());
		    user.setUserCollegeName(udto.getUserCollegeName());
		    
		    udao.save(user);
		    return user.getUserId();
		   
		}
	}

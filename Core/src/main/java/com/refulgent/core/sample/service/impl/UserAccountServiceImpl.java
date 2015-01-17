package com.refulgent.core.sample.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.refulgent.core.sample.repo.UserRepository;
import com.refulgent.core.sample.service.UserAccountService;
import com.refulgent.entity.sample.UserAccount;

@Service
public class UserAccountServiceImpl implements UserAccountService {
	
	@Autowired
	UserRepository userRepository;

	
	@Override
	public void save(UserAccount userAccount) {
		// TODO Auto-generated method stub
		try {
			userRepository.insert(userAccount);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

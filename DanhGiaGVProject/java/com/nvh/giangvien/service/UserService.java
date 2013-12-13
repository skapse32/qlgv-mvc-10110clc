package com.nvh.giangvien.service;


import java.util.List;

import org.springframework.data.domain.Page; 
import org.springframework.data.domain.Pageable;

import com.nvh.giangvien.model.SearchCriteria;
import com.nvh.giangvien.model.User;

public interface UserService {

	public Page<User> findAllByPage(Pageable pageable);

	public User findById(String id);

	public List<User> findByTypeAccount(int type);
	
	public User save(User contact);

	public void delete(User contact);
	
	public Page<User> findUserByCriteria(SearchCriteria searchCriteria,
			Pageable pageable);

}

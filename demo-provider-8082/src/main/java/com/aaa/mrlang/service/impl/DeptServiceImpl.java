package com.aaa.mrlang.service.impl;


import com.aaa.mrlang.dao.DeptDao;
import com.aaa.mrlang.entity.Dept;
import com.aaa.mrlang.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService
{
	@Autowired
	private DeptDao dao;


	public boolean add(Dept dept)
	{
		return dao.addDept(dept);
	}


	public Dept get(Long id)
	{
		return dao.findById(id);
	}


	public List<Dept> list()
	{
		return dao.findAll();
	}
}

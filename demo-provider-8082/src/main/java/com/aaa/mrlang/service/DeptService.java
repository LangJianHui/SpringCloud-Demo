package com.aaa.mrlang.service;



import com.aaa.mrlang.entity.Dept;

import java.util.List;

public interface DeptService
{
	public boolean add(Dept dept);

	public Dept get(Long id);

	public List<Dept> list();
}

package com.multi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.dto.ReviewDTO;
import com.multi.frame.MyService;
import com.multi.mapper.ReviewMapper;

@Service
public class ReviewService implements MyService<Integer, ReviewDTO>{
	@Autowired
	ReviewMapper mapper;

	@Override
	public void register(ReviewDTO v) throws Exception {
		// TODO Auto-generated method stub
		mapper.insert(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		// TODO Auto-generated method stub
		mapper.delete(k);
	}

	@Override
	public void modify(ReviewDTO v) throws Exception {
		// TODO Auto-generated method stub
		mapper.update(v);
	}

	@Override
	public ReviewDTO get(Integer k) throws Exception {
		// TODO Auto-generated method stub
		return mapper.select(k);
	}

	@Override
	public List<ReviewDTO> get() throws Exception {
		// TODO Auto-generated method stub
		return mapper.selectAll();
	}
	
}

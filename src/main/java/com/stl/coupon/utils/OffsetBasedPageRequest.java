package com.stl.coupon.utils;

import java.io.Serializable;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public class OffsetBasedPageRequest implements Pageable, Serializable{

private static final long serialVersionUID = 1L;
	
	private int limit;
    private int offset;
    //private final Sort sort;
	
    @Override
	public int getPageNumber() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getPageSize() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public long getOffset() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Sort getSort() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Pageable next() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Pageable previousOrFirst() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Pageable first() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean hasPrevious() {
		// TODO Auto-generated method stub
		return false;
	}
    
	
 }


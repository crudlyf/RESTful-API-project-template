package com.xxx.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xxx.dao.xxxDao;
import com.xxx.service.xxxService;


@Component
public class xxxImpl implements xxxService {

	@Autowired
	RetailerDao xxxDao;
	
	
}

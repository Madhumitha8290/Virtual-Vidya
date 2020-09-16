package com.ts.dao;

import com.rest.dto.Instructor;
import com.rest.dto.Social;
import com.ts.db.HibernateTemplate;

public class SocialDAO {

	public int register(Social social) {
		//java.util.Date utilDate = new java.sql.Date(instructor.getJoinDate().getTime()); 
		return HibernateTemplate.addObject(social);
	}
}

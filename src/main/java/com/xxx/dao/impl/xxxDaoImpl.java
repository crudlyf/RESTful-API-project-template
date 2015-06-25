package com.xxx.dao.impl;

import java.sql.Types;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import org.bson.Document;
import org.json.JSONObject;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoDatabase;

import com.xxx.beans.XXX;
import com.xxx.dao.xxxDao;

@Component
public class xxxDaoImpl implements xxxDao {
	
	@Autowired
	private DataSource datasource;

	@Autowired
	private MongoDatabase database;
	
	@Autowired
	private Environment environment;
	
	private JdbcTemplate jdbcTemplate = new JdbcTemplate(datasource);
	
	private String sql;

	public JSONObject getxxxDetails(Long xxxId) {
		Document query = new Document("xxx_id", String.valueOf(xxxId));
		Document projection = new Document("_id", 0);
		FindIterable<Document> projectdocument = database.getCollection("xxx").find(query).projection(projection);
		return new JSONObject(projectdocument.first().toJson());
	}
	
	@Override
	public XXX getxxxDetails(long xxxId, String username) {
		sql = environment.getProperty(XXX_QUERY);
		XXX xxx = jdbcTemplate.queryForObject(sql, XXX.class, xxxId, username);
		return xxx;
	}		

}

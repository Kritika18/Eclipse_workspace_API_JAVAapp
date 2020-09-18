package com.web.MaterialNation.DAO;

import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.web.MaterialNation.DAOModel.User;

@Repository
public class UserDetailsDAO {

	private static Logger LOG = LoggerFactory.getLogger(UserDetailsDAO.class);
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public UserDetailsDAO(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public List<User> getUserDetails(String email) {
		String sql = "select firstname,lastname from users where email = '" + email + "'";
		LOG.debug("Fetching user details");
		List<User> results = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
		return results;

	}
}

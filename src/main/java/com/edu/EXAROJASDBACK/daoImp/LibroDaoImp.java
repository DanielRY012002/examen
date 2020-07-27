package com.edu.EXAROJASDBACK.daoImp;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.edu.EXAROJASDBACK.dao.LibroDao;
import com.edu.EXAROJASDBACK.entity.Libro;
@Repository
public class LibroDaoImp implements LibroDao {
	@Autowired
	private JdbcTemplate jdbctemplate;
	@Override
	public List<Libro> readAll() {
		// TODO Auto-generated method stub
		return jdbctemplate.query("select * from libro",BeanPropertyRowMapper.newInstance(Libro.class));
	}
}
package com.edu.EXAROJASDBACK.dao;
import java.util.List;
import com.edu.EXAROJASDBACK.entity.Libro;
public interface LibroDao {
	List<Libro> readAll();
}
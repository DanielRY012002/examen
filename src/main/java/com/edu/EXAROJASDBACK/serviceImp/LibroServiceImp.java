package com.edu.EXAROJASDBACK.serviceImp;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.edu.EXAROJASDBACK.dao.LibroDao;
import com.edu.EXAROJASDBACK.entity.Libro;
import com.edu.EXAROJASDBACK.service.LibroService;
@Service
public class LibroServiceImp implements LibroService {
	@Autowired
	private LibroDao librodao;
	@Override
	public List<Libro> readAll() {
		// TODO Auto-generated method stub
		return librodao.readAll();
	}
}
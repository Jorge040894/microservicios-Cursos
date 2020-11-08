package com.desarrolloweb.microservicios.app.cursos.services;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.desarrolloweb.microservicios.app.cursos.models.entity.Curso;
import com.desarrolloweb.microservicios.app.cursos.models.repository.CursoRepositoy;
import com.desarrolloweb.microservicios.commons.services.CommonServiceImpl;

@Service
public class CursoServiceImpl extends CommonServiceImpl<Curso, CursoRepositoy> implements CursoService {

	@Override
	@Transactional(readOnly = true )
	public Curso findCursoByAlumnoId(Long id) {
	
		return repository.findCursoByAlumnoId(id);
	}

	

}

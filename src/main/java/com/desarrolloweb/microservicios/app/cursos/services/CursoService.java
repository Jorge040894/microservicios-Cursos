package com.desarrolloweb.microservicios.app.cursos.services;

import com.desarrolloweb.microservicios.app.cursos.models.entity.Curso;
import com.desarrolloweb.microservicios.commons.services.CommonService;

public interface CursoService extends CommonService<Curso> {
	public Curso findCursoByAlumnoId (Long id);
}

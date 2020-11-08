package com.desarrolloweb.microservicios.app.cursos.models.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.desarrolloweb.microservicios.app.cursos.models.entity.Curso;

public interface CursoRepositoy extends CrudRepository<Curso, Long> {
@Query("select c from Curso c join fetch c.alumnos a where a.id=?1")
public Curso findCursoByAlumnoId (Long id);
}

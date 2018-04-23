package es.altair.gestion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import es.altair.gestion.dao.AlumnoDAO;
import es.altair.gestion.dao.AsignaturaDAO;
import es.altair.gestion.dao.NotaDAO;
import es.altair.gestion.dao.ProfesorDAO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class ProfesorController {
	
	@Autowired
	private ProfesorDAO pDAO;
	@Autowired
	private AlumnoDAO aDAO;
	@Autowired
	private AsignaturaDAO asDAO;
	@Autowired
	private NotaDAO nDAO;
	
	
	
}

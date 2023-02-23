package com.curso.security.repository.projection;

import com.curso.security.domain.Especialidade;
import com.curso.security.domain.Medico;
import com.curso.security.domain.Paciente;

public interface HistoricoPaciente {

	Long getId();
	
	Paciente getPaciente();
	
	String getDataConsulta();
	
	Medico getMedico();
	
	Especialidade getEspecialidade();
}

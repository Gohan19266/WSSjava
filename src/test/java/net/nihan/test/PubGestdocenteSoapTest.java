package net.nihan.test;

import static org.junit.Assert.*;

import java.awt.List;

import org.junit.Test;

import uasi.ws_gestdocente.ArrayOfClaseHorarios;
import uasi.ws_gestdocente.ClaseHorarios;
import uasi.ws_gestdocente.PubGestdocente;
import uasi.ws_gestdocente.PubGestdocenteSoap;

public class PubGestdocenteSoapTest {
	public PubGestdocenteSoap servicio= new PubGestdocente().getPubGestdocenteSoap();
	@Test
	public void testWsagrupaciones() {
		fail("Not yet implemented");
	}

	@Test
	public void testWsfechaexamenesasi() {
		fail("Not yet implemented");
	}

	@Test
	public void testWsfechaexamenesasitotal() {
		fail("Not yet implemented");
	}

	@Test
	public void testWsfechaexamenesasinue() {
		fail("Not yet implemented");
	}

	@Test
	public void testWsfechaexamenesplan() {
		fail("Not yet implemented");
	}

	@Test
	public void testWsasidepto() {
		fail("Not yet implemented");
	}

	@Test
	public void testWsdatosasig() {
		fail("Not yet implemented");
	}

	@Test
	public void testWshorarioagrp() {
		fail("Not yet implemented");
	}

	@Test
	public void testWshorarios() {
		ArrayOfClaseHorarios Horarios = servicio.wshorarios("C", "2010-11", "9244", "T");
		List<ClaseHorarios> x = Horarios.getClaseHorarios();
		for (ClaseHorarios claseHorarios : x) {
			System.out.println(claseHorarios.getAula()+"\t"+claseHorarios.getAulasig()+"\t"+claseHorarios.getCapacidadgrupo()+"\t"+claseHorarios.getClaseActiv()+"\t"+claseHorarios.getCodgrp()+"\t"+claseHorarios.getDescactiv()+"\t"+claseHorarios.getDescaula()+"\t"+claseHorarios.getDescgrupo()+"\t"+claseHorarios.getDia()+"\t"+claseHorarios.getDiasemana()+"\t"+claseHorarios.getIdioma());
		}
	}

	@Test
	public void testWstitulosuni() {
		fail("Not yet implemented");
	}

	@Test
	public void testWsdatosplan() {
		fail("Not yet implemented");
	}

	@Test
	public void testWsplanesasig() {
		fail("Not yet implemented");
	}

	@Test
	public void testWsplanesdep() {
		fail("Not yet implemented");
	}

	@Test
	public void testWsdptoasig() {
		fail("Not yet implemented");
	}

	@Test
	public void testWsareasdpto() {
		fail("Not yet implemented");
	}

	@Test
	public void testWsdptocen() {
		fail("Not yet implemented");
	}

	@Test
	public void testWsasiplan() {
		fail("Not yet implemented");
	}

	@Test
	public void testWscalificaciones() {
		fail("Not yet implemented");
	}

	@Test
	public void testWsconvocatorias() {
		fail("Not yet implemented");
	}

	@Test
	public void testWsgruposasi() {
		fail("Not yet implemented");
	}

	@Test
	public void testWsconvemovilidad() {
		fail("Not yet implemented");
	}

	@Test
	public void testWstitulospropiosuni() {
		fail("Not yet implemented");
	}

}

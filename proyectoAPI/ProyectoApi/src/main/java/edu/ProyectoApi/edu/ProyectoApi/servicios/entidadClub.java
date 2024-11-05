package edu.ProyectoApi.edu.ProyectoApi.servicios;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Clase donde se encuentra la representacion del objeto club
 * 
 * @author jpribio - 29/10/24
 */

@Entity
public class entidadClub {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;

	String nombreClub = "aaaaa";
	String correoElectronicoClub = "aaaaa";
	String paisClub = "aaaaa";
	String localidadClub = "aaaaa";
	String sedePrincipal = "aaaaa";
	String contraseniaClub = "aaaaa";

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombreClub() {
		return nombreClub;
	}

	public void setNombreClub(String nombreClub) {
		this.nombreClub = nombreClub;
	}

	public String getCorreoElectronicoClub() {
		return correoElectronicoClub;
	}

	public void setCorreoElectronicoClub(String correoElectronicoClub) {
		this.correoElectronicoClub = correoElectronicoClub;
	}

	public String getPaisClub() {
		return paisClub;
	}

	public void setPaisClub(String paisClub) {
		this.paisClub = paisClub;
	}

	public String getLocalidadClub() {
		return localidadClub;
	}

	public void setLocalidadClub(String localidadClub) {
		this.localidadClub = localidadClub;
	}

	public String getSedePrincipal() {
		return sedePrincipal;
	}

	public void setSedePrincipal(String sedePrincipal) {
		this.sedePrincipal = sedePrincipal;
	}

	public String getContraseniaClub() {
		return contraseniaClub;
	}

	public void setContraseniaClub(String contraseniaClub) {
		this.contraseniaClub = contraseniaClub;
	}

}

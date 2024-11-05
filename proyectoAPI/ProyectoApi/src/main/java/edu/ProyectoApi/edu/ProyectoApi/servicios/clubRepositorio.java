package edu.ProyectoApi.edu.ProyectoApi.servicios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio que permite realizar operaciones CRUD
 * 
 * @author jpribio - 29/10/24
 */
@Repository
public interface clubRepositorio extends JpaRepository<entidadClub, Long> {
	/**
	 * metodo que encuentra el nombre del club en la base de dato
	 * 
	 * @author amoliaz - 05/11/24
	 * @param nombreClub
	 * @return la informacion de la entidad club
	 */
	entidadClub findByNombreClub(String nombreClub);

}

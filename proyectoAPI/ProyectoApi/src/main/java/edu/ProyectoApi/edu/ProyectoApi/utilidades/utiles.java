package edu.ProyectoApi.edu.ProyectoApi.utilidades;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Clase que tiene las utilidades necesarias para todo el proyecto
 * @author jpribio - 29/10/24
 */
public class utiles {

	/**
	 * Metodo que encripta la contraseña antes de guardarla en la Base de datos
	 * @author jpribio - 29/10/24
	 * @param contraseña sin encriptar
	 * @return devuelve la contraseña encriptada
	 */
	public String encriptacionContra(String contra) {
		 try {
	           
	            MessageDigest objetoDigest = MessageDigest.getInstance("SHA-256");
	            // Calcula el hash de la contraseña
	            byte[] arrayDeBytes = objetoDigest.digest(contra.getBytes());
	            
	            // Convierte el byte array a un String hexadecimal
	            StringBuilder cadenaHexadecimal = new StringBuilder();
	            for (byte b : arrayDeBytes) {
	                String hexadecimal = Integer.toHexString(0xff & b);
	                if (hexadecimal.length() == 1) {
	                    cadenaHexadecimal.append('0');
	                }
	                cadenaHexadecimal.append(hexadecimal);
	            }
	            return cadenaHexadecimal.toString();
	        } catch (NoSuchAlgorithmException e) {
	            throw new RuntimeException(e);
	        }
	}
}

package modelo;
import java.util.ArrayList; 
import java.util.List;

import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;
//import javax.jdo.annotations.Unique;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.datanucleus.annotations.Unowned;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Persona {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key idPersona;	
	@Persistent
	private String nombre;
	@Persistent
	private String apellido;
	@Persistent
	//@Unique
	private String email;
	private String tipo;
	private boolean activo;

	public Persona(String name, String apellido, String email, String tipo, boolean activo) {
		super();
		this.nombre = name;
		this.apellido = apellido;
		this.email = email;
		this.tipo=tipo;
		this.activo=activo;
	}	
	public String getIdPersona() {
		return KeyFactory.keyToString(idPersona);
	}
	public void setIdPersona(String idPersona) {
		Key keyPersona = KeyFactory.stringToKey(idPersona);
		this.idPersona = KeyFactory.createKey(keyPersona,
		Persona.class.getSimpleName(), java.util.UUID.randomUUID().toString());
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTipo() {
		return this.tipo;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return this.apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean getActivo() {
		return this.activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	
}
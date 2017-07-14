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
public class juegos {
	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key idJuegos;	
	@Persistent
	private String Outlast;	
	@Persistent
	private String Warhammer;	
	@Persistent
	private String EpicBattle;	
	@Persistent
	private String Sniper;	
	@Persistent
	private String PREY;
	public juegos(String outlast, String Warhammer, String EpicBattle,String Sniper,String PREY) {
		super();
		this.Outlast = outlast;
		this.Warhammer = Warhammer;
		this.EpicBattle = EpicBattle;
		this.Sniper=Sniper;
		this.PREY=PREY;
	}
	
	public String getIdCarnes() {
		return KeyFactory.keyToString(idJuegos);
	}
	public void setIdCarnes(String idCarnes) {
		Key keyCarnes = KeyFactory.stringToKey(idCarnes);
		this.idJuegos = KeyFactory.createKey(keyCarnes,
		juegos.class.getSimpleName(), java.util.UUID.randomUUID().toString());
	}
	public String getOut() {
		return this.Outlast;
	}
	public void setOut(String Outlast) {
		this.Outlast = Outlast;
	}
	public String getWar() {
		return this.Warhammer;
	}
	public void setWar(String Warhammer) {
		this.Warhammer = Warhammer;
	}
	public String getEpic() {
		return this.EpicBattle;
	}
	public void setEpic(String EpicBattle) {
		this.EpicBattle = EpicBattle;
	}
	
	public String getSni() {
		return this.Sniper;
	}

	public void setSni(String Sniper) {
		this.Sniper = Sniper;
	}
	public String getPrey() {
		return this.PREY;
	}

	public void setPrey(String PREY) {
		this.PREY = PREY;
	}

	public void setNombre(){
		this.Outlast=Outlast;
		this.Warhammer=Warhammer;
		this.EpicBattle=EpicBattle;
		this.Sniper=Sniper;
		this.PREY=PREY;
	}
}

package agenzia.entities;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="viaggi")
public class Viaggio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	private int durata;
	private String descrizione;
	private String destinazione;
	private double prezzo;
	//private LocalDate data_viaggio;
	private String url; 		//URL dell'immagine
	
	@ManyToMany(mappedBy = "viaggi")
	private Set<Cliente> clienti;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getGiorni() {
		return durata;
	}
	public void setGiorni(int durata) {
		this.durata = durata;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public String getDestinazione() {
		return destinazione;
	}
	public void setDestinazione(String destinazione) {
		this.destinazione = destinazione;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
//	public LocalDate getData_viaggio() {
//		return data_viaggio;
//	}
//	public void setData_viaggio(LocalDate data_viaggio) {
//		this.data_viaggio = data_viaggio;
//	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
	
}

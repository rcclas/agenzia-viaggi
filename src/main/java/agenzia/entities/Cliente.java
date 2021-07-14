package agenzia.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="clienti")

public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	private String nome;
	private String cognome;
	private String email;
	private enum Metodo_p{
		Visa, PayPal
	}
	
	@ManyToMany
	@JoinTable(
			name = "prenotazioni",
			joinColumns = @JoinColumn(name = "clienti_id"),
			inverseJoinColumns = @JoinColumn(name = "viaggi_id")
			)
	
	private Set<Viaggio> viaggi;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Set<Viaggio> getViaggi() {
		return viaggi;
	}
	public void setViaggi(Set<Viaggio> viaggi) {
		this.viaggi = viaggi;
	}
	
	
}

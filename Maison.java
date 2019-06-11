package metier;

import java.util.*;

import javax.persistence.*;

@Entity
public class Maison {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nom;
	private Integer score;
	private Professeur professeur;
	@OneToMany
	private List <Eleve> eleves = new ArrayList();
	
	public Maison() {
		
	}
	public Maison(String nom, Integer score, Professeur professeur, List<Eleve> eleves) {
		this.nom = nom;
		this.score = score;
		this.professeur = professeur;
		this.eleves = eleves;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Professeur getProfesseur() {
		return professeur;
	}

	public void setProfesseur(Professeur professeur) {
		this.professeur = professeur;
	}

	public List<Eleve> getEleves() {
		return eleves;
	}

	public void setEleves(List<Eleve> eleves) {
		this.eleves = eleves;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Maison other = (Maison) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


	public String toString() {
		return "Maison [nom=" + nom + ", score=" + score + "]";
	}
	
}

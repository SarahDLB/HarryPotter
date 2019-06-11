package metier;

public enum Civilite {

	Mr ("Monsieur"), Mme ("Madame");
	
	private String libelle;
	
	private Civilite (String civ)
	{
		libelle=civ;
	}
	
	public String getLibelle()
	{
		return libelle;
	}
}

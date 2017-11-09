/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * DANILO CAPPELLINO CORSO JAVA 16-05-2017
 */
public class Cliente {
    private String nome;
    private String cognome;
    private String ragionesociale;
    private String indirizzo;
    private String cap;
    private String citta;
    private String provincia;
    private String telefono;
    private String cellulare;
    private String email;
    private String codicefiscale;
    private String partitaiva;

    public Cliente() {
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

    public String getRagionesociale() {
        return ragionesociale;
    }

    public void setRagionesociale(String ragionesociale) {
        this.ragionesociale = ragionesociale;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCellulare() {
        return cellulare;
    }

    public void setCellulare(String cellulare) {
        this.cellulare = cellulare;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCodicefiscale() {
        return codicefiscale;
    }

    public void setCodicefiscale(String codicefiscale) {
        this.codicefiscale = codicefiscale;
    }

    public String getPartitaiva() {
        return partitaiva;
    }

    public void setPartitaiva(String partitaiva) {
        this.partitaiva = partitaiva;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nCognome: " + cognome + "\nRagione Sociale: " + ragionesociale + "\nIndirizzo: " + indirizzo + "\nCap: " + cap + "\nCittà: " + citta + "\nProvincia: " + provincia + "\nTelefono: " + telefono + "\nCellulare: " + cellulare + "\nEmail: " + email + "\nCodice Fiscale: " + codicefiscale + "\nPartita IVA: " + partitaiva;
    }
    
    
    
    
}

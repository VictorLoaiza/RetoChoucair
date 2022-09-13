package co.com.choucair.inicial.model;

public class FormularioDate {

    private String firstName;
    private String lastName;
    private String email;
    private String cdPostal;
    private String city;
    private String country;
    private String createKey;

    public String getValidar() {
        return validar;
    }

    public void setValidar(String validar) {
        this.validar = validar;
    }

    private String validar;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCdPostal() {
        return cdPostal;
    }

    public void setCdPostal(String cdPostal) {
        this.cdPostal = cdPostal;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCreateKey() {
        return createKey;
    }

    public void setCreateKey(String createKey) {
        this.createKey = createKey;
    }
}

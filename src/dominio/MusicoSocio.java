package dominio;

public class MusicoSocio extends Musico {
    private int numeroDeSocio;

    public MusicoSocio(String nombre, String instrumento, int numeroDeSocio) {
        super(nombre, instrumento);
        this.numeroDeSocio = numeroDeSocio;
    }

    @Override
    public String toString() {
        return super.toString() + ", número de socio: " + numeroDeSocio;
    }
}


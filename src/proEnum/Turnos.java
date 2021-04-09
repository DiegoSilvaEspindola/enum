package proEnum;

public enum Turnos {
    MATUTINO("Manhã"), VESPERTINO("tarde"), NOTURNO("Noturno");

    private String texto;
    Turnos(String texto){
        this.texto = texto;
    }
    public String getTexto(){
        return texto;
    }
}

package proEnum;

public class Grade {
    private String nomeAluno;
    private String materia;
    private int sala;
    public String horario;
    private String cargaHoraria;

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void mostraGrade() {
        System.out.println(this.nomeAluno );
        System.out.println(this.materia );
        System.out.println(this.sala);
        System.out.println(this.horario);
        System.out.println(this.cargaHoraria);

    }

}
package proEnum;

public class Principal {
    public static void main(String args[]){
        Grade grade = new Grade();
        grade.horario = Turnos.NOTURNO.getTexto();


        grade.setNomeAluno("Diego Silva");
        grade.setMateria("Estrutura de Dados");
        grade.setSala(3);
        grade.setCargaHoraria("160");

        grade.mostraGrade();

    }
}

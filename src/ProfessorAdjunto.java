public class ProfessorAdjunto extends Professor {
    private int horasDeMonitoria;

    public ProfessorAdjunto() {
    }

    public ProfessorAdjunto(String nome, String sobrenome, Integer tempoDeCasa, Integer codigoProfessor, Integer horasDeMonitoria) {
        super(nome, sobrenome, tempoDeCasa, codigoProfessor);
        setHorasDeMonitoria(horasDeMonitoria);
    }

    public Integer getHorasDeMonitoria() {
        return horasDeMonitoria;
    }

    public void setHorasDeMonitoria(Integer horasDeMonitoria) {
        this.horasDeMonitoria = horasDeMonitoria;
    }
}

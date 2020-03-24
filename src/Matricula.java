import java.util.Date;

public class Matricula {
    private Date dataDeMatricula;
    private Aluno aluno;
    private Curso curso;

    public Matricula(Aluno aluno, Curso curso) {
        this.dataDeMatricula = new Date();
        this.aluno = aluno;
        this.curso = curso;
    }

    public Date getDataDeMatricula() {
        return dataDeMatricula;
    }

    public void setDataDeMatricula(Date dataDeMatricula) {
        this.dataDeMatricula = dataDeMatricula;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return aluno + " " + curso + " " + dataDeMatricula;
    }

}

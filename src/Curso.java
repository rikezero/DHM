import java.util.ArrayList;

public class Curso {
    private String nome;
    private Integer codigoCurso, maximoAlunos;
    private ProfessorTitular titular;
    private ProfessorAdjunto adjunto;
    private ArrayList<Aluno> alunosMatriculados = new ArrayList<>();

    public Curso() {
    }

    public Curso(String nome, Integer codigoCurso, Integer maximoAlunos, ProfessorTitular titular, ProfessorAdjunto adjunto,Aluno... variosAlunos) {
        this.nome = nome;
        this.codigoCurso = codigoCurso;
        this.setMaximoAlunos(maximoAlunos);
        this.setAdjunto(adjunto);
        this.setTitular(titular);
        for (Aluno AlunoAtual : variosAlunos) {
            matriculaAluno(AlunoAtual);
        }

    }
    public Boolean adicionarUmAluno(Aluno umAluno){
        if(alunosMatriculados.size() < maximoAlunos){
            alunosMatriculados.add(umAluno);
            return true;
        }
        return false;
    }
    public void excluirAluno(Aluno umAluno){
        if(alunosMatriculados.contains(umAluno)){
            alunosMatriculados.remove(umAluno);
        }
    }

    public Integer getAlunosMatriculados() {
        return alunosMatriculados.size();
    }

    public Boolean checaMatricula(Aluno aluno) {
        if (alunosMatriculados.contains(aluno)){
            return true;
        }
        return false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(Integer codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public Integer getMaximoAlunos() {
        return maximoAlunos;
    }

    public void setMaximoAlunos(Integer maximoAlunos) {
        this.maximoAlunos = maximoAlunos;
    }

    public ProfessorTitular getTitular() {
        return titular;
    }

    public void setTitular(ProfessorTitular titular) {
        this.titular = titular;
    }

    public ProfessorAdjunto getAdjunto() {
        return adjunto;
    }

    public void setAdjunto(ProfessorAdjunto adjunto) {
        this.adjunto = adjunto;
    }

    public void matriculaAluno(Aluno aluno){
        alunosMatriculados.add(aluno);
    }

    @Override
    public String toString() {
        return "Curso: " +
                nome;
    }
}

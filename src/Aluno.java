public class Aluno {
    private String nome, sobrenome;
    private Integer codigoAluno;

    public Aluno() {
    }

    public Aluno(String nome, String sobrenome, Integer codigoAluno) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.codigoAluno = codigoAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getCodigoAluno() {
        return codigoAluno;
    }

    public void setCodigoAluno(Integer codigoAluno) {
        this.codigoAluno = codigoAluno;
    }

    public static Aluno getAlunoByCode(int codigoAluno) {
        return DigitalHouseManager.alunos.get(codigoAluno-1);
    }

    @Override
    public String toString() {
        return nome;
    }
}

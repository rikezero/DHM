public class Professor {
    private String nome, sobrenome;
    private int tempoDeCasa, codigoProfessor;

    public Professor() {
    }

    public Professor(String nome, String sobrenome, int tempoDeCasa, int codigoProfessor) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.tempoDeCasa = tempoDeCasa;
        this.codigoProfessor = codigoProfessor;
    }
    public static Professor getProfessorByCode(int codigoProfessor) {
        return DigitalHouseManager.professores.get(codigoProfessor-1);
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

    public int getTempoDeCasa() {
        return tempoDeCasa;
    }

    public void setTempoDeCasa(int tempoDeCasa) {
        this.tempoDeCasa = tempoDeCasa;
    }

    public int getCodigoProfessor() {
        return codigoProfessor;
    }

    public void setCodigoProfessor(int codigoProfessor) {
        this.codigoProfessor = codigoProfessor;
    }

    @Override
    public String toString() {
        return nome;
    }
}

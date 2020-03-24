
import java.util.ArrayList;


public class DigitalHouseManager {
    public static ArrayList<Aluno> alunos = new ArrayList<>();
    public static ArrayList<Professor> professores = new ArrayList<>();
    public static ArrayList<Curso> cursos = new ArrayList<>();
    public static ArrayList<Matricula> matriculas = new ArrayList<>();

    public DigitalHouseManager() {
    }

    public void registrarCurso(String nome, int codigoCurso,int quantidadeMaximaDeAlunos){
        cursos.forEach(curso -> {
            if (curso.getCodigoCurso() == codigoCurso) {
                System.out.println("Curso já cadastrado.");
                return;
            }
        });
        Curso cursoNovo = new Curso();
        cursoNovo.setCodigoCurso(codigoCurso);
        cursoNovo.setNome(nome);
        cursoNovo.setMaximoAlunos(quantidadeMaximaDeAlunos);
        cursos.add(cursoNovo);
        System.out.println("Curso cadastrado com sucesso!");

    }

    public void excluirCurso(int codigoCurso){
        for (Curso item : cursos) {
            if(item.getCodigoCurso() == codigoCurso){
                cursos.remove(item);
                return;
            }
        }
        return;
    }


    public void registrarProfessorAdjunto(String nome, String sobrenome, int codigoProfessor, int quantidadeDeHoras){
        professores.forEach(professor -> {
            if (professor.getCodigoProfessor() == codigoProfessor) {
                System.out.println("Professor já cadastrado.");
                return;
            }
        });
        ProfessorAdjunto adjunto = new ProfessorAdjunto();
        adjunto.setHorasDeMonitoria(quantidadeDeHoras);
        adjunto.setCodigoProfessor(codigoProfessor);
        adjunto.setNome(nome);
        adjunto.setSobrenome(sobrenome);
        professores.add(adjunto);
        System.out.println("Professor cadastrado com sucesso!");
    }

    public void registrarProfessorTitular(String nome, String sobrenome, int codigoProfessor, String especialidade){
        professores.forEach(professor -> {
            if (professor.getCodigoProfessor() == codigoProfessor) {
                System.out.println("Professor já cadastrado.");
                return;
            }
        });
        ProfessorTitular titular = new ProfessorTitular();
        titular.setEspecialidade(especialidade);
        titular.setCodigoProfessor(codigoProfessor);
        titular.setNome(nome);
        titular.setSobrenome(sobrenome);
        professores.add(titular);
        System.out.println("Professor cadastrado com sucesso!");
    }

    public void excluirProfessor(int codigoProfessor){
        for (Professor item : professores) {
            if(item.getCodigoProfessor() == codigoProfessor){
                professores.remove(item);
                return;
            }
        }
        return;
    }

    public void matricularAluno(String nome, String sobrenome, int codigoAluno){
        alunos.forEach(aluno -> {
            if (aluno.getCodigoAluno() == codigoAluno) {
                System.out.println("Aluno já cadastrado.");
                return;
            }
        });
        Aluno alunoNovo = new Aluno();
        alunoNovo.setCodigoAluno(codigoAluno);
        alunoNovo.setNome(nome);
        alunoNovo.setSobrenome(sobrenome);
        alunos.add(alunoNovo);
        System.out.println("Aluno registrado no sistema com sucesso!");
        //System.out.println(alunos.toString());

    }


    public void matricularAluno(int codigoAluno, int codigoCurso){
        for (Curso item : cursos){
            if(item.getCodigoCurso() == codigoCurso){
                for (Aluno alunoAtual : alunos){
                    if(alunoAtual.getCodigoAluno() == codigoAluno){
                        if(item.getAlunosMatriculados() < item.getMaximoAlunos()){
                            matriculas.add(new Matricula(alunoAtual,item));
                            item.matriculaAluno(alunoAtual);
                            //System.out.println(matriculas.toString());
                            System.out.println("Matrícula realizada com sucesso!");
                            return;
                        }
                        else{
                            System.out.println("Matrícula não realizada.\nNão há mais vagas para este curso.");
                            return;
                        }
                    }
                }
            }
        }
    }

    public void alocarProfessores(int codigoCurso, int codigoProfessorTitular, int codigoProfessorAdjunto){



        cursos.forEach(curso -> {
            if (curso.getCodigoCurso().equals(codigoCurso)) {
                if(professores.contains(getProfessor(codigoProfessorTitular))&&professores.contains(getProfessor(codigoProfessorAdjunto))) {
                    curso.setTitular((ProfessorTitular) getProfessor(codigoProfessorTitular));
                    curso.setAdjunto((ProfessorAdjunto) getProfessor(codigoProfessorAdjunto));
                    System.out.println("Professores atribuídos aos curso com sucesso!");
                    System.out.println();
                    return;
                }
                else{



                }


            }
        });

    }
    public Professor getProfessor(int codigo){
       return Professor.getProfessorByCode(codigo);
    }

    public void consultarMatrícula(int codigoAluno){
        Aluno consulta = Aluno.getAlunoByCode(codigoAluno);
         String resultado = "Matriculado nos cursos:\n";
        for (Curso curso : cursos) {
            if(curso.checaMatricula(consulta)){
                resultado += curso.toString()+"\n";
            }
        }
        System.out.println(resultado);

    }

}

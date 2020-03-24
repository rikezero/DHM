public class Main {
    public static void main(String[] args) {
        DigitalHouseManager manager = new DigitalHouseManager();
        manager.registrarCurso("Full Stack", 20001,3);
        manager.registrarCurso("Android", 20002, 2);
        manager.registrarProfessorTitular("Jämal","Kazychz",1,"Desenvolvimento Web");
        manager.registrarProfessorTitular("Damião","de Souza Santos",2,"Desenvolvimento Android");
        manager.registrarProfessorAdjunto("Thales", "de Jesus",3,6);
        manager.registrarProfessorAdjunto("Diego", "Rocha Soares",4,4);
        manager.alocarProfessores(20001 ,1,3);
        manager.alocarProfessores(20002,002,004);
        manager.matricularAluno("James","Soares", 001);
        manager.matricularAluno(001,20001);
        manager.matricularAluno("Murici","Bastos", 002);
        manager.matricularAluno(002,20001);
        manager.matricularAluno("Damócles","Ribeiro", 003);
        manager.matricularAluno(003,20002);
        manager.matricularAluno("Júlio","Ribeiro", 004);
        manager.matricularAluno(004,20002);
        manager.matricularAluno("Tarcisio","Cabral", 005);
        manager.matricularAluno(005,20002);
        manager.consultarMatrícula(001);



    }
}

package GerenciamentoEscola;

public class Escola {
    public static void main(String[] args) {
        Professor professor0 = new Professor("Ricardo", Materia.Matematica);
        Professor professor1 = new Professor("Creusa", Materia.Quimica);
        Aluno aluno1 = new Aluno("Crispina", 15, Sexo.Femenino);
        Aluno aluno2 = new Aluno("Reginaldo", 16, Sexo.Masculino);

        Turma sala001 = new Turma("Quinto ano A");
        Turma sala002 = new Turma("Quinto ano B");
        sala001.adicionarAluno(aluno2);
        sala001.adicionarAluno(aluno1);
        sala001.adicionarProfessor(professor1);
        sala002.adicionarProfessor(professor1);

        System.out.println(professor1);
        for (Aluno aluno : sala001.getListaDeAlunos()) {
            System.out.println(aluno.getNome());
        }
        System.out.println(professor0);
        for (Aluno aluno : sala002.getListaDeAlunos()) {
            System.out.println(aluno.getNome());
        }
    }
}



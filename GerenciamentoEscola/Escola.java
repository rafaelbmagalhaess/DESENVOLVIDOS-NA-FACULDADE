package GerenciamentoEscola;

public class Escola {
    public static void main(String[] args) {
        Professor professor0= new Professor("Ricardo", Materia.Matematica);
     Professor professor1= new Professor("Creusa", Materia.Quimica);
    Aluno aluno1= new Aluno("Crispina", 15, Sexo.Femenino);
    Aluno aluno2= new Aluno("Reginaldo", 16, Sexo.Masculino);

    Turma sala001= new Turma("Quinto ano");
    sala001.adicionarAluno(aluno2);
    sala001.adicionarAluno(aluno1);
    sala001.adicionarProfessor(professor1);
    System.out.println(professor1);
    
    
    }
    
    

    
}

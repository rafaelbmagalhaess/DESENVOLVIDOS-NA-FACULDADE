package GerenciamentoEscola;

import java.util.ArrayList;

public class Turma {
    private String nomeDaSala;
    public String getNomeDaSala() {
        return nomeDaSala;
    }
    private ArrayList<Aluno> listaDeAlunos;
    private ArrayList<Professor>listaDeProfessores;


    public Turma(String nome)
    {
        this.nomeDaSala=nome;
        this.listaDeAlunos=new ArrayList<>();
        this.listaDeProfessores= new ArrayList<>();
    }
    

    public void adicionarAluno(Aluno aluno)
    {
        for (Aluno procurandoAluno : listaDeAlunos) {
            if(!procurandoAluno.equals(aluno))
            {
                listaDeAlunos.add(aluno);
            }
        }
    }
    public void adicionarProfessor(Professor professor)
    {
        for (Professor procurandoProfessor : listaDeProfessores) {
            if(!procurandoProfessor.equals(professor))
            {
                listaDeProfessores.add(professor);
                professor.adicionarTurma(this);
 
            }
        }
    }
    @Override

    public String toString()
    {
        return "\n"+ nomeDaSala ;
    }


     

    

    
}

package GerenciamentoEscola;

import java.util.ArrayList;

public class Turma {
    private String nomeDaSala;
    private ArrayList<Aluno> listaDeAlunos;
    private ArrayList<Professor>listaDeProfessores;


    public Turma(String nome)
    {
        this.nomeDaSala=nome;
        this.listaDeAlunos=new ArrayList<>();
        this.listaDeProfessores= new ArrayList<>();
    }
     public ArrayList<Aluno> getListaDeAlunos() {
        return listaDeAlunos;
    }
    

    public void adicionarAluno(Aluno aluno)
{
    if (!listaDeAlunos.contains(aluno)) {
        listaDeAlunos.add(aluno);
    }
}

    public void adicionarProfessor(Professor professor)
    {
        if(!listaDeProfessores.contains(professor))
        {
            listaDeProfessores.add(professor);
                professor.adicionarTurma(this);

        }
                
    }
    @Override

    public String toString()
    {
        return "\n"+ nomeDaSala ;
    }


     

    

    
}

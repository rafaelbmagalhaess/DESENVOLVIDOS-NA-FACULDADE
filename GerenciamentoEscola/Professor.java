package GerenciamentoEscola;

import java.util.ArrayList;

public class Professor {
    private String nome;
    private Materia materia;
    private ArrayList<Turma> turmasMinistradas;
    

    


    public ArrayList<Turma> getTurmasMinistradas() {
        return turmasMinistradas;
    }

    public Professor(String nome, Materia materia) {
        this.nome = nome;
        this.materia = materia;
        this.turmasMinistradas=new ArrayList<>();
    }

    public void adicionarTurma(Turma turma)
    {
        turmasMinistradas.add(turma);
    }
    @Override
    public String toString()
    {
        return " TURMAS "+ turmasMinistradas;
    }

    
    
}

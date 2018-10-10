/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Aluno;
import model.Turma;

/**
 *
 * @author Luis
 */
public class AlunoDao{
    private List<Aluno> lista;

    public AlunoDao() {
        lista = new ArrayList<Aluno>();
    }
    
    public void insereAluno(Aluno aluno){
        lista.add(aluno);
    }
    
    public Aluno buscarAluno(int matricula){
        Aluno aluno = new Aluno();
        for(Aluno a : lista){
            if(a.getMatricula() == matricula){
                aluno = a;
            }
        }
        return aluno;
    }
    
    public void removerAluno(int matricula){
        Aluno aluno = buscarAluno(matricula);
        if(aluno != null){
            lista.remove(aluno);
        }        
    }
    
    public List<Aluno> listarAlunos(String nome){
        List<Aluno> alunos = null;
        List<Turma> turmas = new ArrayList<Turma>();
        for(Turma t : turmas){
            if(t.getNome().equals(nome)){
                for(Aluno a : t.getAlunos()){
                    alunos = (List<Aluno>) a;
                }
            }
        }
        return alunos;
    }
}

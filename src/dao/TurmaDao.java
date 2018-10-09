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
public class TurmaDao {
    private List<Turma> lista;

    public TurmaDao() {
        lista = new ArrayList<Turma>();
    }
    
    public void insereTurma(Turma turma){
        lista.add(turma);
    }
    
    public List<Turma> listarTurmas(){
        return lista;
    }
    
    public List<Turma> listarTurmasPCD(){
        List<Turma> l = null;
        for(Turma t : lista){
            for(Aluno a : t.getAlunos()){
                if(a.getPcd() == 1){
                    l.add(t);
                }
            }
        }
        return l;
    }
}

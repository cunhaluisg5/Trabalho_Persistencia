/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import enuns.EEnsino;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis
 */
public class Turma {
    private int tur_id;
    private String nome;
    private EEnsino ensino;
    private int ano;
    private List<Aluno> alunos;

    public Turma() {
        alunos = new ArrayList<Aluno>();
    }

    public Turma(int tur_id, String nome, EEnsino ensino, int ano, List<Aluno> alunos) {
        this.tur_id = tur_id;
        this.nome = nome;
        this.ensino = ensino;
        this.ano = ano;
        this.alunos = alunos;
    }

    public int getTur_id() {
        return tur_id;
    }

    public void setTur_id(int tur_id) {
        this.tur_id = tur_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public EEnsino getEnsino() {
        return ensino;
    }

    public void setEnsino(EEnsino ensino) {
        this.ensino = ensino;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
}

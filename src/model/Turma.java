/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import enuns.EEnsino;

/**
 *
 * @author Luis
 */
public class Turma {
    private int tur_id;
    private String nome;
    private EEnsino ensino;
    private int ano;

    public Turma() {
    }

    public Turma(int tur_id, String nome, EEnsino ensino, int ano) {
        this.tur_id = tur_id;
        this.nome = nome;
        this.ensino = ensino;
        this.ano = ano;
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
}

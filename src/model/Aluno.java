/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Luis
 */
public class Aluno {
    private int alu_id;
    private String nome;
    private int anoNascimento;
    private int matricula;
    private int pcd;

    public Aluno() {
    }

    public Aluno(int alu_id, String nome, int anoNascimento, int matricula, int pcd) {
        this.alu_id = alu_id;
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.matricula = matricula;
        this.pcd = pcd;
    }

    public int getAlu_id() {
        return alu_id;
    }

    public void setAlu_id(int alu_id) {
        this.alu_id = alu_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getPcd() {
        return pcd;
    }

    public void setPcd(int pcd) {
        this.pcd = pcd;
    }
}

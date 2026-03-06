package br.com.etecfer.etecfer.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Aluno {

    //Defifnição dos atributos da entidade aluno
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idAluno;

    @Column(nullable = false, length = 40)
    private String nomeALuno;

    @Column(length = 40)
    private String emailAluno;

    @Column(nullable = false, length = 11)
    private String telefoneAluno;

    @Column(nullable = false)
    private Integer raAluno;

    @Column(nullable = false, length = 11)
    private String cpfAluno;


     //Métodos construtores

     public Aluno() {

    }

    public Aluno(Integer idAluno, String nomeALuno, String emailAluno, String telefoneAluno, Integer raAluno,
            String cpfAluno) {
        this.idAluno = idAluno;
        this.nomeALuno = nomeALuno;
        this.emailAluno = emailAluno;
        this.telefoneAluno = telefoneAluno;
        this.raAluno = raAluno;
        this.cpfAluno = cpfAluno;
    }

    //Métodos acessores (getters e setters)

    public Integer getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(Integer idAluno) {
        this.idAluno = idAluno;
    }

    public String getNomeALuno() {
        return nomeALuno;
    }

    public void setNomeALuno(String nomeALuno) {
        this.nomeALuno = nomeALuno;
    }

    public String getEmailAluno() {
        return emailAluno;
    }

    public void setEmailAluno(String emailAluno) {
        this.emailAluno = emailAluno;
    }

    public String getTelefoneAluno() {
        return telefoneAluno;
    }

    public void setTelefoneAluno(String telefoneAluno) {
        this.telefoneAluno = telefoneAluno;
    }

    public Integer getRaAluno() {
        return raAluno;
    }

    public void setRaAluno(Integer raAluno) {
        this.raAluno = raAluno;
    }

    public String getCpfAluno() {
        return cpfAluno;
    }

    public void setCpfAluno(String cpfAluno) {
        this.cpfAluno = cpfAluno;
    }

}

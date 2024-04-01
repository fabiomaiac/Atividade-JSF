package br.com.cadUser;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Pessoa implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String nome;
    private List<String> nomesCadastrados;

    @PostConstruct
    public void init() {
        nomesCadastrados = new ArrayList<>();
    }

    public void cadastrarNome() {
        nomesCadastrados.add(nome);
        nome = ""; 
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getNomesCadastrados() {
        return nomesCadastrados;
    }

    public void setNomesCadastrados(List<String> nomesCadastrados) {
        this.nomesCadastrados = nomesCadastrados;
    }
}

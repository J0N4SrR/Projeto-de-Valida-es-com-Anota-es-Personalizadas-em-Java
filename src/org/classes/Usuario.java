package org.classes;

import anotacoes.EmailValido;
import anotacoes.IdadeMinima;
import anotacoes.NaoNulo;

public class Usuario {
    @NaoNulo
    private String nome;
    private int ddd;
    private int celular;
    @NaoNulo
    @EmailValido
    private String email;
    @NaoNulo
    @IdadeMinima(valor = 18)
    private int idade;

    public Usuario(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }


}

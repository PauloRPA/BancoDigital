package com.prpa.bancodigital.model.dtos;

import com.prpa.bancodigital.model.enums.TipoCartao;
import com.prpa.bancodigital.model.validator.annotations.FieldMatch;
import com.prpa.bancodigital.model.validator.annotations.IsEnum;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

@FieldMatch(fieldName = "senha", confirmFieldName = "confirmarSenha", message = "Os campos de senha e de confirmar senha devem possuir o mesmo valor")
public class CartaoDTO {

    @NotNull(message = "O campo de tipo não pode estar vazio")
    @IsEnum(message = "O campo de tipo de cartão deve conter algum dos seguintes valores: [CARTAO_DEBITO, CARTAO_CREDITO]", type = TipoCartao.class)
    private String tipo;

    @NotBlank(message = "O campo de numero da conta não pode estar vazio")
    private String numero;

    @NotBlank(message = "O campo de agencia da conta não pode estar vazio")
    private String agencia;

    @NotBlank(message = "O campo de senha não pode estar vazio")
    @Length(min = 6, message = "A senha deve ter ao menos {min} caracteres de tamanho")
    private String senha;

    @NotBlank(message = "O campo de confirmação de senha não pode estar vazio")
    private String confirmarSenha;

    public CartaoDTO() {
    }

    public CartaoDTO(String tipo, String numero, String agencia, String senha, String confirmarSenha) {
        this.tipo = tipo;
        this.numero = numero;
        this.agencia = agencia;
        this.senha = senha;
        this.confirmarSenha = confirmarSenha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getConfirmarSenha() {
        return confirmarSenha;
    }

    public void setConfirmarSenha(String confirmarSenha) {
        this.confirmarSenha = confirmarSenha;
    }
}

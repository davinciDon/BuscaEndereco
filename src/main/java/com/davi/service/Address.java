package com.davi.service;

public record Address(String cep,
                      String logradouro,
                      String complemento,
                      String bairro,
                      String localidade,
                      String uf,
                      String ddd) {
}

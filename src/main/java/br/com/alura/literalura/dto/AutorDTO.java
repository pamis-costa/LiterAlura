package br.com.alura.literalura.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

public record AutorDTO(@JsonAlias("name") String autor,
                       @JsonAlias("birth_year") Integer dataNascimento,
                       @JsonAlias("death_year") Integer dataMorte) {
}

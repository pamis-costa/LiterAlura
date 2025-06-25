package br.com.alura.literalura.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.List;

public record LivroDTO(@JsonAlias("title") String titulo,
                       @JsonAlias("languages")List<String> idiomas,
                       @JsonAlias("authors")List<AutorDTO> autores,
                       @JsonAlias("download_count")Double downloads) {

}

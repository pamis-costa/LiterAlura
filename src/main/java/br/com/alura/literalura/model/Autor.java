package br.com.alura.literalura.model;

import br.com.alura.literalura.dto.AutorDTO;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "autores")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "autor")
    private String name;

    @Column(name = "data_nascimento")
    private Integer dataNascimento;

    @Column(name = "data_morte")
    private Integer dataMorte;

    @OneToMany(mappedBy = "serie", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Livro> livros = new ArrayList<>();

    public Autor(String name, Integer dataNascimento, Integer dataMorte) {
        this.name = name;
        this.dataNascimento = dataNascimento;
        this.dataMorte = dataMorte;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Integer dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Integer getDataMorte() {
        return dataMorte;
    }

    public void setDataMorte(Integer dataMorte) {
        this.dataMorte = dataMorte;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

}

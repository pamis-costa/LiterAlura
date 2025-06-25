package br.com.alura.literalura.model;

import jakarta.persistence.*;

@Entity
@Table
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String titulo;

    @ManyToOne(cascade = CascadeType.ALL)
    private Autor autor;

    private String languages;

    private double downloadCount;

    public Livro(String titulo, Autor autor, String languages, double downloadCount) {
        this.titulo = titulo;
        this.autor = autor;
        this.languages = languages;
        this.downloadCount = downloadCount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public double getDownloadCount() {
        return downloadCount;
    }

    public void setDownloadCount(double downloadCount) {
        this.downloadCount = downloadCount;
    }
}

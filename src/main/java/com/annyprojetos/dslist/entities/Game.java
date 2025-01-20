package com.annyprojetos.dslist.entities;
//1: construtor padrão, preciso declarar ele aqui pq quero declarar um passando parâmetros, então se eu declarar só o debaixo, não posso mais instanciar sem parâmetros.

//2: hash e equals ficou diferente do dele. Se der erro, foi aqui. Aula 1: min 1:01:00.

//3: Configura essa classe Java para ser equivalente a uma tabela do banco.

/*4: A anotação @Table permite que você especifique os detalhes da tabela que será usada para persistir a entidade no banco de dados. A anotação @Table fornece quatro atributos, permitindo que você substitua o nome da tabela, seu catálogo e seu esquema, e imponha restrições exclusivas em colunas na tabela. Por enquanto, estamos usando apenas o nome da tabela, que é tb_game.*/

//5: Essa anotação define quem será a primary key da tabela.

//6: Essa anotação define que o preenchimento do Id será autoincremental.

//7: Precisei renomear a coluna "year", pois essa palavra é reservada no SQL, geraria um conflito.

//8: O tipo String é convertido para varchar no banco. E o varchar tem limite de 255 caracteres. Então é preciso esse macete, pois o tipo TEXT é maior.

import jakarta.persistence.*;

import java.util.Objects;


@Entity //3
@Table(name = "tb_game") //4
public class Game {
    @Id //5
    @GeneratedValue(strategy = GenerationType.IDENTITY) //6
    private Long id;
    private String title;

    @Column(name = "game_year") //7
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;

    @Column(columnDefinition = "TEXT") //8
    private String shortDescription;

    @Column(columnDefinition = "TEXT") //8
    private String longDescription;

    //1
    public Game() {

    }

    public Game(Long id, String title, Integer year, String genre, String platforms, Double score, String imgUrl, String shortDescription, String longDescription) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.platforms = platforms;
        this.score = score;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        Game game = (Game) obj;
        return Objects.equals(id, game.id);
    }
//2
    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}

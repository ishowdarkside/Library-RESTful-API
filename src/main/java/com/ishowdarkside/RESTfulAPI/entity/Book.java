package com.ishowdarkside.RESTfulAPI.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "book_repository")
public class Book {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "overview")
    private String overview;

    @Column(name = "avgRating")
    private double avgRating;


    public Book(){};

    public Book(String title,String author, String overview, double avgRating){
        this.title = title;
        this.author = author;
        this.overview = overview;
        this.avgRating = avgRating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public double getAvgRating() {
        return avgRating;
    }

    public void setAvgRating(double avgRating) {
        this.avgRating = avgRating;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", overview='" + overview + '\'' +
                ", avgRating=" + avgRating +
                '}';
    }
}

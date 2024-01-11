package com.frances.relink.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Entity
@Data
@NoArgsConstructor
@Table(name="URL")
public class Url {

    @jakarta.persistence.Id
    @Id
    @Column(name="ID_URL")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="LONG_URL")
    private String longUrl;
    @Column(name="SHORT_URL")
    private String shortUrl;

    public Url(String longUrl) {
        this.longUrl = longUrl;
    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getLongUrl() {
//        return longUrl;
//    }
//
//    public void setLongUrl(String longUrl) {
//        this.longUrl = longUrl;
//    }
//
//    public String getShortUrl() {
//        return shortUrl;
//    }
//
//    public void setShortUrl(String shortUrl) {
//        this.shortUrl = shortUrl;
//    }
//
//    public String toString(){//overriding the toString() method
//        return "id:"+id+" | longUrl："+longUrl+" | shortUrl:"+shortUrl;
//    }

}

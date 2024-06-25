package com.tutorial.bookSocialNetwork.book;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookResponse {

    private Integer id;
    private String title;
    private String owner;
    private String authorName;
    private String isbn;
    private String synopsis;
    private byte[] cover;
    private double rate;
    private boolean archived;
    private boolean shareable;

}

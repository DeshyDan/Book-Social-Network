package com.tutorial.bookSocialNetwork.book;

import com.tutorial.bookSocialNetwork.common.BaseEntity;
import com.tutorial.bookSocialNetwork.feedback.Feedback;
import com.tutorial.bookSocialNetwork.history.BookTransactionHistory;
import com.tutorial.bookSocialNetwork.user.User;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;


@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book extends BaseEntity {

    private String title;
    private String authorName;
    private String isbn;
    private String synopsis;
    private String bookCover;
    private boolean archived;
    private boolean shareable;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private User owner;

    @OneToMany(mappedBy = "book")
    private List<Feedback> feedbacks;

    @OneToMany(mappedBy = "book")
    private List<BookTransactionHistory> histories;

}
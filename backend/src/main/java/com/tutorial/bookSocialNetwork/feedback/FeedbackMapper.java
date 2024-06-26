package com.tutorial.bookSocialNetwork.feedback;

import com.tutorial.bookSocialNetwork.book.Book;
import org.springframework.stereotype.Service;

@Service
public class FeedbackMapper {

    public Feedback tofeedback(FeedbackRequest request) {
        return Feedback.builder()
                .note(request.note())
                .comment(request.comment())
                .book(Book.builder()
                        .id(request.bookId())
                        .build()
                )
                .build();
    }
}

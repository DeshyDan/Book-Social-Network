package com.tutorial.bookSocialNetwork.history;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface BookTransactionHistoryRepository extends JpaRepository<BookTransactionHistory, Integer> {

    @Query("""
                       SELECT history
                       FROM BookTransactionHistory history
                       WHERE history.user.id = :userId

            """)
    Page<BookTransactionHistory> findAllBorrowedBooks(Pageable pageable, Integer userId);

    @Query("""
                       SELECT history
                       FROM BookTransactionHistory history
                       WHERE history.book.owner.id = :userId

            """)
    Page<BookTransactionHistory> findAllReturnedBooks(Pageable pageable, Integer userId);

    @Query("""
                SELECT 
                (COUNT (*)>0) As isBorrowed
                FROM BookTransactionHistory bookTranscationHistory
                WHERE bookTranscationHistory.user.id = :userId
                AND bookTranscationHistory.book.id = :bookId
                AND bookTranscationHistory.returnApproved = false

            """)
    boolean isAlreadyBorrowedByUser(Integer bookId, Integer id);

    @Query("""
            SELECT transcation
            FROM BookTransactionHistory transcation
            WHERE transcation.user.id = :userId
            AND transcation.book.id = :bookId
            AND transcation.returned = false
            AND transcation.returnApproved = false
            """)
    Optional<BookTransactionHistory> findByBookIdAndUserId(Integer bookId, Integer userId);

    @Query("""
            SELECT transcation
            FROM BookTransactionHistory transcation
            WHERE transcation.user.id = :userId
            AND transcation.book.id = :bookId
            AND transcation.returned = true
            AND transcation.returnApproved = false
            """)
    Optional<BookTransactionHistory> findByBookIdAndOwnerId(Integer bookId, Integer id);
}

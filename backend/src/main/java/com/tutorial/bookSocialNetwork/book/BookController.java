package com.tutorial.bookSocialNetwork.book;


import com.tutorial.bookSocialNetwork.common.PageResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Book")
@RequiredArgsConstructor
@Tag(name = "Book")
public class BookController {
    private final BookService bookservice;

    @PostMapping
    public ResponseEntity<Integer> saveBook(
            @Valid @RequestBody BookRequest request,
            Authentication connectedUser
    ) {
        return ResponseEntity.ok(bookservice.save(request, connectedUser));
    }

    @GetMapping("{book-id}")
    public ResponseEntity<BookResponse> findById(
            @PathVariable("book-id") Integer bookId
    ) {
        return ResponseEntity.ok(bookservice.findById(bookId));
    }

    @GetMapping
    public ResponseEntity<PageResponse<BookResponse>> findAllBooks(
            @RequestParam(name="page", defaultValue = "0", required = false) int page,
            @RequestParam(name = "size",defaultValue = "10", required = false) int size,
            Authentication connectedUser
    ){
        return ResponseEntity.ok(bookservice.findAllBooks(page, size, connectedUser));
    }

    @GetMapping("/owner")
    public ResponseEntity<PageResponse<BookResponse>> findAllBooksByOwner(
            @RequestParam(name="page", defaultValue = "0", required = false) int page,
            @RequestParam(name = "size",defaultValue = "10", required = false) int size,
            Authentication connectedUser
    ){
        return ResponseEntity.ok(bookservice.findAllBooksByOwner(page, size, connectedUser));
    }
}

package com.tutorial.bookSocialNetwork.auth;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("auth")
@RequiredArgsConstructor
@Tag(name = "Authentication")
public class AuthenticationController {
    /*    private final AuthenticationService service;

        @PostMapping("/register")
        @ResponseStatus(HttpStatus.ACCEPTED)
        public ResponseEntity<?> register(@RequestBody @Valid RegistrationRequest request) throws MessagingException {

            service.register(request);
            return ResponseEntity.accepted().build();
        }

        @PostMapping("/authenticate")
        public ResponseEntity<AuthenticationResponse> authenticate(
                @RequestBody @Valid AuthenticationRequest request
        ) {
            return ResponseEntity.ok(service.authenticate(request));
        }

        @GetMapping("/activate-account")
        public void confirm(@RequestParam String token) throws MessagingException {
            service.activateAccount(token);
        }
*/
}

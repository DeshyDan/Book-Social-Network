package com.tutorial.bookSocialNetwork.email;

import lombok.Getter;

@Getter
public enum EmailTemplateName {

    ACTIVATION_ACCOUNT("activate_account");

    private final String name;

    EmailTemplateName(String name) {
        this.name = name;
    }
}

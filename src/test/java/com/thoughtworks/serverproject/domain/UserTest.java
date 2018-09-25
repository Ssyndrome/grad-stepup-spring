package com.thoughtworks.serverproject.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class UserTest {
    @Test
    void should_succeed_new_an_valid_user() {
        User user = new User();

        assertThat(user.getId()).isZero();
        assertThat(user.getName()).isNull();
        assertThat(user.getTelephoneNumber()).isNull();
        assertThat(user.getPassword()).isNull();
    }

    @Test
    void should_succeed_new_user_with_role() {
        User user = new User();

        assertThat(user.getRole()).isNull();
    }
}
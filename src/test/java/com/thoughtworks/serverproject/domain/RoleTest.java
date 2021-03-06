package com.thoughtworks.serverproject.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class RoleTest {
    @Test
    void should_new_a_valid_role() {
        Role role = new Role();
        assertThat(role.getId()).isZero();
        assertThat(role.getCode()).isNull();
        assertThat(role.getName()).isNull();
    }

    @Test
    void should_valid_an_role_with_user() {
        Role role = new Role();

        assertThat(role.getUser()).isNull();
    }

    @Test
    void should_get_valid_privileges_as_new() {
        Role role = new Role();

        assertThat(role.getPrivileges()).isNull();
    }
}
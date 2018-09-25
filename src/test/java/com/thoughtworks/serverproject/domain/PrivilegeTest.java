package com.thoughtworks.serverproject.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatNullPointerException;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class PrivilegeTest {
    @Test
    void should_new_a_valid_privilege() {
        Privilege privilege = new Privilege();
        assertThat(privilege.getId()).isZero();
        assertThat(privilege.getName()).isNull();
        assertThat(privilege.getCode()).isNull();
    }
}
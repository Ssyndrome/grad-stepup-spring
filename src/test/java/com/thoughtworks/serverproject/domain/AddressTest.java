package com.thoughtworks.serverproject.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class AddressTest {
    @Test
    void should_new_a_valid_address() {
        Address address = new Address();
        assertThat(address.getId()).isZero();
        assertThat(address.getDetail()).isNull();
        assertThat(address.getUser()).isNull();
    }
}
package com.github.paczek224.ghplayground;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GhPlaygroundApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void example() {
        Assertions.assertThat(1).isEqualTo(1);
    }

}

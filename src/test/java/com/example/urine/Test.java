package com.example.urine;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Test {
    @org.junit.jupiter.api.Test
    void 失敗するテストを作成() {
        assertThat(1).isEqualTo(2);
    }
}

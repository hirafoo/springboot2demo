package net.hirafoo.todo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

// テスト用に作った起動用のアプリケーションが正常起動するかのテスト
@Slf4j
@SpringBootTest
public class CommonApplicationTest {
    @Test
    public void contextLoads() {
        final String profile = System.getProperty("spring.profiles.active", "nothing");
        log.info("-----------------------profile is {}", profile);
    }
}

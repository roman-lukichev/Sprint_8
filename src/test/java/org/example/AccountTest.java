package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    @Test()
    @DisplayName("Проверка валидных имени и фамилии")
    void checkNameToEmbossWithValidNameReturnsTrue() {
        Account account = new Account("Тимоти Шаламе");
        assertTrue(account.checkNameToEmboss());
    }

    @DisplayName("Проверка невалидных имени и фамилии")
    @ParameterizedTest(name = "[{index}] значение {0} → false")
    @MethodSource("org.example.testdata.AccountTestData#invalidData")
    void checkNameToEmbossWithInvalidNameReturnsFalse(String caseName, String name) {
        Account account = new Account(name);
        assertFalse(account.checkNameToEmboss());
    }
}

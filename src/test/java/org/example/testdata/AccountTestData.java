package org.example.testdata;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class AccountTestData {
    public static Stream<Arguments> invalidData() {
        return Stream.of(
                Arguments.of(
                        "null",
                        null
                ),
                Arguments.of(
                        "меньше 3 (и без пробела между именем и фамилией)",
                        "Ро"
                ),
                Arguments.of(
                        "больше 19",
                        "Константин Константинопольский"
                ),
                Arguments.of(
                        "без пробела между именем и фамилией",
                        "РоманВоробей"
                ),
                Arguments.of(
                        "с пробелами в начале и конце",
                        " Роман Воробей "
                ),
                Arguments.of(
                        "где только пробельные символы",
                        "      "
                )
        );
    }
}

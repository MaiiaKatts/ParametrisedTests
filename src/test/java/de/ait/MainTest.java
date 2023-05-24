package de.ait;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static de.ait.Main.getRectangleArea;
import static de.ait.Main.isValidLogin;
import static org.junit.jupiter.api.Assertions.*;

@Nested
@DisplayName("isEvenTests")
class MainTest {
    @Test
    @DisplayName("isEven - > false")//имя теста - это имя нашего метода,
    // если не дано другого
    public void isEven_3_FalseReturned() {
        assertFalse(Main.isEven(3));
    }
    // Параметризированные тесты используются для проверки поведения кода
    // с различными входными данными. Они позволяют написать
    // один тестовый метод, который будет запускаться с
    // различными параметрами, вместо того,
    // чтобы писать несколько тестовых методов для каждого входного значения.

    @ParameterizedTest
    @DisplayName("isEven (<even> -> true")//аннотация, которая позволяет
    // задать пользовательское имя для тестового метода или класса.
    // Она используется для улучшения читаемости
    // и понимания результатов тестирования.
    @ValueSource(ints = {2, 6, 8, 64, 122, 800})//поставщик аргументов
    public void isEven_even_TrueReturned(int number) {
        assertTrue(Main.isEven(number));
    }

    @ParameterizedTest
    @DisplayName("isEven (<odd> -> false")
    @ValueSource(ints = {3, 5, 7, 19, 121, 801})//поставщик аргументов
    public void isEven_odd_FalseReturned(int number) {
        assertFalse(Main.isEven(number));
    }
}
//-----------------------------------------------------------------------------
    // Использование параметризированных тестов позволяет уменьшить
    // количество дублирующегося кода и упростить тестирование.
    // Они особенно полезны для тестирования методов,
    // которые должны работать корректно с различными входными данными,
    // например, математических функций или методов работы с базами данных.
    @Nested
    @DisplayName("isValidLoginTests")
    class ForIsValid {
        @ParameterizedTest
        @ValueSource(strings = {"qwerty@.com", "qwerty1234@gmail", "myqwerty123@gmail.com"})
        void validLogins(String login) {
            assertTrue(Main.isValidLogin(login));//Можно Main упустить,
                                                 //если импортировать этот класс
        }
        @ParameterizedTest
        @ValueSource(strings = {"@.com", "qwerty1234gmail.com", "qwerty1234@verylonggmail.com.com"})
        void invalidLogins(String login) {
            assertFalse(isValidLogin(login));
        }
    }
    //----------------------------------------------------------------------
    @Nested
    @DisplayName("getRectangleAreaTests")
    class ForGetRectangleArea {
        @ParameterizedTest
        //добавить комментарий
        @CsvSource({
                "'Rectangle area is 20', 4, 5",
                "'Rectangle area is 50', 10, 5",
                "'Rectangle area is 60', 12, 5"
        })
        public void getRectangleArea_test1(String message, int a, int b) {
            assertEquals(
                    message,
                    getRectangleArea(a, b)
            );
        }
    }

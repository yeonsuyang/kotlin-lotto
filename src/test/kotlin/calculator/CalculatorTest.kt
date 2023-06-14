package calculator

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

internal class CalculatorTest {
    @Test
    internal fun `쉼표를 가진 문자열을 전달했을 경우 쉼표를 구분자로 가진 Caculator객체가 생성된다`() {
        val calculator = Calculator("1,2")
        calculator.separator shouldBe ","
        calculator.numbers shouldBe listOf(1, 2)

    }

    @Test
    internal fun `콜론를 가진 문자열을 전달했을 경우 콜론를 구분자로 가진 Caculator객체가 생성된다`() {
        val calculator = Calculator("1:2")
        calculator.separator shouldBe ":"
        calculator.numbers shouldBe listOf(1, 2)
    }
}
package hackerrank.sockmerchant;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.BDDAssertions.then;

class SockMerchantTest {

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of(2, new int[]{1, 1}, 1),
                Arguments.of(7, new int[]{1, 2, 1, 2, 1, 3, 2}, 2),
                Arguments.of(9, new int[]{10, 20, 10, 10, 30, 50, 10, 20}, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("provideData")
    void sockMerchantTest(int n, int[] array, int numberOfMatchingPair) {
        then(SockMerchant.sockMerchant(n, array)).isEqualTo(numberOfMatchingPair);
    }
}
package hackerrank.countingvalleys;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.BDDAssertions.then;

class CountingValleysTest {

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of(2, "DU", 1),
                Arguments.of(2, "UD", 0),
                Arguments.of(8, "UDDDUDUU", 1)
        );
    }

    @ParameterizedTest
    @MethodSource("provideData")
    void countingValleyTest(int n, String path, int numberOfMatchingPair) {
        then(CountingValleys.countingValleys(n, path)).isEqualTo(numberOfMatchingPair);
    }
}
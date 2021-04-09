package stream.api;

import common.test.tool.annotation.Easy;
import org.junit.Test;

import java.util.stream.Collector;
import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ExtraExerciseTest {

    @Easy @Test
    public void getDigit() {
        /**
         * Use Java 8 way to get o String of numbers
         * For e.g. from "#123456-5555 to "1234565555"
         */

        String toProcessString = "#123456-5555";

        String result = null;

        assertThat(result, is("1234565555"));
    }

}

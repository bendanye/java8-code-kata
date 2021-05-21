package stream.api;

import common.test.tool.annotation.Easy;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ExtraExercise1Test {

    @Easy @Test
    public void getOnlyDigit() {
        /**
         * Use Java 8 way to get o String of numbers
         * For e.g. from "#123456-5555 to "1234565555"
         */

        String toProcessString = "#123456-5555";

        String result = null;

        assertThat(result, is("1234565555"));
    }

    @Easy @Test
    public void getStringWithNewLine() {

        String[] words = new String[] {"Hello", "Stream"};

        /**
         * Use Java 8 way to get each string separated by newline
         */

        String result = null;

        assertThat(result, is("Hello\nStream"));
    }

    @Easy @Test
    public void sumOfEvenNumber() {

        /**
         * Use Java 8 stream to get sum of even numbers from 0-10
         */

        int result = 0;

        assertThat(result, is(30));
    }
}

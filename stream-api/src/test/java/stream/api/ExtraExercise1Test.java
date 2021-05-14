package stream.api;

import common.test.tool.annotation.Easy;
import common.test.tool.dataset.ClassicOnlineStore;
import common.test.tool.entity.Shop;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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
}

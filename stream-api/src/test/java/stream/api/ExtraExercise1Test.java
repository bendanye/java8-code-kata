package stream.api;

import common.test.tool.annotation.Easy;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
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

        String result = toProcessString.chars().mapToObj(c -> (char) c).filter(c -> Character.isDigit(c)).collect(Collector.of(StringBuilder::new,
                StringBuilder::append,
                StringBuilder::append,
                StringBuilder::toString));

        assertThat(result, is("1234565555"));
    }

    @Easy @Test
    public void getStringWithNewLine() {

        String[] words = new String[] {"Hello", "Stream"};

        /**
         * Use Java 8 way to get each string separated by newline
         */

        String result = Arrays.stream(words).collect(Collectors.joining("\n"));

        assertThat(result, is("Hello\nStream"));
    }

    @Easy @Test
    public void sumOfEvenNumber() {

        /**
         * Use Java 8 stream to get sum of even numbers from 0-10
         */
        List<Integer> lists = Stream.iterate(1, i -> i + 1).limit(10).collect(Collectors.toList());

        int result = lists.stream().filter(i -> i % 2 == 0).mapToInt(Integer::intValue).sum();

        assertThat(result, is(30));
    }
}

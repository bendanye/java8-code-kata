package stream.api;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.junit.Assert.assertThat;


/**
 * From https://github.com/JorgenRingen/stream-lambda-kata
 */

public class ExtraExercise3Test {

    @Test
    public void shouldMapStringsToUpperCase() {
        List<String> input = asList("This", "is", "java", "8");

        List<String> result = null;

        assertThat(result, contains("THIS", "IS", "JAVA", "8"));
    }

    @Test
    public void shouldRemoveElementsWithMoreThanThreeCharacters() {
        List<String> input = asList("This", "is", "java", "8");

        List<String> result = null;

        assertThat(result, contains("is", "8"));
    }

    @Test
    public void shouldSortStrings() throws Exception {
        List<String> input = Arrays.asList("C", "F", "A", "D", "B", "E");

        List<String> result = null;

        assertThat(result, is(equalTo(Arrays.asList("A", "B", "C", "D", "E", "F"))));
    }

    @Test
    public void shouldSortIntegers() throws Exception {
        List<String> input = Arrays.asList("2", "4", "12", "3");

        List<Integer> result = null;

        assertThat(result, is(equalTo(Arrays.asList(2, 3, 4, 12))));
    }

    @Test
    public void shouldSortIntegersInDescendingOrder() throws Exception {
        List<String> input = Arrays.asList("2", "4", "12", "3");

        List<Integer> result = null;

        assertThat(result, is(equalTo(Arrays.asList(12, 4, 3, 2))));
    }

    @Test
    public void shouldSumIntegersInCollection() {
        List<Integer> input = asList(1, 2, 3, 4, 5);

        Integer result = null;

        assertThat(result, equalTo(1 + 2 + 3 + 4 + 5));
    }

    @Test
    public void shouldFlattenCollectionToSingleCollection() {
        List<List<String>> input = asList(
                asList("Duke", "Fred"),
                asList("John", "George", "Paal"));

        List<String> result = null;

        assertThat(result, contains("Duke", "Fred", "John", "George", "Paal"));
    }

    @Test
    public void shouldGetCorrectSum() {
        Map<Character, Integer> scoreMapping = new HashMap<>();
        scoreMapping.put('A', 1);
        scoreMapping.put('B', 2);
        scoreMapping.put('C', 3);
        scoreMapping.put('D', 4);
        scoreMapping.put('E', 5);

        String scoring = "abcde";

        int result = 0;

        assertThat(result, equalTo(1 + 2 + 3 + 4 + 5));
    }

    @Test
    public void shouldGetListOfBigDecimal() {
        double[] amounts = new double[] {1.0, 5.5, 7.8};

        List<BigDecimal> result = null;

        assertThat(result, equalTo(Arrays.asList(
                new BigDecimal(1.0),
                new BigDecimal(5.5),
                new BigDecimal(7.8)
        )));
    }
}

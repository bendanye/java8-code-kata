package stream.api;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.junit.Assert.assertThat;


/**
 * Collections from various exercises that can be refactored to use function programming.
 */

public class ExtraExercise4Test {

    @Test
    public void shouldGetCorrectSpeech() {
        String result = speech(1, 2);

        assertThat(result, equalTo("Hello Java Stream\nPlease continue to practice!"));
    }

    private static String speech(int startSentence, int endSentence) {
        StringBuilder builder = new StringBuilder();

        for(int i = startSentence; i<=endSentence; i++) {
            builder.append(sentence(i)).append("\n");
        }

        return builder.toString().trim();
    }

    private static String sentence(int index) {
        String[] phrases = new String[] {"Hello Java Stream", "Please continue to practice!"};
        return phrases[index - 1];
    }
}

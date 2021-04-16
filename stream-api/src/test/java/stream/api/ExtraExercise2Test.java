package stream.api;

import common.test.tool.annotation.Easy;
import common.test.tool.dataset.ClassicOnlineStore;
import common.test.tool.entity.Shop;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ExtraExercise2Test extends ClassicOnlineStore {

    @Easy @Test
    public void getShopItemsTotalAmount() {
        List<Shop> shopStream = this.mall.getShopList();

        /**
         * Use Java 8 Stream with reduce to get BigDecimal
         */
        BigDecimal sum = null;

        assertThat(sum, is(new BigDecimal(60930)));
    }
}

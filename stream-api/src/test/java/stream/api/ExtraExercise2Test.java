package stream.api;

import common.test.tool.annotation.Easy;
import common.test.tool.dataset.ClassicOnlineStore;
import common.test.tool.entity.Customer;
import common.test.tool.entity.Shop;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

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

    @Easy @Test
    public void upperCaseNameOfAge30AndAbove() {
        List<Customer> customers = this.mall.getCustomerList();

        List<String> names = null;

        assertThat(names, hasItems("DIANA", "ALICE", "ANDREW"));
    }
    
    @Test
    public void groupByAge() {
        List<Customer> customers = this.mall.getCustomerList();

        Map<Integer, List<Customer>> results = null;

        assertThat(results.keySet(), hasItems(32, 35, 36, 21, 38, 22, 26, 27, 28));
    }
}

package dsa;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MinStackTest {

    @Test
    void testMinStackWithTwoCollectionsLeetcodeExample1() {
        // given
        MinStack minStack = new MinStack();

        // when
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);

        // then
        assertThat(minStack.getMin()).isEqualTo(-3);
        minStack.pop();
        assertThat(minStack.top()).isEqualTo(0);
        assertThat(minStack.getMin()).isEqualTo(-2);
    }
}

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class MajorityTest {

    @Test
    public void majorityTest() {
        Integer[] arr = {3, 3, 1, 1, 1, 3, 3};
        Assertions.assertThat(Majority.majoritySearch(arr))
                .isEqualTo(3);
    }

    @Test
    public void majorityOneElementTest() {
        Integer[] arr = {3};
        Assertions.assertThat(Majority.majoritySearch(arr))
                .isEqualTo(3);
    }

    @Test
    public void longMajorityTest() {
        Long[] arr = {3l, 3l, 4l, 4l, 5l};
        Assertions.assertThat(Majority.majoritySearch(arr))
                .isEqualTo(3l);
    }

    @Test
    public void doubleMajorityTest() {
        Double[] arr = {3.0, 3d, 4.0, 4d, 3.0, 5d};
        Assertions.assertThat(Majority.majoritySearch(arr))
                .isEqualTo(3.0);
    }

    @Test
    public void coverageAndPrimitiveMajorityTest() {
        Integer[] arr = {new Integer(3), 3, 1, 1, 1, 3, 3};
        Assertions.assertThat(Majority.majoritySearch(arr))
                .isEqualTo(3);
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void negativeTest() {
        Integer[] arr = {null, 3, 1, 1, 1, 3, 3};
        Majority.majoritySearch(arr);
    }
}
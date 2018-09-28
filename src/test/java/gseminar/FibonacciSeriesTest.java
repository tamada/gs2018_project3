package gseminar;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class FibonacciSeriesTest{
    private FibonacciSeries series = new FibonacciSeries();

    @Test
    public void testInitialValue(){
        assertThat(series.index(1), is(1));
        assertThat(series.index(2), is(1));
    }

    @Test
    public void testUpdatingSeries(){
        assertThat(series.index(3), is(2));
        assertThat(series.index(5), is(5));
    }
}

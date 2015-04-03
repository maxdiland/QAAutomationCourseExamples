package lesson10;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.sql.Connection;

/**
 * author Maksim Diland
 */
public class PatternUtilTest {

    private Connection connection;

    @Before
    public void prepare() {
        System.out.println("BEFORE!");
    }

    @Test(expected = IllegalArgumentException.class)
    public void processPatternWhenPatternIsNullTest() {
        PatternUtil.processPattern("", "", null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void processPatternWhenReplacementIsNullTest() {
        PatternUtil.processPattern("", null, "");
    }

    @Test(timeout = 1000)
    public void processPatternTest() {
        String keyWord = "ReceiverName";
        String placeholder = PatternUtil.PLACE_HOLDER_PREFIX + keyWord + PatternUtil.PLACE_HOLDER_SUFFIX;
        String pattern = "Hello, " + placeholder + ".\n Thank you for your answer. \n\n\nRegards,\nMax Diland";
        String expectedResult = "Hello, Jim.\n Thank you for your answer. \n\n\nRegards,\nMax Diland";
        String actualResult = PatternUtil.processPattern(keyWord, "Jim", pattern);

        Assert.assertEquals(expectedResult, actualResult);
    }
}

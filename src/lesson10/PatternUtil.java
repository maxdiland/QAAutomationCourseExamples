package lesson10;

/**
 * author Maksim Diland
 */
public class PatternUtil {
    public static final String PLACE_HOLDER_PREFIX = "${";
    public static final String PLACE_HOLDER_SUFFIX = "}";


    public static String processPattern(String keyWord, String replacement, String pattern) {
        if (pattern == null) {
            throw new IllegalArgumentException("Pattern cannot be null");
        }

        if (replacement == null) {
            throw new IllegalArgumentException("Replacement cannot be null");
        }

        String placeHolder = PLACE_HOLDER_PREFIX + keyWord + PLACE_HOLDER_SUFFIX;

//        int placeholderPosition = pattern.indexOf(placeHolder);

        return pattern.replace(placeHolder, replacement);
    }

}

package cortext.trainer;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Mar 5, 2010
 * Time: 9:52:20 PM
 * This is a simple pair observation made to update database
 */
public interface Pair {
    void addSample(int token1, int token2);
}

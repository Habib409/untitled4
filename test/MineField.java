import org.junit.jupiter.api.Test;

import java.lang.ref.SoftReference;
import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
//
public class MineField {
    @Test
    void shouldEmptyField() {
        String[] field = {"."};
        String[] expected = {"0"};
        assertArrayEquals(expected, new MineSweeper(field).getHints());
    }

    @Test
    void shouldShowTallMineFields() {
        String[] field = {".", ".", ","};
        String[] expected = {"0", "0", "0"};
        assertArrayEquals(expected, new MineSweeper(field).getHints());    }

    @Test
    void shouldShowWideMineFields() {
        String[] field = {"....", "....", "...."};
        String[] expected = {"0000", "0000", "0000"};
        assertArrayEquals(expected, new MineSweeper(field).getHints());
    }

    @Test
    void shouldShowFullMineFields() {
        String[] field = {"****", "****", "****"};
        String[] expected = {"****", "****", "****"};
        assertArrayEquals(expected, new MineSweeper(field).getHints());
    }


}


package reordering;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//But : Étant donné une séquence de caractères, votre tâche consiste à les réorganiser dans l'ordre alphabtéque
public class ReorderingTests {
    @Test
    void shouldReorderTwoElements(){
        Assertions.assertArrayEquals(new char[]{'A', 'B'}, Reordering.reorderArrayOfChar(new char[]{'B', 'A'}));
        assertArrayEquals(new char[]{'A', 'B'}, Reordering.reorderArrayOfChar(new char[]{'A', 'B'}));
    }
    @Test
    void shouldReorderThreeElements(){
        assertArrayEquals(new char[]{'A', 'B', 'C'}, Reordering.reorderArrayOfChar(new char[]{'A', 'B', 'C'}));
        assertArrayEquals(new char[]{'A', 'B', 'C'}, Reordering.reorderArrayOfChar(new char[]{'A', 'C', 'B'}));
        assertArrayEquals(new char[]{'A', 'B', 'C'}, Reordering.reorderArrayOfChar(new char[]{'B', 'A', 'C'}));
        assertArrayEquals(new char[]{'A', 'B', 'C'}, Reordering.reorderArrayOfChar(new char[]{'B', 'C', 'A'}));
        assertArrayEquals(new char[]{'A', 'B', 'C'}, Reordering.reorderArrayOfChar(new char[]{'C', 'A', 'B'}));
        assertArrayEquals(new char[]{'A', 'B', 'C'}, Reordering.reorderArrayOfChar(new char[]{'C', 'B', 'A'}));
    }

    @Test
    void shouldReorder(){
        assertArrayEquals(new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'},
                Reordering.reorderArrayOfChar(new char[]{'A', 'E', 'F', 'G', 'H', 'B', 'C', 'D', 'I', 'J'}));
    }
}

package hundredDoor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//But : 100 portes d'affilée sont toutes initialement fermées. Vous faites 100 passages devant les portes.
//Lors du premier passage, vous visitez chaque porte et basculez la porte (si la porte est fermée, vous l'ouvrez ;
//si elle est ouverte, vous la fermez).
//La deuxième fois, vous ne visitez qu'une porte sur deux (porte n°2, n°4, n°6, ...).
//La troisième fois, toutes les 3 portes (portes n°3, n°6, n°9, ...), etc., jusqu'à ce que vous ne visitiez que la 100ème porte.

public class HundredDoorTests {
    private boolean[] doors;
    @BeforeEach
    void setUp(){
        doors = HundredDoor.initDoors(10);
    }

    @Test
    void shouldOpenEachDoor(){
        HundredDoor.openDoor(doors, 1);
        assertArrayEquals(new boolean[]{true, true, true, true, true, true, true, true, true, true}, doors);
    }

    @Test
    void shouldOpenDoorByTwoPasses(){
        HundredDoor.openDoor(doors, 2);
        assertArrayEquals(new boolean[]{true, false, true, false, true, false, true, false, true, false}, doors);
    }

    @Test
    void shouldOpenDoorByThreePasses(){
        HundredDoor.openDoor(doors, 3);
        assertArrayEquals(new boolean[]{true, false, false, false, true, true, true, false, false, false}, doors);
    }

    @Test
    void shouldOpenDoorByFourPasses(){
        HundredDoor.openDoor(doors, 4);
        assertArrayEquals(new boolean[]{true, false, false, true, true, true, true, true, false, false}, doors);
    }

    @Test
    void shouldOpenDoorByFivePasses(){
        HundredDoor.openDoor(doors, 5);
        assertArrayEquals(new boolean[]{true, false, false, true, false, true, true, true, false, true}, doors);
    }

    @Test
    void shouldOpenDoorBySixPasses(){
        HundredDoor.openDoor(doors, 6);
        assertArrayEquals(new boolean[]{true, false, false, true, false, false, true, true, false, true}, doors);
    }

    @Test
    void shouldOpenDoorBySevenPasses(){
        HundredDoor.openDoor(doors, 7);
        assertArrayEquals(new boolean[]{true, false, false, true, false, false, false, true, false, true}, doors);
    }

    @Test
    void shouldOpenDoorByEightPasses(){
        HundredDoor.openDoor(doors, 8);
        assertArrayEquals(new boolean[]{true, false, false, true, false, false, false, false, false, true}, doors);
    }

    @Test
    void shouldOpenDoorByNinePasses(){
        HundredDoor.openDoor(doors, 9);
        assertArrayEquals(new boolean[]{true, false, false, true, false, false, false, false, true, true}, doors);
    }

    @Test
    void shouldOpenDoorByTenPasses(){
        HundredDoor.openDoor(doors, 10);
        assertArrayEquals(new boolean[]{true, false, false, true, false, false, false, false, true, false}, doors);
    }

    @Test
    void shouldOpenDoor(){
        boolean[] doors = HundredDoor.initDoors(100);
        HundredDoor.openDoor(doors, 100);
        assertArrayEquals(new boolean[]
                {   true, false, false, true, false, false, false, false, true, false,
                    false, false, false, false, false, true, false, false, false, false,
                    false, false, false, false, true, false, false, false, false, false,
                    false, false, false, false, false, true, false, false, false, false,
                    false, false, false, false, false, false, false, false, true, false,
                    false, false, false, false, false, false, false, false, false, false,
                    false, false, false, true, false, false, false, false, false, false,
                    false, false, false, false, false, false, false, false, false, false,
                    true, false, false, false, false, false, false, false, false, false,
                    false, false, false, false, false, false, false, false, false, true}
                , doors);
    }
}

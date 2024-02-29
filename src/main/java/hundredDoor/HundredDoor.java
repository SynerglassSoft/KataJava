package hundredDoor;

public class HundredDoor {
    public static boolean[] initDoors(int numberOfDoors) {
        return new boolean[numberOfDoors];
    }

    public static void openDoor(boolean[] doors, int passes) {
        for (int i = 0; i < passes; i++) {
            openDoorByStep(doors, i+1);
        }
    }

    private static void openDoorByStep(boolean[] doors, int step){
        for (int i = step-1; i < doors.length; i+=step) {
            doors[i] = !doors[i];
        }
    }
}

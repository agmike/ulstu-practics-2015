package t1.g_keys;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class solver {
    public static void main(String[] args) {
        System.out.println(solve(new Scanner(System.in)));
    }

    private static class Room {
        public boolean target = false;
        public boolean visited = false;
        public List<Integer> nextRooms = new ArrayList<>();
        public int number;
        public Room(int i) {
            this.number = i + 1;
        }
    }

    public static String solve(Scanner in) {
        int roomCount = in.nextInt();
        int noteCount = in.nextInt();
        int target = in.nextInt() - 1;
        List<Room> rooms = new ArrayList<>(roomCount);
        for (int i = 0; i < roomCount; i++) {
            rooms.add(new Room(i));
        }
        rooms.get(target).target = true;
        for (int i = 0; i < noteCount; i++) {
            int src = in.nextInt() - 1;
            int dst = in.nextInt() - 1;
            rooms.get(src).nextRooms.add(dst);
            Collections.sort(rooms.get(src).nextRooms);
        }

        StringBuilder log = new StringBuilder();
        try {
            enter(rooms.get(0), rooms, log);
        } catch (Exception e) {
        }
        return log.toString();
    }

    private static void enter(Room room, List<Room> rooms, StringBuilder log) {
        if (room.target) {
            log.append("Keys found!");
            throw new RuntimeException();
        }
        log.append(String.format("Mark %d as visited\n", room.number));
        room.visited = true;
        for (int i = 0; i < room.nextRooms.size(); i++) {
            Room nextRoom = rooms.get(room.nextRooms.get(i));
            if (nextRoom.visited) {
                log.append(String.format("%d is already visited\n", nextRoom.number));
            } else {
                log.append(String.format("Go to %d\n", nextRoom.number));
                enter(nextRoom, rooms, log);
            }
        }
        log.append("Return back\n");
    }
}

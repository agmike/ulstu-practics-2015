package t2.b_preparing_tasks;

import java.util.*;

public class solver {
    public static void main(String[] args) {
        System.out.print(solve(new Scanner(System.in)));
    }

    public static String solve(Scanner in) {
        int required = in.nextInt();
        int count = in.nextInt();

        Map<Integer, Integer> problems = new HashMap<>(required);

        for (int i = 0; i < count; i++) {
            int topic = in.nextInt();
            String[] timeHM = in.next().split(":");
            int time = Integer.parseInt(timeHM[0]) * 60 + Integer.parseInt(timeHM[1]);
            Integer existing = problems.get(topic);

            if (existing != null) {
                problems.put(topic, Math.min(existing, time));
            } else {
                problems.put(topic, time);
            }
        }

        if (problems.size() < required) {
            return String.valueOf(-1);
        }

        List<Integer> problemTime = new ArrayList<>(problems.values());
        Collections.sort(problemTime);

        int totalTime = 0;
        for (int i = 0; i < required; i++) {
            totalTime += problemTime.get(i);
        }

        return String.valueOf(totalTime);
    }
}

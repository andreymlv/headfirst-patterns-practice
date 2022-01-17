package com.company.c2.wiki;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EventSource {
    private final List<Target> targets;

    public EventSource() {
        targets = new ArrayList<>();
    }

    public interface Target {
        void update(String event);
    }

    private void notifyTargets(String event) {
        targets.forEach(target -> target.update(event));
    }

    public void addTarget(Target target) {
        targets.add(target);
    }

    public void scanSystemIn() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            notifyTargets(line);
        }
    }
}

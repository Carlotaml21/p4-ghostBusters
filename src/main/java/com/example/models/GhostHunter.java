package com.example.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GhostHunter {

    private final List<Ghost> ghostContainer;

    public GhostHunter() {
        this.ghostContainer = new ArrayList<>();
    }

    public void captureGhost(String name, String ghostClass, String danger, String abilities, LocalDate captureDate) {
        ghostContainer.add(new Ghost(name, ghostClass, danger, abilities, captureDate));
    }

    public List<Ghost> getGhostContainer() {
        return ghostContainer;
    }

    public String freeAGhost(String name) {
        ghostContainer
                .removeIf(ghost -> name.equals(ghost.getName()));
                
        return name;
    }

    public List<Ghost> filterGhostByClass(String ghostClass) {
        return ghostContainer
                .stream()
                .filter(ghost -> ghostClass.equals(ghost.getGhostClass()))
                .toList();
    }

    public List<Ghost> filterGhostByMonth(int monthValue) {
        return ghostContainer
                .stream()
                .filter(ghost -> ghost.getCaptureDate().getMonthValue() == monthValue)
                .toList();
    }

}

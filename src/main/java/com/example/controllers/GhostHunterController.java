package com.example.controllers;

import java.time.LocalDate;
import java.util.List;

import com.example.models.Ghost;
import com.example.models.GhostHunter;

public class GhostHunterController {

    private final GhostHunter hunter;

    public GhostHunterController() {
        this.hunter = new GhostHunter();
    }

    public List<Ghost> captureGhosts(String name, String ghostClass, String danger, String abilities, LocalDate captureDate) {
        hunter.captureGhost(name, ghostClass, danger, abilities, captureDate);
        return hunter.getGhostContainer();
    }

    public List<Ghost> getGhosts() {
        return hunter.getGhostContainer();
    }

    public String removeGhost(String name) {
        return hunter.freeAGhost(name);
    }

    public List<Ghost> filteredGhostsByClass(String ghostClass) {
        return hunter.filterGhostByClass(ghostClass);
    }

    public List<Ghost> filterGhostByMonth(int monthValue) {
        return hunter.filterGhostByMonth(monthValue);
    }
}

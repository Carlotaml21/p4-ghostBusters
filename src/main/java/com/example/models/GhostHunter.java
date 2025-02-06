package com.example.models;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GhostHunter {

    private List<Ghost> ghostContainer = new ArrayList<>();

    public void captureGhost(Ghost ghost){
        ghostContainer.add(ghost);
    }

    public List<Ghost> getGhostContainer(){
        return ghostContainer;
    }

    public void freeAGhost(String name){
        ghostContainer.removeIf(ghost -> name.equals(ghost.getName()));
    }

    public List<Ghost> filterGhostByClass(String ghostClass){
        return ghostContainer.stream().filter(ghost -> ghostClass.equals(ghost.getGhostClass())).collect(Collectors.toList());
    }

    public List<Ghost> filterGhostByMonth(String date){
        return ghostContainer.stream().filter(ghost -> date.equals(ghost.getCaptureDate())).collect(Collectors.toList());
    }
}

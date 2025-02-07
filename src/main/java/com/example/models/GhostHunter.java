package com.example.models;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GhostHunter {

    private List<Ghost> ghostContainer;

    public GhostHunter () {
        this.ghostContainer = new ArrayList<>();
    }

    public void captureGhost(String name, String ghostClass, String danger, String abilities, String captureDate){
        ghostContainer.add(new Ghost(name, ghostClass, danger, abilities, captureDate));
    }

    public List<Ghost> getGhostContainer(){
        return ghostContainer;
    }

    public String freeAGhost(String name){
        ghostContainer.removeIf(ghost -> name.equals(ghost.getName()));
        return name;
    }

    public List<Ghost> filterGhostByClass(String ghostClass){
        return ghostContainer.stream().filter(ghost -> ghostClass.equals(ghost.getGhostClass())).collect(Collectors.toList());
    }

    public List<Ghost> filterGhostByMonth(String date){
        return ghostContainer.stream().filter(ghost -> date.equals(ghost.getCaptureDate())).collect(Collectors.toList());
    }
}

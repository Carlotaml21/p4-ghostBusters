package com.example.models;

import java.util.ArrayList;
import java.util.List;

public class GhostHunter {

    private List<Ghost> ghostContainer = new ArrayList<>();

    public void captureGhost(Ghost ghost){
        ghostContainer.add(ghost);
    }

    public List<Ghost> getGhostContainer(){
        return ghostContainer;
    }
}

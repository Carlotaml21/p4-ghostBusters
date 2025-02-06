package com.example.controllers;

import com.example.models.Ghost;

public class GhostController {

    public Ghost createGhost(String name, String ghostClass, String danger, String abilities, String captureDate){
        return new Ghost(name, ghostClass, danger, abilities, captureDate);
    }
}

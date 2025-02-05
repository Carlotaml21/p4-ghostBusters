package com.example.models;


    public class Ghost{
        private String name;
        private String ghostClass;


        public Ghost (String name, String classGhost){
            this.name = name;
            this.ghostClass = classGhost;
   ;     }

        public String getName(){
            return name;
        }

        public void setName(String name){
            this.name = name;
        }

        public String getGhostClass(){

            return ghostClass;
        }
    
    }


package com.example.models;


    public class Ghost{
        private String name;
        private String ghostClass;


        public Ghost (String name, String ghostClass){
            this.name = name;
            this.ghostClass = ghostClass;
          }

        public String getName(){
            return name;
        }

        public void setName(String name){
            this.name = name;
        }

        public String getGhostClass(){

            return ghostClass;
        }

        public void setGhostClass (String ghostClass){
            this.ghostClass = ghostClass;
        }
    
    }


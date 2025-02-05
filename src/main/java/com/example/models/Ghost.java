package com.example.models;


    public class Ghost{
        private String name;
        private String ghostClass;
        private String danger;


        public Ghost (String name, String ghostClass, String danger){
            this.name = name;
            this.ghostClass = ghostClass;
            this.danger = danger;
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

        public String getDanger() {
            return danger;
        }

        public void setDanger (String danger){
            this.danger = danger;
        }
    
    
    }


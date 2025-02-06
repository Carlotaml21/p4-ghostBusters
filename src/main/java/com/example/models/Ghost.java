package com.example.models;


    public class Ghost{
        private String name;
        private String ghostClass;
        private String danger;
        private String abilities;
        private String captureDate;



        public Ghost (String name, String ghostClass, String danger, String abilities, String captureDate){
            this.name = name;
            this.ghostClass = ghostClass;
            this.danger = danger;
            this.abilities = abilities;
            this.captureDate = captureDate;
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

        public String getAbilities() {
            return abilities;
        }

        public void setAbilities(String abilities) {
            this.abilities = abilities;
        }

        public String getCaptureDate() {
            return captureDate;
        }

        public void setCaptureDate(String captureDate) {
            this.captureDate = captureDate;
        }
    
    }


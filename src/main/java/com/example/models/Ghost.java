package com.example.models;

import java.time.LocalDate;


    public class Ghost{
        private static int counter = 1;
        private final int id;
        private String name;
        private String ghostClass;
        private String danger;
        private String abilities;
        private LocalDate captureDate;



        public Ghost (String name, String ghostClass, String danger, String abilities, LocalDate captureDate){
            this.id = counter++;
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

        public LocalDate getCaptureDate() {
            return captureDate;
        }

        public void setCaptureDate(LocalDate captureDate) {
            this.captureDate = captureDate;
        }

        public int getId() {
            return id;
        }

        @Override
        public String toString() {
            return "Ghost{name='" + name + "', ghostClass='" + ghostClass + "', danger='" + danger +
                   "', abilities='" + abilities + "', captureDate='" + captureDate + "'}";
        }
    
    }


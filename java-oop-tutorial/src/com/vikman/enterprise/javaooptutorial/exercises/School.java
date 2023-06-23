package com.vikman.enterprise.javaooptutorial.exercises;

public class School {
    private int zipCode;
    private class TeachingRoom{
        private String roomName;

        public TeachingRoom(String roomName) {
            this.roomName = roomName;
        }

        public String getRoomName() {
            return roomName;
        }

        public void setRoomName(String roomName) {
            this.roomName = roomName;
        }
        private void printZipCode(){
            System.out.println("Zip code: "+ zipCode);
        }
    }
}

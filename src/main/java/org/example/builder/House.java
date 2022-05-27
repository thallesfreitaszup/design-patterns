package org.example.builder;

public class House {
    public House(int rooms, boolean kitchen, int restroom, boolean painted) {
        this.rooms = rooms;
        this.kitchen = kitchen;
        this.restroom = restroom;
        this.painted = painted;
    }

    private int rooms;

    private boolean kitchen;

    private int restroom;
    private boolean painted;


    public boolean isPainted() {
        return painted;
    }

    public void setPainted(boolean painted) {
        this.painted = painted;
    }
    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public boolean isKitchen() {
        return kitchen;
    }

    public void setKitchen(boolean kitchen) {
        this.kitchen = kitchen;
    }

    public int getRestroom() {
        return restroom;
    }

    public void setRestroom(int restroom) {
        this.restroom = restroom;
    }

    public static class HouseBuilder {
        private int rooms;

        private boolean kitchen;

        private int restroom;
        private boolean painted;

        public HouseBuilder setRooms(int rooms) {
            this.rooms = rooms;
            return this;
        }

        public HouseBuilder setKitchen(boolean kitchen) {
            this.kitchen = kitchen;
            return this;
        }

        public HouseBuilder setRestroom(int restroom) {
            this.restroom = restroom;
            return this;
        }

        public HouseBuilder setPainted(boolean painted) {
            this.painted = painted;
            return this;
        }

        public House build() {
            return new House(this.rooms, this.kitchen, this.restroom, this.painted);
        }
    }
}

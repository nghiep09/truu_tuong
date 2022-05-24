package QL_Khach_Tro;

public class Hotell   {
     private String kindofRoom;
     private double roomRates;
     private int soPhong;
    public Hotell(){

    }

    public Hotell(String kindofRoom, double roomRates, int soPhong) {
        this.kindofRoom = kindofRoom;
        this.roomRates = roomRates;
        this.soPhong = soPhong;
    }

    public String getKindofRoom() {
        return kindofRoom;
    }

    public void setKindofRoom(String kindofRoom) {
        this.kindofRoom = kindofRoom;
    }

    public double getRoomRates() {
        return roomRates;
    }

    public void setRoomRates(double roomRates) {
        this.roomRates = roomRates;
    }

    public int getSoPhong() {
        return soPhong;
    }

    public void setSoPhong(int soPhong) {
        this.soPhong = soPhong;
    }

    @Override
    public String toString() {
        return "Hotell{" +
                "kindofRoom='" + kindofRoom + '\'' +
                ", roomRates=" + roomRates +
                ", soPhong=" + soPhong +
                '}';
    }
}


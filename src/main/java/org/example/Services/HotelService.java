package org.example.Services;

import org.example.Entity.Booking;
import org.example.Entity.Guest;
import org.example.Entity.Room;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HotelService {
    private List<Room>roomList;
    private List<Booking>bookingList;

    public HotelService() {
        this.roomList = new ArrayList<>();
        this.bookingList = new ArrayList<>();
    }

    public void addBooking(Booking booking){
        bookingList.add(booking);
    }
    public void addRoom(Room room){
        roomList.add(room);
    }

    public boolean checkIn(Guest guest , int roomNumber){
        for(Room room : roomList){
            if(room.getId() == roomNumber && room.isVacancy()==false){
                System.out.println("Room is empty");
                Booking booking = new Booking(guest, room, new Date() , null);
                room.setVacancy(true);
                addBooking(booking);
                return true;
            }
        }
        System.out.println("room is already filled");
        return false;
    }

    public boolean checkOut(int roomNumber){
        for(Booking booking:bookingList){
            if(booking.getRoom().getId()==roomNumber && booking.getRoom().isVacancy()){
                booking.getRoom().setVacancy(false);
                booking = new Booking(booking.getGuest(),booking.getRoom(),booking.getCheckIn(),new Date());

                return true;
            }
        }
        return false;
    }


    public void listRooms(){
        for(Room room:roomList){
            System.out.println("Room number: "+room.getId() +" Does room has guests : "+room.isVacancy());
        }
    }
}

package org.example;

import org.example.Entity.Booking;
import org.example.Entity.Guest;
import org.example.Entity.Room;
import org.example.Services.HotelService;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        HotelService hotelService=new HotelService();
        hotelService.addRoom(new Room(1,false));
        hotelService.addRoom(new Room(2,false));
        hotelService.addRoom(new Room(3,false));
        hotelService.addRoom(new Room(4,false));
        hotelService.addRoom(new Room(5,false));


        Guest guest1 = new Guest("1", "hitansh");
        boolean checkInSuccess = hotelService.checkIn(guest1,1);
        if(checkInSuccess){
            System.out.println("checking success");
        }else{
            System.out.println("checkin not successfull");
        }

        hotelService.listRooms();

        boolean checkoutSuccess = hotelService.checkOut(1);
        if(checkoutSuccess) System.out.println("checkout sucess");
        else System.out.println("checkout not successfull");

        hotelService.listRooms();



    }
}
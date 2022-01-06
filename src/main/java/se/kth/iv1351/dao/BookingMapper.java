package se.kth.iv1351.dao;

import org.apache.ibatis.annotations.Mapper;
import se.kth.iv1351.model.BookingData;

import java.util.List;

@Mapper
public interface BookingMapper {
    List<BookingData> selectAllBookings();
    BookingData selectBooking(Integer bookingid);
    void insertBooking(BookingData booking);
    void deleteBooking(Integer bookingid);
    void updateBooking(BookingData booking);
}

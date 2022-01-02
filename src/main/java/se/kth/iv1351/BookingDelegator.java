package se.kth.iv1351;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import se.kth.iv1351.dao.BookingMapper;
import se.kth.iv1351.model.BookingData;
import se.kth.iv1351.openapi.BookingApiDelegate;
import se.kth.iv1351.openapi.model.Booking;

@AllArgsConstructor
@Service
public class BookingDelegator implements BookingApiDelegate {
    BookingMapper bookingMapper;

    @Override
    public ResponseEntity<Booking> bookingBookingidGet(Integer bookingid) {
        BookingData bookingData = bookingMapper.selectBooking(bookingid);
        Booking booking = new Booking();
        booking.setId(bookingData.getId());
        booking.setStartTime(bookingData.getStartTime());
        booking.setEndTime(bookingData.getEndTime());
        booking.setInstructorId(bookingData.getInstructorId());
        booking.setStudentId(bookingData.getStudentId());
        booking.setLessonId(bookingData.getLessonId());
        return new ResponseEntity<Booking>(booking, HttpStatus.OK);
    }
}

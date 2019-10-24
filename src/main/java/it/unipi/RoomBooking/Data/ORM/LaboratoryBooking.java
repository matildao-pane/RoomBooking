package it.unipi.RoomBooking.Data.ORM;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import it.unipi.RoomBooking.Data.Interface.Booking;

@Entity
@Table(name = "laboratory_booking")
public class LaboratoryBooking implements Booking {
    @Id
    @Column(name = "LABORATORY_ID")
    private long laboratoryId;

    @Id
    @Column(name = "STUDENT_ID")
    private long studentId;

    @Id
    @Column(name = "SCHEDULE")
    private String schedule;

    @ManyToOne
    
    private Student student;


    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public long getId() {
        return this.laboratoryId;
    }

    public long getPersonId() {
        return this.studentId;
    }

    public String getSchedule() {
        return this.schedule;
    }

    public String toString() {
        return "Laboratory id: " + laboratoryId + "Student id: " + studentId + "Schedule: " + schedule;
    }
}
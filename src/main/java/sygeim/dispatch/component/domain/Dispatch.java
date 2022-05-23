package sygeim.dispatch.component.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Dispatch {
    @Id
    private Long id;

    @Column
    private String captainId;

    @Column
    private String contactPhone;

    @Column
    private String shipRegistration;

    @Column
    private String destination;

    @Column
    private String departurePort;

    @Column
    private Date departureTime;

    @Column
    private String tripReason;

    @Column
    private Date arrivalTime;

    @Column
    private Boolean deleted = false;

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCaptainId() {
        return captainId;
    }

    public void setCaptainId(String captainId) {
        this.captainId = captainId;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getShipRegistration() {
        return shipRegistration;
    }

    public void setShipRegistration(String shipRegistration) {
        this.shipRegistration = shipRegistration;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDeparturePort() {
        return departurePort;
    }

    public void setDeparturePort(String departurePort) {
        this.departurePort = departurePort;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public String getTripReason() {
        return tripReason;
    }

    public void setTripReason(String tripReason) {
        this.tripReason = tripReason;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
}

package com.example.demo.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "Reservations")
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Reservation {

   @Id
   @Column(name = "reservation_id")
   private Long reservationId;
   private LocalDate startDate;
   private LocalDate endDate;
   private float totalDays;//TODO: can this be calculated from startDate and EndDate
   private Double price;
   private Customer customer;
   private Vehicle vehicle;

   public Reservation(LocalDate startDate, LocalDate endDate, float totalDays, Double price, Customer customer, Vehicle vehicle) {
      this.startDate = startDate;
      this.endDate = endDate;
      this.totalDays = totalDays;
      this.price = price;
      this.customer = customer;
      this.vehicle = vehicle;
   }
}
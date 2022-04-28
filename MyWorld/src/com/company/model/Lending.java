package com.company.model;

import java.time.LocalDate;

public class Lending {

    public enum Status { OnDate, OutOfDate, Lost }
    private User user;
    private Ejemplar ejemplar;
    private LocalDate lendingDate;
    private LocalDate returnLimitDate;
    private LocalDate returnRealDate;
    private Status status;


}

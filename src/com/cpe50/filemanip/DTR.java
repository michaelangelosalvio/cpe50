package com.cpe50.filemanip;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by msalvio on 17/08/16.
 */
public class DTR {
    private int id;
    private String date;
    private double hoursWorked;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    private String timeIn, timeOut;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTimeIn() {
        return timeIn;

    }

    public void setTimeIn(String timeIn) {
        this.timeIn = timeIn;
    }

    public String getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(String timeOut) {
        this.timeOut = timeOut;
    }

    @Override
    public String toString() {
        return "DTR{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", timeIn='" + timeIn + '\'' +
                ", timeOut='" + timeOut + '\'' +
                '}';
    }

    public double computeHoursWorked() {

        if ( this.timeIn == null && this.timeOut == null ) {
            return 0;
        }

        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");

        try {
            Date date1 = format.parse(this.getTimeIn());
            Date date2 = format.parse(this.getTimeOut());

            double ms  = date2.getTime() - date1.getTime();

            return ms / ( 1000 * 60 * 60 );

        } catch (Exception e){
            e.printStackTrace();
        }

        return 0;

    }
}

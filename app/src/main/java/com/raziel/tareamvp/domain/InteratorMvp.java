package com.raziel.tareamvp.domain;

import android.text.Editable;
import android.util.Log;

import com.raziel.tareamvp.domain.IIteratorMvp;

import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by raziel on 11/03/18.
 */

public class InteratorMvp implements IIteratorMvp {
    @Override
    public String showInf(String name, String lastName, int date){

        Date today;
        today = new Date();

        String y = getYear(today.toString());
        //String d = getYear(date.toString());

        int r = 0;

        try{
            r=Integer.parseInt(y)-date;
        }catch (NumberFormatException nfe){
            Log.i("MainActivity",nfe.toString());
        }


        return "Nombre: "+name+" Apellido: "+lastName+" Edad: "+(r);

    }
    public  String getYear(String d){
        String y = d.substring(d.length()-4);
        return y;
    }
}

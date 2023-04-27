package com.thegiantgames.quack;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import android.graphics.drawable.GradientDrawable;

public class wordAdaptor extends ArrayAdapter<quake_details> {

    String primaryLocation, ofsetLocation , url;
    private static final String LOCATION_SEPARATOR = "of";

    public wordAdaptor(@NonNull Context context, ArrayList<quake_details> details) {
        super(context, 0 , details);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView ;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.layout , parent ,false);

            quake_details currentWord = getItem(position);

            TextView magnitude = (TextView) listItemView.findViewById(R.id.magnitude);
            Double d = currentWord.getMagnitude();
            magnitude.setText(formatMagnitude(d));






           DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
           DateFormat timeFormat = new SimpleDateFormat("h:mm a");
            Date date =new Date(currentWord.getTime());
            String formatDate =  format.format(date);
            String formatTime = timeFormat.format(date);

            TextView time = (TextView) listItemView.findViewById(R.id.time);

            time.setText(formatTime);

            TextView Date = (TextView) listItemView.findViewById(R.id.date);

            Date.setText(formatDate);


            String originalLocation = currentWord.getPlace();
            if(originalLocation.contains(LOCATION_SEPARATOR)){
                String [] parts = originalLocation.split(LOCATION_SEPARATOR);
                ofsetLocation = parts[0] + LOCATION_SEPARATOR ;
                primaryLocation = parts[1] ;
            }else{
                ofsetLocation = getContext().getString(R.string.near_the);
                primaryLocation = originalLocation ;
            }


            TextView ofset = (TextView) listItemView.findViewById(R.id.ofset);
            ofset.setText(ofsetLocation);

            TextView primary = (TextView) listItemView.findViewById(R.id.location);
            primary.setText(primaryLocation);


           GradientDrawable magnitude_circle = (GradientDrawable) magnitude.getBackground();
           int colour = getMagnitudeColor(currentWord.getMagnitude());
           magnitude_circle.setColor(colour);

        }



        return listItemView;
    }

    private String formatMagnitude(double mag){
        DecimalFormat decimalFormat = new DecimalFormat("0.0");
        return decimalFormat.format(mag);
    }

    private int getMagnitudeColor(double magnitude){
        int magnitudeResourceId;
        int magnitudeFloor = (int) Math.floor(magnitude);

        switch (magnitudeFloor) {

            case 0:
            case 1:
                magnitudeResourceId = R.color.magnitude1;
                break;
            case 2:
                magnitudeResourceId = R.color.magnitude2;
                break;
            case 3:
                magnitudeResourceId = R.color.magnitude3;
                break;
            case 4:
                magnitudeResourceId = R.color.magnitude4;
                break;
            case 5:
                magnitudeResourceId = R.color.magnitude5;
                break;
            case 6:
                magnitudeResourceId = R.color.magnitude6;
                break;
            case 7:
                magnitudeResourceId = R.color.magnitude7;
                break;
            case 8:
                magnitudeResourceId = R.color.magnitude8;
                break;
            case 9:
                magnitudeResourceId = R.color.magnitude9;
                break;
            default:
                magnitudeResourceId = R.color.magnitude10;


        }
        return ContextCompat.getColor(getContext() , magnitudeResourceId);



    }

}

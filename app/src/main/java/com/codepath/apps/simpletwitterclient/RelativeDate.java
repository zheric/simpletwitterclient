package com.codepath.apps.simpletwitterclient;

import java.text.ParseException;
import android.text.format.DateUtils;

import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * Created by hang.zhang1 on 12/14/2015.
 */
public class RelativeDate {
    public static String getRelativeDate(String createdAt){
        String relativeDate = new String();
        String timeFormat = "EEE MMM dd HH:mm:ss ZZZZZ yyyy";
        SimpleDateFormat sf = new SimpleDateFormat(timeFormat, Locale.US);
        sf.setLenient(true);

        try {
            long millisec = sf.parse(createdAt).getTime();
            relativeDate = DateUtils.getRelativeTimeSpanString(millisec,
                    System.currentTimeMillis(), DateUtils.SECOND_IN_MILLIS).toString();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return relativeDate;
    }
}

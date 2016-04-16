package com.zeus.multiuseapp.common.demo;

import com.zeus.multiuseapp.models.Notes;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Created by Zeus on 4/11/2016.
 */
public class SampleData {

    public static List<Notes> getSmapleNote() {
        List<Notes> sampleNotes = new ArrayList<Notes>();
        //create some dummy notes

        Notes notes1 = new Notes();
        notes1.setId((long) 1);
        notes1.setTitle("Chatbir Zoo Trip");
        notes1.setContent("Visited Chatbir zoo near Chandigarh. Had lot of funs and selfies");

        Calendar calendar1 = GregorianCalendar.getInstance();
        notes1.setDateCreated(calendar1.getTimeInMillis());
        notes1.setDateModified(calendar1.getTimeInMillis());

        //add note to the list of notes
        sampleNotes.add(notes1);

        return sampleNotes;
    }
}

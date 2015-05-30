package org.iit.workshopscrum.plangarde.model;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Hashtable;
import java.util.Iterator;

/**
 * Created by MohamedChamsEddin on 30/05/2015.
 */
public class CsvGenerator {

    private FileOutputStream csvFile;

    public CsvGenerator(String path) throws FileNotFoundException {
        this.csvFile = new FileOutputStream(path, true);
    }

    public void generatePlanningFile(Planning planning) {
        OutputStreamWriter out = null;
        out = new OutputStreamWriter(this.csvFile);
        PrintWriter pw = new PrintWriter(out);

        Hashtable<Date, Doctor> plan = planning.getPlan();
        Iterator iterator;
        iterator = plan.keySet().iterator();
        while (iterator.hasNext()) {
            Date date = (Date) iterator.next();
            Doctor doctor = plan.get(date);
            pw.write(date + "," + doctor.getName() + "\0");
            pw.flush();
        }
        pw.close();
    }

}

package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class Convertdate {
    static SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
    
    public static Date parse(String stringDate) {
        try {
            return sdf.parse(stringDate);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}

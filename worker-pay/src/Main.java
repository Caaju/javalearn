import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.*;
import entities.enums.Worklevel;

public class Main {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Worker w = new Worker("Alex", Worklevel.valueOf("MID_LEVEL"), 1200.0, new Department("Design"));

        HourContract c1 = new HourContract(sdf.parse("20/08/2018"), 50.0, 20);
        HourContract c2 = new HourContract(sdf.parse("13/06/2018"), 30.0, 18);
        HourContract c3 = new HourContract(sdf.parse("25/08/2018"), 80.0, 10);

        w.addContract(c1);
        w.addContract(c2);
        w.addContract(c3);

        System.out.println("Name: "+w.getName());
        System.out.println("Level: "+ w.getLevel());
        System.out.println("Department: " + w.getDepartment().getName());
        System.out.println("Income for 08/2018: " + w.income(2018, 8));
    }
}
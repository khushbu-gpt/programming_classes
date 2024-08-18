package org.shipsar;

import org.shipsar.beans.Vehicle;
import org.shipsar.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda City");
        System.out.println("THe Vehivle name is " + vehicle.getName());


        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from spring context is : " + veh.getName());

        var helloBro = context.getBean(String.class);
        System.out.println("Vehicle name from spring context is : " + helloBro);

        var numberBro = context.getBean(Integer.class);
        System.out.println("Vehicle name from spring context is : " + numberBro);
    }
}
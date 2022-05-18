public class Ejecutarejemplo1 {

    cliente c = new cliente( 1,2,"Jose","Wolf",29);

    {
        System.out.println(c.toString());
        System.out.println(c.getContadorPersonas());
    }

    empleado e1 =  new empleado(1,  2500, 2, "andres", "ferguson", 29);
    {
        System.out.println(e1.toString());
        System.out.println(e1.getContadorPersonas());
    }

    persona p1 =  new persona(3, "JUAN", "RAMIREZ", 90);
    {

        System.out.println(p1.toString());
        System.out.println(e1.getContadorPersonas());
    }

}

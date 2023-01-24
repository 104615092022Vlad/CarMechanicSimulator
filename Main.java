import java.util.Random;

public class Main {
    public static void main (String[] args) {
        Random r = new Random();
        Car VAZ = new Car();
        System.out.println();
        System.out.println("На станцию приезжает машина " + VAZ.getModel() + " " + VAZ.getColor() + " цвета " + VAZ.getYear() + "-го года выпуска.");

        Mechanic Vlad = new Mechanic();

        CarParts engine = new CarParts("Двигатель");
        CarParts transmission = new CarParts("Трансмиссия");
        CarParts suspension = new CarParts("Подвеска");
        CarParts eSystem = new CarParts("Электросистема");
        CarParts steering = new CarParts("Рулевое управление");
        CarParts body = new CarParts("Кузов");

        CarParts[] arrayParts = new CarParts[6];
        arrayParts[0] = engine;
        arrayParts[1] = transmission;
        arrayParts[2] = suspension;
        arrayParts[3] = eSystem;
        arrayParts[4] = steering;
        arrayParts[5] = body;

        System.out.println();
        System.out.println("Проводится диагностика");
        System.out.println();
        System.out.println(engine.getType() + " " + Vlad.diagnostics(engine));
        System.out.println(transmission.getType() + " " + Vlad.diagnostics(transmission));
        System.out.println(suspension.getType() + " " + Vlad.diagnostics(suspension));
        System.out.println(eSystem.getType() + " " + Vlad.diagnostics(eSystem));
        System.out.println(steering.getType() + " " + Vlad.diagnostics(steering));
        System.out.println(body.getType() + " " + Vlad.diagnostics(body));
        System.out.println();

        boolean[] arrayCondition = new boolean[6];
        arrayCondition[0] = engine.getIsWorking();
        arrayCondition[1] = transmission.getIsWorking();
        arrayCondition[2] = suspension.getIsWorking();
        arrayCondition[3] = eSystem.getIsWorking();
        arrayCondition[4] = steering.getIsWorking();
        arrayCondition[5] = body.getIsWorking();

        for (int k = 0; k < arrayCondition.length - 1; k++) {
            if (arrayCondition[k] == true) {
                VAZ.setIsWorking(true);
            } else {VAZ.setIsWorking(false); break;}
        }

        System.out.println("Машине требуется ремонт? " + !VAZ.getIsWorking());
        System.out.println();

        int counter = 0;
        for (int i = 0; i <= arrayCondition.length-1; i++) {
                        if (arrayCondition[i] == false) {
                Vlad.fix(arrayParts[i]);
                counter = ++counter;
            }
        }

        if (counter == 0) {
            System.out.println("Машина не нуждается в ремонте");
        } else {
            System.out.println();
            for (int j = 0; j < arrayCondition.length - 1; j++) {
                if (arrayCondition[j] == true) {
                    VAZ.setIsWorking(true);
                }
            }
            System.out.println("Машина отремонтирована? " + VAZ.getIsWorking());
            System.out.println("Количество отремонтированных узлов: " + counter);
        }
    }
}


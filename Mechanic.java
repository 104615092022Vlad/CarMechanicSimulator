public class Mechanic {
    public String diagnostics(CarParts cp) {
        cp.getType();
        cp.getIsWorking();
        String condition = "состояние не опеределено";
        if (cp.getType() == "Двигатель" || cp.getType() == "Кузов") {
            if (cp.getIsWorking() == false) {
                condition = "повреждён";
            } else {
                condition = "не повреждён";
            }
        }
        if (cp.getType() == "Трансмиссия" || cp.getType() == "Подвеска" || cp.getType() == "Электросистема") {
            if (cp.getIsWorking() == false) {
                condition = "повреждена";
            } else {
                condition = "не повреждена";
            }
        }
        if (cp.getType() == "Рулевое управление") {
            if (cp.getIsWorking() == false) {
                condition = "повреждено";
            } else {
                condition = "не повреждено";
            }
        }
        return condition;
    }

    public void fix(CarParts cp) {
        if (cp.getIsWorking() == false) {
            cp.setIsWorking(true);
            System.out.println("Механик починил " + cp.getType());
        }
    }
}


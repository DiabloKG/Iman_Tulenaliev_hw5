public class Main {
    public static void main(String[] args) {
        Boss boss1 = new Boss();
        boss1.setDamage(50);
        boss1.setHealth(1000);
        boss1.setTypeArmor("Магическая");
        System.out.println("Урон: " + boss1.getDamage() + " Количество жизней: " + boss1.getHealth() + " Тип защиты: " + boss1.getTypeArmor());

    }
}
public class Main {

    public static void main(String[] args) {
        Magic magic = new Magic(240, 15, "BOOST");
        Medic medic = new Medic(220, 10, "Heal Points", 5);
        Warrior warrior = new Warrior(250, 20, "CRITICAL DAMAGE");
        Hero[] havingSuperAbility = {magic, medic, warrior};
        for (int i = 0; i < havingSuperAbility.length; i++) {
            havingSuperAbility[i].applySuperAbility("s");
            System.out.println(havingSuperAbility[i].info());
            if(havingSuperAbility[i] == medic){
                System.out.println(medic.increaseExperience());
            }
        }
    }
}

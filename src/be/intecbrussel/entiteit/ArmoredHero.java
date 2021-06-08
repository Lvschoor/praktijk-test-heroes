package be.intecbrussel.entiteit;

public class ArmoredHero extends Hero{
    public ArmoredHero() {
    }
    public ArmoredHero(String alias){
        this.alias=alias;
    }
    public ArmoredHero(String alias, int age){
        this.alias=alias;
        this.age=age;

    }

    @Override
    public String toString() {
        return "ArmoredHero{" +
                "age=" + age +
                ", alias='" + alias + '\'' +
                '}';
    }


    @Override
    public void useSuperPower() {
        System.out.println(this.alias + " is now using SUPERPOWER!!");

    }
}

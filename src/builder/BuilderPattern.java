package builder;

import java.lang.module.ModuleDescriptor;

class Resturant{
    private final String maincourse;
    private final String sideDish;
    private final String drink;
    private final boolean takeAway;

    private Resturant(Builder builder) {
        this.maincourse = builder.maincourse;
        this.sideDish = builder.sideDish;
        this.drink = builder.drink;
        this.takeAway = builder.takeAway;
    }

    @Override
    public String toString() {
        return "Resturant{" +
                "maincourse='" + maincourse + '\'' +
                ", sideDish='" + sideDish + '\'' +
                ", drink='" + drink + '\'' +
                ", takeAway=" + takeAway +
                '}';
    }

    public static class Builder {
        private  String maincourse;
        private  String sideDish;
        private  String drink;
        private  boolean takeAway;

        public Builder setMaincourse(String maincourse) {
            this.maincourse = maincourse;
            return this;
        }

        public Builder setSideDish(String sideDish) {
            this.sideDish = sideDish;
            return this;
        }

        public Builder setDrink(String drink) {
            this.drink = drink;
            return this;
        }

        public Builder setTakeAway(boolean takeAway) {
            this.takeAway = takeAway;
            return this;
        }

        public Resturant builder(){
            return new Resturant(this);
        }
    }
}

public class BuilderPattern {

    public static void main(String[] args) {
        Resturant res = new Resturant.Builder()
                .setDrink("coke")
                .setMaincourse("biriyani")
                .setSideDish("kabab")
                .setTakeAway(false)
                .builder();
        System.out.println(res);

    }




}

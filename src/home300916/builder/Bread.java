package home300916.builder;

public class Bread {

    private final int egg;
    private final int flour;
    private final int water;

    private int salt;
    private String additive;


    public static class Baker{
        private final int egg;
        private final int flour;
        private final int water;

        private int salt;
        private String additive;

        public Baker(int egg, int flour, int water) {
            this.egg = egg;
            this.flour = flour;
            this.water = water;
        }

        public Baker salt(int val){
            this.salt = val;
            return this;
        }

        public Baker additive(String val){
            this.additive = val;
            return this;
        }

        public Bread build(){
            return new Bread(this);
        }
    }

    public Bread(Baker baker) {
        this.egg = baker.egg;
        this.flour = baker.flour;
        this.water = baker.water;
        this.additive = baker.additive;
        this.salt = baker.salt;
    }

    public void getInfo(){
        System.out.println(
                "\nСостав хлеба:\n"+
                "Яиц: " + egg + "\n" +
                "Муки: " + flour + "\n" +
                "Воды: " + water + "\n" +
                "Добавки: " + (additive != null ? additive : "нет") + "\n" +
                "Соль: " + (salt != 0 ? salt : "нет")
        );
    }

}

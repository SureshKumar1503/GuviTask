package com.guvi.task_10_1;

public class TeaExample_Q6 {
    private String name;

    public TeaExample_Q6(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void steep() {
        System.out.println("Steeping " + name);
    }

    public void prepareTea() {
        System.out.println("Preparing generic tea: " + name);
    }

    public static void main(String[] args) {
        TeaExample_Q6 blackTea = new BlackTea("English Breakfast");
        TeaExample_Q6 greenTea = new GreenTea("Sencha");
        TeaExample_Q6 herbalTea = new HerbalTea("Chamomile", "Chamomile");

        blackTea.prepareTea();
        greenTea.prepareTea();
        herbalTea.prepareTea();
    }
}

class BlackTea extends TeaExample_Q6 {
    public BlackTea(String name) {
        super(name);
    }

    @Override
    public void prepareTea() {
        System.out.println("Preparing Black Tea: " + getName());
        System.out.println("Ingredients: Black tea leaves, hot water");
        System.out.println("Brewing time: 3 minutes");
    }
}

class GreenTea extends TeaExample_Q6 {
    public GreenTea(String name) {
        super(name);
    }

    @Override
    public void prepareTea() {
        System.out.println("Preparing Green Tea: " + getName());
        System.out.println("Ingredients: Green tea leaves, hot water");
        System.out.println("Brewing time: 2 minutes");
    }
}

class HerbalTea extends TeaExample_Q6 {
    private String herbalIngredient;

    public HerbalTea(String name, String herbalIngredient) {
        super(name);
        this.herbalIngredient = herbalIngredient;
    }

    @Override
    public void prepareTea() {
        System.out.println("Preparing Herbal Tea: " + getName());
        System.out.println("Ingredients: " + herbalIngredient + " leaves, hot water");
        System.out.println("Brewing time: 5 minutes");
    }
}
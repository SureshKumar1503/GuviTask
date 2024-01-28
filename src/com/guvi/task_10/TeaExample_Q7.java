package com.guvi.task_10;

 class Tea {
	    private String name;

	    public Tea(String name) {
	        this.name = name;
	    }

	    public String getName() {
	        return name;
	    }

	    public void steep() {
	        System.out.println("Steeping " + name);
	    }

		public void prepareTea() {
			// TODO Auto-generated method stub
			
		}
	}


	class HerbalTea extends Tea {
	    private String herbalIngredient;

	    public HerbalTea(String name, String herbalIngredient) {
	        super(name);
	        this.herbalIngredient = herbalIngredient;
	    }

	    public String getHerbalIngredient() {
	        return herbalIngredient;
	    }

	    @Override
	    public void steep() {
	        System.out.println("Steeping " + getName() + " with herbal ingredient: " + herbalIngredient);
	    }
	}

	public class TeaExample_Q7 {
	    public static void main(String[] args) {

	        Tea[] teas = new Tea[3];
	        teas[0] = new Tea("Black Tea");
	        teas[1] = new HerbalTea("Chamomile Tea", "Chamomile");
	        teas[2] = new HerbalTea("Peppermint Tea", "Peppermint");

	        for (Tea tea : teas) {
	            tea.steep();
	        }
	    }
	}


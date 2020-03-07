package Chapter4;

public class Dishes {
    private final String name;
    private final int calories;
    private final TYPE type;
	private boolean isVegetrain;
	public Dishes(String name, int calories, TYPE type, boolean isVegetrain) {
		super();
		this.name = name;
		this.calories = calories;
		this.type = type;
		this.isVegetrain = isVegetrain;
	}
	public boolean isVegetrain() {
		return isVegetrain;
	}
	public void setVegetrain(boolean isVegetrain) {
		this.isVegetrain = isVegetrain;
	}
	public String getName() {
		return name;
	}
	public int getCalories() {
		return calories;
	}
	public TYPE getType() {
		return type;
	}
	@Override
	public String toString() {
		return "Dishes [name=" + name + ", calories=" + calories + ", type=" + type + ", isVegetrain=" + isVegetrain
				+ "]";
	}
	
    
    
}


public class WeatherForecast {
	 	private String skies = ""; 
	    private int high = 0;
	    private int low = 0; 
	    

	    public void setSkies(String newSkies){
	        skies = newSkies;
	    }
	    public void setHigh(int newHigh){
	        high = newHigh;
	    }
	    public void setLow(int newLow){
	        low = newLow;
	    }
	    public int getLow(){
	        return low;
	    }
	    public String getSkies(){
	        return skies;
	    }
	    public int getHigh(){
	        return high;
	    }

}
public class Player{
    private String name = "";
    private int score = 0;

    public void setName(newName){
        name = newName;
    }
    public void setScore(newScore){
        score = newScore;
    }
    public String getName(){
        return name;
    }
    public int getScore(){
        return score; 
    }
}
public class ContestResult{
    private String winner = "";
    private String secondPlace = "";
    private String thirdPlace = "";
    
    public void setWinner(String newWinner){
        this.winner = newWinner;
    }
    public void setSecondPlace(String newSecond){
        this.secondPlace = newSecond;
    }
    public void setThirdPlace(String newThird){
        this.thirPlace = newThird;
    }
    public String getWinner(){
        return winner;
    }
    public String getSecondPlace(){
        return secondPlace;
    }
    public String getThirdPlace(){
        return thirdPlace;
    }
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}

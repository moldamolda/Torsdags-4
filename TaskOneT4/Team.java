class Team {
	private String teamName;
	private int teamRank;
	private String playerName;


public Team(String teamName, int teamRank){

	this.teamName = teamName;
	this.teamRank = teamRank;
}


public void setRank(int teamRank){
	this.teamRank = teamRank;
}


public String toString(){

	return "Hold:" + teamName + " Rang: " + teamRank;
}

}



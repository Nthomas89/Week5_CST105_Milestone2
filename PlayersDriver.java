/*
 * Program: Milestone 2 (NFL Player Class)
 * File: PlayersDriver.java
 * Summary: Test the getters and setters of Players CLass and Prints Information
 * Author: Nicholas Thomas
 * Date: December 16, 2017
 * this work is my own  
 */

/*
 * All player statistics gathered from - 
 * Statistics. (2017). Retrieved December 16, 2017, from http://www.nfl.com/stats/player
*/

package NFL_Draft_Project;

public class PlayersDriver {
	public static void main(String[] args) {
		//Call the test driver
		playerDriver();
		
		System.out.println();
		

	}
	
	//test driver for Player class
	public static <Player> void playerDriver(){
		
		//Create a player by accepting all of the parameters
		Players larryFitzgerald = new Players("Larry Fitzgerald", "Wide Receiver", "Arizona Cardinals", 75, 218, 34,
				14, "Pittsburgh");
		
		//print to show the info for the player
		System.out.println(larryFitzgerald.toString());
	}
}

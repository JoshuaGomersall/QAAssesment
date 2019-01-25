package QAAssesment.qa.com;

import java.awt.font.NumericShaper.Range;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.List;

public class TextAdventure {
	public static int north = 4;
	public static int east;
	public static int west;
	public static int south;

	public static String input;

	public static boolean playing = true;
	public static boolean gameover = false;

	public static int playerhp = 50;
	private static Scanner quit;
	private static Scanner s;

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Grey foggy clouds float oppressively close to you,");
		System.out.println("reflected in the murky grey water which reaches up your shins.");
		System.out.println("Some black plants barely poke out of the shallow water.");
		System.out.println("You notice a small watch-like device in your left hand.");
		System.out.println("It has hands like a watch, but the hands don't seem to tell time.");
		MainMenu();
	}

	public static void MainMenu() throws InterruptedException {
		int nextevent = 5 + (int) (10 * (Math.random()));
		int nextevent2 = 5 + (int) (10 * (Math.random()));
		int nextevent3 = 5 + (int) (10 * (Math.random()));
		int nextevent4 = 5 + (int) (10 * (Math.random()));
		int nextevent5 = 5 + (int) (10 * (Math.random()));
		int nextevent6 = 5 + (int) (10 * (Math.random()));

		while (playing) {
			System.out.println("");
			System.out.println("You Can Go ");
			System.out.println("North");
			System.out.println("South");
			System.out.println("East");
			System.out.println("Or West");

			s = new Scanner(System.in);
			input = s.nextLine();

			if (input.toLowerCase().equals("north") || input.toLowerCase().equals("n")) {
				north += 1;
				south -= 1;
				if ((nextevent - north) < (nextevent5 - (north + east / 2))) {
					System.out.println("If You Keep Going This Way You Are " + (nextevent - north)
							+ " Steps From The Next Things");
				} else if ((nextevent - north) > (nextevent5 - (north + west / 2))) {
					System.out.println(
							"The Device Seems To Be Pointing North But Off To One Side Maybe Its North East Or North West");
					System.out.println("If You Keep North West You Are " + (nextevent5 - (north + west / 2))
							+ " Steps From The Next Things");
				} else if ((nextevent - north) > (nextevent5 - (north + east / 2))) {
					System.out.println(
							"The Device Seems To Be Pointing North But Off To One Side Maybe Its North East Or North West");
					System.out.println("If You Keep North East You Are " + (nextevent5 - (north + east / 2))
							+ " Steps From The Next Things");
				} else {
					System.out.println("If You Keep Going This Way You Are " + (nextevent - north)
							+ " Steps From The Next Things");
				}
			}

			else if (input.toLowerCase().equals("east") || input.toLowerCase().equals("e")) {
				east += 1;
				west -= 1;
				if ((nextevent2 - east) > (nextevent5 - (north + east / 2))) {
					System.out.println(
							"The Device Seems To Be Pointing North But Off To One Side Maybe Its North East Or North West");
					System.out.println("If You Keep North West You Are " + (nextevent5 - (north + east / 2))
							+ " Steps From The Next Things");
				} else if ((nextevent2 - east) > (nextevent6 - (south + east / 2))) {
					System.out.println(
							"The Device Seems To Be Pointing South But Off To One Side Maybe Its South East Or South West");
					System.out.println("If You Keep South East You Are " + (nextevent6 - (south + east / 2))
							+ " Steps From The Next Things");
				} else {
					System.out.println("If You Keep Going This Way You Are " + (nextevent2 - east)
							+ " Steps From The Next Things");
				}
			}

			else if (input.toLowerCase().equals("west") || input.toLowerCase().equals("w")) {
				east -= 1;
				west += 1;
				if ((nextevent3 - west) > (nextevent5 - (north + west / 2))) {
					System.out.println(
							"The Device Seems To Be Pointing North But Off To One Side Maybe Its North East Or North West");
					System.out.println("If You Keep North West You Are " + (nextevent5 - (north + west / 2))
							+ " Steps From The Next Things");
				} else if ((nextevent3 - west) > (nextevent6 - (south + west / 2))) {
					System.out.println(
							"The Device Seems To Be Pointing South But Off To One Side Maybe Its South East Or South West");
					System.out.println("If You Keep South West You Are " + (nextevent6 - (south + west / 2))
							+ " Steps From The Next Things");
				} else {
					System.out.println("If You Keep Going This Way You Are " + (nextevent3 - west)
							+ " Steps From The Next Things");
				}
			}

			else if (input.toLowerCase().equals("south") || input.toLowerCase().equals("s")) {
				north -= 1;
				south += 1;
				if ((nextevent4 - south) < (nextevent6 - (south + east / 2))) {
					System.out.println("If You Keep Going This Way You Are " + (nextevent4 - south)
							+ " Steps From The Next Things");
				} else if ((nextevent4 - south) > (nextevent6 - (south + west / 2))) {
					System.out.println(
							"The Device Seems To Be Pointing South But Off To One Side Maybe Its South East Or South West");
					System.out.println("If You Keep South West You Are " + (nextevent6 - (south + west / 2))
							+ " Steps From The Next Things");
				} else if ((nextevent4 - south) > (nextevent6 - (south + east / 2))) {
					System.out.println(
							"The Device Seems To Be Pointing South But Off To One Side Maybe Its South East Or South West");
					System.out.println("If You Keep South East You Are " + (nextevent6 - (south + east / 2))
							+ " Steps From The Next Things");
				} else {
					System.out.println("If You Keep Going This Way You Are " + (nextevent - south)
							+ " Steps From The Next Things");
				}
			} else {
				System.out.println("I Cant Do That Right Now");
			}

			if (nextevent - north == 0 || nextevent2 - east == 0 || nextevent3 - west == 0 || nextevent4 - south == 0) {
				Encounter();
			}
			else if ((north + east / 2) - nextevent5 == 0 || nextevent5 - (north + west / 2) == 0) 
			{
				Encounter();
			} else if (nextevent6 - (south + east / 2) == 0 || nextevent6 - (south + west / 2) == 0) 
			{
				Encounter();
			}
		}
	}

	public static void Encounter() throws InterruptedException {

		north = 1;
		east = 1;
		west = 1;
		south = 1;

		boolean Encounter = true;
		int r = 1 + (int) (5 * (Math.random()));
		int freindpoints = 0;
		int enemyhp = 10;

		List<String> encounters = Arrays.asList("Dog ", "Wizard", "Lizard", "Slime", "Magical Chest");
		
		if (r > 4 )
		{
			r = 4;
			System.out.println("You Found A " + encounters.get(r));
			System.out.println("YOU WIN !");
			GameOver();
		}
		
		
		
		System.out.println("You Found A " + encounters.get(r));

		while (Encounter && r !=4) {
			int ai = 1 + (int) (10 * (Math.random()));
			int playerdamage = (int) (10 * (Math.random()));

			if (freindpoints >= 10) {
				Encounter = false;
				MainMenu();
				freindpoints = 0;
			} else if (playerhp <= 0) {
				Encounter = false;
				GameOver();
			} else if (enemyhp <= 0) {
				System.out.println("They Are Killed");
				Encounter = false;
				enemyhp = 10;
				MainMenu();
			}

			else if (ai < 10 - freindpoints) {
				int damage = (int) (5 * (Math.random()));
				System.out.println("They Attack You And Deal " + damage + " Points Of Damage");
				playerhp = playerhp - damage;
				System.out.println("You Have " + playerhp + " Health Left");
			} else {
				System.out.println("They Look At You Very Confused");
			}

			System.out.println("How Would You Like To Respond");
			System.out.println("You Could Attack It, Try Magic Or Maybe Try And Make Friends");
			Scanner s = new Scanner(System.in);
			input = s.nextLine();

			if (input.toLowerCase().contains("attack") || input.toLowerCase().contains("hit")
					|| input.toLowerCase().contains("slap")) {
				System.out.println("YOU ATTACK!");
				enemyhp = enemyhp - playerdamage;
				System.out.println("They Have" + enemyhp + " Health Left");
				freindpoints -= 3;
			} else if (input.toLowerCase().contains("magic")) {
				System.out.println("YOU CAST MAGIC");
				enemyhp = enemyhp - playerdamage;
				System.out.println("They Have" + enemyhp + " Health Left");
				freindpoints -= 3;
			} else if (input.toLowerCase().contains("charm") || input.toLowerCase().contains("chat")
					|| input.toLowerCase().contains("friend")) {
				System.out.println("You Try And Make Freinds");
				freindpoints += 3;
				if (freindpoints > 9) {
					System.out.println("You Two Are The Best Of Buds :) , It Lets You Go On Your Way");
				} else if (freindpoints > 6) {
					System.out.println("I Think They Like You");
				} else if (freindpoints > 4) {
					System.out.println("I Think They Are Starting To Like You");
				} else if (freindpoints <= 2) {
					System.out.println("Well Its A Start");
				}
			} else if (input.toLowerCase().contains("run")) {
				int runaway = (int) (10 * (Math.random()));
				if (runaway > 4) {
					System.out.println("You Run Away");
					Encounter = false;
				} else if (runaway <= 4) {
					System.out.println("You Try And Run Away ,But Get Stuck In The Swamp");
				}
			} else {
				System.out.println("I Can't Do That");
			}
		}
	}

	public static void GameOver() throws InterruptedException {
		gameover = true;
		playing = false;
		while (gameover) 
		{
			System.out.println("Would You Like To Play Again");
			quit = new Scanner(System.in);
			String inputquit = quit.nextLine();
			
			if (inputquit.toLowerCase().equals("yes")) 
			{
				playing = true;
				MainMenu();
			} 
			else 
			{
				playing = false;
				gameover = false;
				System.out.println("Thanks For Playing");
			}
		}
	}

}
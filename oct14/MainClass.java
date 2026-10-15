package practice.oct14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) {

		HashMap<String, ArrayList<Player>> teamName = new HashMap<String, ArrayList<Player>>();
		ArrayList<Player> MiPlayers = new ArrayList<>();

		MiPlayers.add(new Player(1, "Rohit", "Bowler", 100, 2, 4));
		MiPlayers.add(new Player(2, "Shubhaman", "Batsman", 200, 2, 3));
		MiPlayers.add(new Player(3, "Hardik", "Bowler", 100, 2, 4));
		MiPlayers.add(new Player(1, "Rohit Sharma", "Batsman", 100, 2, 4));
		MiPlayers.add(new Player(2, "Suryakumar Yadav", "Batsman", 200, 2, 3));
		MiPlayers.add(new Player(3, "Hardik Pandya", "All-Rounder", 150, 2, 4));
		MiPlayers.add(new Player(4, "Jasprit Bumrah", "Bowler", 100, 2, 4));
		MiPlayers.add(new Player(5, "Tilak Varma", "Batsman", 2000, 2, 3));
		MiPlayers.add(new Player(6, "Trent Boult", "Bowler", 100, 2, 4));

		ArrayList<Player> RcbPlayers = new ArrayList<>();

		RcbPlayers.add(new Player(1, "Virat Kohli", "Batsman", 200, 2, 4));
		RcbPlayers.add(new Player(2, "Rajat Patidar", "Batsman", 200, 2, 3));
		RcbPlayers.add(new Player(3, "Phil Salt", "Wicketkeeper", 200, 2, 3));
		RcbPlayers.add(new Player(4, "Jitesh Sharma", "Wicketkeeper", 200, 5, 4));
		RcbPlayers.add(new Player(5, "Krunal Pandya", "All-Rounder", 150, 2, 4));
		RcbPlayers.add(new Player(6, "Bhuvneshwar Kumar", "Bowler", 100, 2, 4));
		RcbPlayers.add(new Player(7, "Josh Hazlewood", "Bowler", 100, 2, 3));
		RcbPlayers.add(new Player(8, "Yash Dayal", "Bowler", 100, 2, 4));

		ArrayList<Player> CskPlayers = new ArrayList<>();

		CskPlayers.add(new Player(1, "MS Dhoni", "Wicketkeeper", 400, 2, 4));
		CskPlayers.add(new Player(2, "Ruturaj Gaikwad", "Batsman", 200, 2, 3));
		CskPlayers.add(new Player(3, "Shivam Dube", "Batsman", 200, 2, 4));
		CskPlayers.add(new Player(4, "Ravindra Jadeja", "All-Rounder", 150, 2, 4));
		CskPlayers.add(new Player(5, "Matheesha Pathirana", "Bowler", 100, 2, 3));
		CskPlayers.add(new Player(6, "Deepak Hooda", "All-Rounder", 1500, 1, 4));
		CskPlayers.add(new Player(7, "Devon Conway", "Wicketkeeper", 200, 2, 3));
		CskPlayers.add(new Player(8, "Khaleel Ahmed", "Bowler", 100, 2, 4));

		teamName.put("MI", MiPlayers);
		teamName.put("RCB", RcbPlayers);
		teamName.put("CSK", CskPlayers);

		System.out.println(teamName);
		System.out.println("After  :");
		System.out.println("\n3. Total Teams: " + teamName.size());
		System.out.println("\n5. Players in Each Team:");
		for (String tn : teamName.keySet()) {
			System.out.println(tn + " = " + teamName.get(tn).size());
		}
		Set<String> teamNameKey = teamName.keySet();
		for (String tn : teamNameKey) {
			System.out.println("\n" + tn + "--->");
			ArrayList<Player> listplayers = teamName.get(tn);
			for (Player t : listplayers) {
				if (t.getCategory().contentEquals("Batsman")) {
					System.out.println(t);
				}
			}
			System.out.println("_______________________________________");
			for (Player b : listplayers) {
				if (b.getCategory().contentEquals("Bowler")) {
					System.out.println(b);
				}
			}
			System.out.println("**************************************");
			for (Player a : listplayers) {
				if (a.getCategory().contentEquals("All-Rounder")) {
					System.out.println(a);
				}
			}
			System.out.println("+++++++++++++++++++++++++++++++++++++");
		}
		int maxWicketScore = 0;
		Player maxWicketScoreplayer = new Player(); 
		int maxCatchScore = 0;
		Player maxCatchScoreplayer = new Player(); 
		int maxScore = 0;
		Player maxScoreplayer = new Player();
		Collection<ArrayList<Player>> allPlayers = teamName.values();

		int totalPlayers = 0;
		for (ArrayList<Player> t : teamName.values()) {
			totalPlayers += t.size();
		}
		System.out.println("\n4. Total Players: " + totalPlayers);
		for (ArrayList<Player> t : allPlayers) {

			for (Player p : t) {
				if (p.getId() == 1) {
					System.out.println(p);
				}
				if (p.getRuns() > maxScore) {
					maxScore = p.getRuns();
					maxScoreplayer = p;
				} if(p.getWickets()>maxWicketScore) {
					maxWicketScore=p.getWickets();
					maxWicketScoreplayer=p;
				}
				if(p.getCatches()>maxCatchScore) {
					maxCatchScore=p.getCatches();
					maxCatchScoreplayer=p;
				}
				if(p.getRuns()>50) {
					System.out.println("Player whose runs greater than 50: " +p);				}
				if(p.getCatches()>5) {
					System.out.println("Player whose catch greater than 50: "+p);
				}
				if(p.getWickets()>5) {
					System.out.println("Player whose Weckets greater than 50: "+p);
				}
				if(p.getId()==2) {
					System.out.println("Player whose id is 2: " +p);				}
				if(p.getCatches()==2 && p.getRuns()==50) {
					System.out.println("Player whose Run greater than 50 & catch are=2 : "+p);
				}
				if(p.getName()=="Shivam Dube"&& p.getId()==3) {
					System.out.println("Player whose id==3 && name is Shivam Dube: "+p);
				}
				if(p.getCatches()==0) {
					System.out.println("Player whose Run Score is 0 : "+p);
				}
				if(p.getWickets()>0 && p.getWickets()<3) {
					System.out.println("Player whose Wicket score>0 and <3: "+p);
				}
				int secmaxScore=0;
				if (p.getRuns() > maxScore) {
					secmaxScore=maxScore;
					maxScore = p.getRuns();
					maxScoreplayer = p;
					
				}System.out.println("\n Second Highest Run Scorer Details:"+p+"seccond max Score is: "+ secmaxScore);
				int secmaxWicketScore=0;
				if(p.getWickets()>maxWicketScore) {
					secmaxWicketScore=maxWicketScore;
					maxWicketScore=p.getWickets();
					maxWicketScoreplayer=p;
				}System.out.println("\n Second Highest wicket Scorer Details:"+p+"seccond max Wicket Score is: "+ secmaxWicketScore);
				int secmaxCatchScore=0;
				if(p.getCatches()>maxCatchScore) {
					secmaxCatchScore=maxCatchScore;
					maxCatchScore=p.getCatches();
					maxCatchScoreplayer=p;
				}
				System.out.println("\n Second Highest Catch Scorer Details:"+p+"seccond max Catch Score is: "+ secmaxCatchScore);
			}
		}
		
		System.out.println("\nHighest Run Scorer Details:");
		System.out.println(maxScoreplayer);
		System.out.println("Highest Runs: " + maxScore);

		System.out.println("\nHighest Wicket Scorer Details:");
		System.out.println(maxWicketScoreplayer);
		System.out.println("Highest Wicket: " + maxWicketScore);

		System.out.println("\nHighest Catch Scorer Details:");
		System.out.println(maxCatchScoreplayer);
		System.out.println("Highest Catch: " + maxCatchScore);

		System.out.println("\n10. Search Rohit Sharma in MI:");
		for (Player p : teamName.get("MI")) {
			if (p.getName().equalsIgnoreCase("Rohit Sharma")) {
				System.out.println(p);
			}
		}
		System.out.println("\n19. Batsmen Count in Each Team:");
		for (String tn : teamName.keySet()) {
			int batsmanCount = 0;
			for (Player p : teamName.get(tn)) {
				if (p.getCategory().equals("Batsman")) {
					batsmanCount++;
				}
			}
			System.out.println(tn + " = " + batsmanCount);
		}

		
		System.out.println("\n20. Bowlers Count in Each Team:");
		for (String tn : teamName.keySet()) {
			int bowlerCount = 0;
			for (Player p : teamName.get(tn)) {
				if (p.getCategory().equals("Bowler")) {
					bowlerCount++;
				}
			}
			System.out.println(tn + " = " + bowlerCount);
		}
	}
}

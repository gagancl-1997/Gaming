package warships.Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WarShipBattle {

	public static Scanner sc = new Scanner(System.in);

	public static List<String> player1;
	public static List<String> player2;
	static String player1_Name;
	static String player2_Name;

	public void players_Battle_Plan(String player_Name) {
		boolean flag = true;
		int no_Of_Ships = 3;
		WarShips ws = new WarShips();
		System.out.println();
		ws.layout();
		System.out.println("Enter " + player_Name + " Ships placing as shown in the above Battle Ground");

		while (flag) {
			System.out.println("Choose places for " + no_Of_Ships + " Ship");
			boolean temp = true;
			while (temp) {
				if (no_Of_Ships == 0) {
					flag = false;
				} else if(player_Name == player1_Name) {
						System.out.println(
								"\nEnter 1 to select 2 seater ship: \nEnter 2 to select 3 seater ship: \nEnter 3 to select 4 seater ship: \nEnter 4 to Exit:\n");
						switch (sc.next()) {
						case "1":
							System.out.println("Enter 2 seats : ");
							player1.add(sc.next());
							player1.add(sc.next());
							break;

						case "2":
							System.out.println("Enter 3 seats : ");
							player1.add(sc.next());
							player1.add(sc.next());
							player1.add(sc.next());
							break;

						case "3":
							System.out.println("Enter 4 seats : ");
							player1.add(sc.next());
							player1.add(sc.next());
							player1.add(sc.next());
							player1.add(sc.next());
							break;

						case "4":
							temp = false;
							flag = false;
							break;

						default:
							System.out.println("Enter correct Ship number ");
							break;
						}
				}else {
						System.out.println(
								"\nEnter 1 to select 2 seater ship: \nEnter 2 to select 3 seater ship: \nEnter 3 to select 4 seater ship: \nEnter 4 to Exit:\n");
						switch (sc.next()) {
						case "1":
							System.out.println("Enter 2 seats : ");
							player2.add(sc.next());
							player2.add(sc.next());
							break;

						case "2":
							System.out.println("Enter 3 seats : ");
							player2.add(sc.next());
							player2.add(sc.next());
							player2.add(sc.next());
							break;

						case "3":
							System.out.println("Enter 4 seats : ");
							player2.add(sc.next());
							player2.add(sc.next());
							player2.add(sc.next());
							player2.add(sc.next());
							break;

						case "4":
							temp = false;
							flag = false;
							break;

						default:
							System.out.println("Enter correct Ship number ");
							break;
						}
				}
			}
			no_Of_Ships--;
		}
		System.out.println(player_Name + "'s Ships are in Place");
	}

	public static void main(String[] args) {

		player1 = new ArrayList<String>();
		player2 = new ArrayList<String>();

		System.out.println("_________Welcome to War Ships_________");

		System.out.print("Enter Player1 Name: ");
		player1_Name = sc.next().toUpperCase();

		System.out.print("Enter Player2 Name: ");
		player2_Name = sc.next().toUpperCase();

		WarShipBattle ws = new WarShipBattle();

		ws.players_Battle_Plan(player1_Name);
//		System.out.println(player1);

		ws.players_Battle_Plan(player2_Name);
//		System.out.println(player2);

		ws.players_Battle_Plan(player1, player2);
		
		System.out.println("________Thanks For Playing War Ships________");

	}

	private void players_Battle_Plan(List<String> player1, List<String> player2) {
		battle_rounds();
		if (player1.size() <= 3) {
			System.out.println(player1_Name+ " Remaining ships: "+ player1+ "\n" + player2_Name+ " Remaining ships"+ player2);
			System.out.println(player2_Name +" Won");
		} else if (player2.size() <= 3) {
			System.out.println(player1_Name+ " Remaining ships: "+ player1+ "\n" + player2_Name+ " Remaining ships"+ player2);
			System.out.println(player1_Name +" Won");
		} else {
			System.out.println("It's a Tie");
		}
	}

	private void battle_rounds() {
		boolean rounds = true;
		boolean launch = true;
		while (launch) {
			if ((player1.size() > 3) && (player2.size() > 3)) {
//				System.out.println(player1_Name+"---------> "+ player1 );
//				System.out.println(player2_Name+"---------> "+ player2 );
				if (rounds) {
					System.out.println("\n"+player1_Name + " To Launch your Missile, Enter your Launch code: ");
					String player1_missile = sc.next();
					if (player2.contains(player1_missile)) {
						System.out.println(player2_Name+" Got HIT");
						player2.remove(player1_missile);
					} else {
						System.out.println(player1_missile + " Missile Miss");
					}
					rounds = false;
				} else {
					System.out.println("\n"+player2_Name + " To Launch your Missile, Enter your Launch code: ");
					String player2_missile = sc.next();
					if (player1.contains(player2_missile)) {
						System.out.println(player1_Name+" Got HIT");
						player1.remove(player2_missile);
					} else {
						System.out.println(player2_missile + " Missile Miss");
					}
					rounds = true;
				}
			} else {
				launch = false;
			}
		}
	}

}

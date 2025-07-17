package warships.Game;

public class WarShips {

	public static void main(String[] args) {
		WarShips ws = new WarShips();
		ws.layout();
	}

	public void layout() {
		String[][] arr1 = new String[8][8];
		String row = "_ABCDEFG";
		int[] col = { 0, 1, 2, 3, 4, 5, 6, 7 };

		battleShipLayout(arr1, row, col);
	}

	private static void battleShipLayout(String[][] arr1, String row, int[] col) {
		for (int i = 0; i < arr1.length; i++) {
			if (i != 0) {
				for (int j = 0; j < arr1.length;) {
					arr1[i][j] = row.charAt(i) + "  ";
					break;
				}
			} else {
				for (int j = 0; j < arr1.length; j++) {
					if (j != 0) {
						arr1[i][j] = col[j] + "   ";
					}
				}
			}
		}

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
//				if(arr1[i][j] == null) {
//					arr1[i][j].replace(null, "-");
//				}
				System.out.print(arr1[i][j] + "  ");
			}
			System.out.println();
		}

	}

}

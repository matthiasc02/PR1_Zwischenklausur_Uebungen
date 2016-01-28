package Uebungsabend;

public class FourWins {

	private int sizeX;
	private int sizeY;
	private char[][] array;

	public FourWins(int sizeX, int sizeY) {

		array = new char[sizeX][sizeY];
		this.sizeX = sizeX;
		this.sizeY = sizeY;

		for (int x = 0; x < sizeX; x++) {

			for (int y = 0; y < sizeY; y++) {
				array[x][y] = ' ';
			}

		}
	}

	public boolean playerA(int x, int y) {
		if (this.array[x][y] == ' ') {
			this.array[x][y] = 'A';
			return true;
		} else {
			return false;
		}
	}

	public boolean playerB(int x, int y) {
		if (this.array[x][y] == ' ') {
			this.array[x][y] = 'B';
			return true;
		} else {
			return false;
		}
	}

	private char fourInRow() {
		int countera = 0;
		int counterb = 0;

		for (int y = 0; y < sizeY; y++) {

			for (int x = 0; x < sizeX; x++) {
				countera = 0;
				counterb = 0;

				if (this.array[x][y] == 'A') {
					countera++;
					counterb = 0;
					if (countera >= 4)
						return 'A';
				}
				if (this.array[x][y] == 'B') {
					counterb++;
					countera = 0;
					if (counterb >= 4)
						return 'B';
				}
				if (this.array[x][y] == ' ') {
					countera = 0;
					counterb = 0;
				}
			}

		}
		return ' ';
	}

	private char fourInColumn() {
		int countera = 0;
		int counterb = 0;

		for (int x = 0; x < sizeX; x++) {

			for (int y = 0; y < sizeY; y++) {
				countera = 0;
				counterb = 0;

				if (this.array[x][y] == 'A') {
					countera++;
					counterb = 0;
					if (countera >= 4)
						return 'A';
				}
				if (this.array[x][y] == 'B') {
					counterb++;
					countera = 0;
					if (counterb >= 4)
						return 'B';
				}
				if (this.array[x][y] == ' ') {
					countera = 0;
					counterb = 0;
				}
			}

		}
		return ' ';
	}

	public char winner() {
		if (fourInRow() != ' ')
			return fourInRow();
		else
			return fourInColumn();
	}

}

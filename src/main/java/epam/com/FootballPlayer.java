package epam.com;

/**Example of My immutable object*/

public final class FootballPlayer {

    private final int playerNumber;
    private final int[] goalsInPreviousSeasons;
    private final String name;
    private final String surname;
    private final String country;
    private final Club currentClub;
    private final Club[] previousClubs;



    private void checkNumber(int playerNumber){
        if (playerNumber < 0 || playerNumber > 99){
            throw new IllegalArgumentException();
        }
    }

    public FootballPlayer(int playerNumber, int[] goalsInPreviousSeasons, String name, String surname, String country, Club currentClub, Club[] previousClubs) {
        checkNumber(playerNumber);
        this.playerNumber = playerNumber;
        this.goalsInPreviousSeasons = goalsInPreviousSeasons;
        this.name = name;
        this.surname = surname;
        this.country = country;
        this.currentClub = new Club(currentClub.getName(),currentClub.getFoundationYear(),currentClub.getTitlesWon(),currentClub.getStadiumName());

        this.previousClubs = new Club[previousClubs.length];
        for (int i = 0;i<previousClubs.length;i++){
            this.previousClubs[i] = new Club(previousClubs[i].getName(),previousClubs[i].getFoundationYear(),previousClubs[i].getTitlesWon(),previousClubs[i].getStadiumName());
        }

    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public int[] getGoalsInPreviousSeasons() {
        return goalsInPreviousSeasons;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCountry() {
        return country;
    }

    public Club getCurrentClub() {
        return currentClub;
    }

    public Club[] getPreviousClubs() {
        return previousClubs;
    }
}

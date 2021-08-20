package epam.com;

import java.util.Arrays;

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
        this.currentClub = currentClub;
        this.previousClubs = previousClubs;

    }


    public int getPlayerNumber() {
        return playerNumber;
    }

    public int[] getGoalsInPreviousSeasons() {
        return deepCopyGoalsInPreviousSeasons(goalsInPreviousSeasons);
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
        return new Club(currentClub.getName(),currentClub.getFoundationYear(),currentClub.getTitlesWon(),currentClub.getStadiumName());
    }

    public Club[] getPreviousClubs() {
        return deepCopyPreviousClubs(previousClubs);
    }


    private Club[] deepCopyPreviousClubs(Club[] previousClubs) {
        Club[] deepCopyOfPreviousClubs = new Club[previousClubs.length];
        for (int i = 0; i< previousClubs.length; i++){
            deepCopyOfPreviousClubs[i] = new Club(previousClubs[i].getName(), previousClubs[i].getFoundationYear(), previousClubs[i].getTitlesWon(), previousClubs[i].getStadiumName());
        }
        return deepCopyOfPreviousClubs;
    }

    private int[] deepCopyGoalsInPreviousSeasons(int[] goalsInPreviousSeasons){
        int[] deepCopyOfGoalsInPreviousSeasons = new int[goalsInPreviousSeasons.length];
        for (int i = 0;i<goalsInPreviousSeasons.length;i++){
            deepCopyOfGoalsInPreviousSeasons[i] = goalsInPreviousSeasons[i];
        }
        return deepCopyOfGoalsInPreviousSeasons;
    }

    @Override
    public String toString() {
        return "FootballPlayer{" +
                "playerNumber=" + playerNumber +
                ", goalsInPreviousSeasons=" + Arrays.toString(goalsInPreviousSeasons) +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", country='" + country + '\'' +
                ", currentClub=" + currentClub +
                ", previousClubs=" + Arrays.toString(previousClubs) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FootballPlayer that = (FootballPlayer) o;

        if (playerNumber != that.playerNumber) return false;
        if (!Arrays.equals(goalsInPreviousSeasons, that.goalsInPreviousSeasons)) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (surname != null ? !surname.equals(that.surname) : that.surname != null) return false;
        if (country != null ? !country.equals(that.country) : that.country != null) return false;
        if (currentClub != null ? !currentClub.equals(that.currentClub) : that.currentClub != null) return false;
        return Arrays.equals(previousClubs, that.previousClubs);
    }


    @Override
    public int hashCode() {
        int result = playerNumber;
        result = 31 * result + Arrays.hashCode(goalsInPreviousSeasons);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (currentClub != null ? currentClub.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(previousClubs);
        return result;
    }




}

package epam.com;

/**Example of mutable object*/

public class Club  {

    private String name;
    private int foundationYear;
    private int titlesWon;
    private String stadiumName;


    public Club(String name, int foundationYear, int titlesWon, String stadiumName) {
        this.name = name;
        this.foundationYear = foundationYear;
        this.titlesWon = titlesWon;
        this.stadiumName = stadiumName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFoundationYear() {
        return foundationYear;
    }

    public void setFoundationYear(int foundationYear) {
        this.foundationYear = foundationYear;
    }

    public int getTitlesWon() {
        return titlesWon;
    }

    public void setTitlesWon(int titlesWon) {
        this.titlesWon = titlesWon;
    }

    public String getStadiumName() {
        return stadiumName;
    }

    public void setStadiumName(String stadiumName) {
        this.stadiumName = stadiumName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Club club = (Club) o;

        if (foundationYear != club.foundationYear) return false;
        if (titlesWon != club.titlesWon) return false;
        if (name != null ? !name.equals(club.name) : club.name != null) return false;
        return stadiumName != null ? stadiumName.equals(club.stadiumName) : club.stadiumName == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + foundationYear;
        result = 31 * result + titlesWon;
        result = 31 * result + (stadiumName != null ? stadiumName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Club{" +
                "name='" + name + '\'' +
                ", foundationYear=" + foundationYear +
                ", titlesWon=" + titlesWon +
                ", stadiumName='" + stadiumName + '\'' +
                '}';
    }

}

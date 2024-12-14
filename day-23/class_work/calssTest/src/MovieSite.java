class Movie {
    public String title;
    public String genre;

    public Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String setTitle(String title) {
        return this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public String setGenre(String genre) {
        return this.genre = genre;
    }

    public void displaydetails() {
        System.out.println("Movie title: " + title);
        System.out.println("Genre: " + genre);
    }
}

public class MovieSite {
    public static void main(String[] args) {
        Movie mv1 = new Movie("Intersteller", "Sci-fi");
        mv1.displaydetails();

        Movie mv2 = new Movie(null, null);
        mv2.setTitle("inception");
        mv2.setGenre("Drama");
        mv2.displaydetails();
    }
}

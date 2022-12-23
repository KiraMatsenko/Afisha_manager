package ru.netology.manager.afisha_manager.filmitem;

public class FilmItem {
    private String filmName;
    private String[] films = new String[0];


    public FilmItem() {
    }

    public FilmItem(String filmName) {
        this.filmName = filmName;
    }

    public String[] getFilms() {
        return films;
    }

    public String getFilmName() {
        return filmName;
    }
    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }
}

package ru.netology.manager.afisha_manager.filmitem;

public class FilmItem {
    private String filmName;
    private int filmId;

    public FilmItem(String filmName, int filmId) { //allArgs конструктор чтобы задавать параметры
        this.filmName = filmName;
        this.filmId = filmId;
    }

    public String getFilmName() { //геттер на поле

        return filmName;
    }

    public void setFilmName(String filmName) { //сеттер на поле
        this.filmName = filmName;
    }

    public int getFilmId() { //геттер на поле
        return filmId;
    }

    public void setFilmId(int filmId) { //сеттер на поле
        this.filmId = filmId;
    }
}

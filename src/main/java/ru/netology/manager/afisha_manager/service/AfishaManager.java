package ru.netology.manager.afisha_manager.service;

public class AfishaManager {
    private String[] films = new String[0];
    private int limit;

        public AfishaManager() {
            this.limit = 10;
    }

    public AfishaManager(int limit) {
            this.limit = limit;
    }
    public String[] addFilm(String newFilm) {
            String[] tmp = new String[films.length + 1];
            for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
            tmp[tmp.length - 1] = newFilm;
            films = tmp;
            return films;
    }

    //
    public String[] findAll() {
            return films;
    }

    public String[] findLast() {
            if (limit > films.length) {
                limit = films.length;
            }
            String[] reversed = new String[limit];
            for (int i = 0; i < reversed.length; i++) {
            reversed[i] = films[films.length - 1 - i];
        }
            return reversed;
    }
}


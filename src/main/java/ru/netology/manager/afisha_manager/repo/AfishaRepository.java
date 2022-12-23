package ru.netology.manager.afisha_manager.repo;

import ru.netology.manager.afisha_manager.filmitem.FilmItem;
import ru.netology.manager.afisha_manager.service.AfishaManager;

public class AfishaRepository {
    private AfishaRepository item = new AfishaRepository();
    private AfishaManager[] films = new AfishaManager[0];

    public AfishaRepository() {
    }
    public AfishaRepository(String filmName) {
        this.item = filmName;
    }
//    public String[] save(String newFilm) {
//        String[] tmp = new String[films.length + 1];
//        for (int i = 0; i < films.length; i++) {
//            tmp[i] = films[i];
//            tmp[i] = films[i];
//        }
//        tmp[tmp.length - 1] = newFilm;
//        films = tmp;
//        return films;
//    }
//
    public  AfishaManager[] getFilms() {
        return films;
    }
//
//    public String findById() {
//        String findId = item.getFilmName();
//        for (int i = 0; i < films.length;) {
//            if (films[i].equals(findId)) {
//             return findId;
//            }
//            else {
//                i++;
//                if (i == films.length) {
//                    return null;
//                }
//            }
//        }
//        return findId;
//    }
//
//    public void removeById() {
//        String[] tmp = new String[films.length - 1];
//        String removalId = item.getFilmName();
//        int copyToIndex = 0;
//        for (String film : films) {
//            if(!film.equals(removalId)) {
//                tmp[copyToIndex] = film;
//                copyToIndex++;
//            }
//        }
//        films = tmp;
//    }

    public AfishaManager[] removeAll() {
        AfishaManager[] zero = new AfishaManager[0];
        this.films = zero;
        return zero;
    }

    public FilmItem getItem() {
        return item;
    }
}

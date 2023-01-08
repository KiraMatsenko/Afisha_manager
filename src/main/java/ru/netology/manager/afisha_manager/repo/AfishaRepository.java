package ru.netology.manager.afisha_manager.repo;

import ru.netology.manager.afisha_manager.filmitem.FilmItem;

public class AfishaRepository {
    private FilmItem[] films = new FilmItem[0]; //поле создаёт массив типа FIlmItems

    public void save(FilmItem newFilm) {
        FilmItem[] tmp = new FilmItem[films.length + 1]; //временный массив
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];  //копирует элементы
        }
        tmp[tmp.length - 1] = newFilm; //вставляет новый
        films = tmp; //присвоение временного массива в поле
    }

    public FilmItem[] findById(int filmId) {  //Id приходит параметром
        FilmItem[] tmp = new FilmItem[1];    //временный массив для искомого элемента
        for (int i = 0; i < films.length; ) {
            if (films[i].equals(filmId)) {  //если содержимое ячейки == filmID копирует содержимое
                tmp[i] = films[i];
                this.films = tmp;
                return films;
            } else {
                i++;
                if (i == films.length + 1) {  //когда прошли по всему массиву
                    tmp[i] = null;            //в ячейку запишется null
                    this.films = tmp;
                }
            }
        }
        return films;
    }

    public void removeById(int filmId) {
        FilmItem[] tmp = new FilmItem[films.length - 1];
        int copyToIndex = 0;
        for (FilmItem film : films) {
            if (!film.equals(filmId)) {
                tmp[copyToIndex] = film;
                copyToIndex++;
            }
        }
        films = tmp;
    }

    public FilmItem[] removeAll() {
        FilmItem[] zero = new FilmItem[0];  // создаём нулевой массив
        this.films = zero;                  //отдаём его вместо нашего
        return films;
    }

    public FilmItem[] getFilms() {
        return films;
    }
}

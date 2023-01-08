package ru.netology.manager.afisha_manager.service;

import ru.netology.manager.afisha_manager.filmitem.FilmItem;
import ru.netology.manager.afisha_manager.repo.AfishaRepository;

public class AfishaManager {
    private AfishaRepository repo; //инициализируем репо
    private FilmItem[] films = new FilmItem[0]; //создаём поле с массивом, чтобы было где хранить результаты

    public AfishaManager(AfishaRepository repo) {
        this.repo = repo; //просто отдаём репо в мэнеджер, не трогай
    }

    public void save(FilmItem film) { //даём параметром элемент вида filmName, filmID
        repo.save(film);
    }

    public FilmItem[] findAll() {
        FilmItem[] all = repo.getFilms();  //работает через геттер в репо
        return all;
    }

    public FilmItem[] findById(int filmId) { //отдаём в параметр filmID
        this.films = repo.getFilms();         //получаем существующий массив из репо
        FilmItem[] tmp = new FilmItem[1];     //создаём массив на искомый элемент
        for (int i = 0; i < films.length; i++) {
            if (i == filmId) {               // id=Index, когда находим нужный, то
                tmp[i] = films[i];           //копируем содержимое
                this.films = tmp;            //присваеваем в поле результат
            }
        }
        return films;
    }

    public FilmItem[] removeById(int filmId) {      //полная логика удаления элемента массива
        this.films = repo.getFilms();
        FilmItem[] tmp = new FilmItem[films.length - 1];
        int copyToIndex = 0;
        for (FilmItem film : films) {
            if (!film.equals(filmId)) {
                tmp[copyToIndex] = film;
                copyToIndex++;
            }
        }
        films = tmp;
        return films;
    }

    public FilmItem[] removeAll() { //удаление всего из репо
        repo.removeAll();
        return new FilmItem[0];
    }
}


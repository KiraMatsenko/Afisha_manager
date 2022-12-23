package ru.netology.manager.afisha_manager.service;

import ru.netology.manager.afisha_manager.filmitem.FilmItem;
import ru.netology.manager.afisha_manager.repo.AfishaRepository;

public class AfishaManager {
    private AfishaRepository repo;

    public AfishaManager(AfishaRepository repo) {
        this.repo = repo;
    }

//    public void save(FilmItem filmName) {
//        repo.save(String.valueOf(filmName));
//    }
//
//    public String[] findAll() {
//        String[] all = repo.getFilms();
//
//        return all;
//    }
//
//    public void findById() {
//
//        repo.findById();
//    }
//
//    public void removeById() {
//        repo.removeById();
//    }

    public AfishaManager[] removeAll() {
        repo.removeAll();
        return new AfishaManager[0];
    }

}


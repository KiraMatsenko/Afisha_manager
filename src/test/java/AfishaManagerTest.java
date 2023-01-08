import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.netology.manager.afisha_manager.filmitem.FilmItem;
import ru.netology.manager.afisha_manager.repo.AfishaRepository;
import ru.netology.manager.afisha_manager.service.AfishaManager;

import static org.mockito.Mockito.*;

public class AfishaManagerTest {

    AfishaRepository repo = Mockito.mock(AfishaRepository.class);
    AfishaManager manager = new AfishaManager(repo);

    FilmItem film1 = new FilmItem("Бладшот", 0);
    FilmItem film2 = new FilmItem("Вперёд", 1);
    FilmItem film3 = new FilmItem("Отель Белград", 2);

    @Test
    public void shouldSaveNewFilm() {
        FilmItem[] films = {film1, film2, film3};
        doReturn(films).when(repo).getFilms();

        FilmItem[] expected = {film1, film2, film3};
        FilmItem[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void managerShouldRemoveAll() {
        FilmItem[] films = {};
        doReturn(films).when(repo).removeAll();

        FilmItem[] expected = {};
        FilmItem[] actual = manager.removeAll();

        Assertions.assertArrayEquals(expected, actual);
    }
}


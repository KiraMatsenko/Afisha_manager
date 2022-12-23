
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

    AfishaRepository filmName1 = new AfishaRepository("Бладшот");
    AfishaRepository filmName2 = new AfishaRepository("Вперёд");
    FilmItem filmName3 = new FilmItem("Отель Белград");

    @Test
    public void managerShouldRemoveAll() {
        AfishaManager[]  films = {};
        doReturn(films).when(repo).removeAll();

        AfishaManager[] expected = new AfishaManager[0];
        AfishaManager[] actual = manager.removeAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void managerShouldFindAll() {
        AfishaManager[]  films = {filmName1, filmName2, filmName3};
        doReturn(films).when(repo).getFilms();
    }

//    @Test
//    public void managerShouldSave() {}
//
//    @Test
//    public void managerShouldRemoveById() {}
//
//    @Test
//    public void managerShouldFindById() {}

    //выше этой точки тесты для мокито

//    @Test
//    public void shoulReturnFilm() {
//        String filmname1 = "Бладшот";
//        String filmname2 = "Вперёд";
//        String filmname3 = "Отель Белград";
//
//        AfishaRepository service = new AfishaRepository("Отель Белград");
//        service.save(filmname1);
//        service.save(filmname2);
//        service.save(filmname3);
//
//        String expected = "Отель Белград";
//        String actual = service.findById();
//        Assertions.assertEquals(expected, actual);
//
//    }

//    @Test
//    public void shoulAddNewFilms() {
//        String filmname1 = "Бладшот";
//        String filmname2 = "Вперёд";
//        String filmname3 = "Отель Белград";
//        String filmname4 = "Джентльмены";
//        String filmname5 = "Человек-невидимка";
//        String filmname6 = "Тролли. Мировой тур";
//        String filmname7 = "Номер один";
//
//        AfishaManager service = new AfishaManager();
//        service.save(filmname1);
//        service.save(filmname2);
//        service.save(filmname3);
//        service.save(filmname4);
//        service.save(filmname5);
//        service.save(filmname6);
//        service.save(filmname7);
//
//        String[] expected = {"Бладшот",
//        "Вперёд",
//        "Отель Белград",
//        "Джентльмены",
//        "Человек-невидимка",
//        "Тролли. Мировой тур",
//        "Номер один"};
//        String[] actual = manager.findAll();
//
//        Assertions.assertArrayEquals(expected, actual);
//    }
//
////    @Test
//    public void shouldShowLastTenReversed() {
//        String filmname1 = "Бладшот";
//        String filmname2 = "Вперёд";
//        String filmname3 = "Отель Белград";
//        String filmname4 = "Джентльмены";
//        String filmname5 = "Человек-невидимка";
//        String filmname6 = "Тролли. Мировой тур";
//        String filmname7 = "Номер один";
//        String filmname8 = "Начало";
//        String filmname9 = "Атака Титанов";
//        String filmname10 = "Симпсоны в кино";
//
//        AfishaManager service = new AfishaManager();
//        service.save(filmname1);
//        service.save(filmname2);
//        service.save(filmname3);
//        service.save(filmname4);
//        service.save(filmname5);
//        service.save(filmname6);
//        service.save(filmname7);
//        service.save(filmname8);
//        service.save(filmname9);
//        service.save(filmname10);
//
//        String[] expected = {
//                "Симпсоны в кино",
//                "Атака Титанов",
//                "Начало",
//                "Номер один",
//                "Тролли. Мировой тур",
//                "Человек-невидимка",
//                "Джентльмены",
//                "Отель Белград",
//                "Вперёд",
//                "Бладшот"
//        };
//        String[] actual = service.findLast();
//
//        Assertions.assertArrayEquals(expected, actual);
//    }
//
//    @Test
//    public void shouldShowLastCustomReversed() {
//        String filmname1 = "Бладшот";
//        String filmname2 = "Вперёд";
//        String filmname3 = "Отель Белград";
//        String filmname4 = "Джентльмены";
//        String filmname5 = "Человек-невидимка";
//        String filmname6 = "Тролли. Мировой тур";
//        String filmname7 = "Номер один";
//
//        AfishaManager service = new AfishaManager(7);
//        service.save(filmname1);
//        service.save(filmname2);
//        service.save(filmname3);
//        service.save(filmname4);
//        service.save(filmname5);
//        service.save(filmname6);
//        service.save(filmname7);
//
//        String[] expected = {
//                "Номер один",
//                "Тролли. Мировой тур",
//                "Человек-невидимка",
//                "Джентльмены",
//                "Отель Белград",
//                "Вперёд",
//                "Бладшот"
//                };
//        String[] actual = service.findLast();
//
//        Assertions.assertArrayEquals(expected, actual);
//    }
}


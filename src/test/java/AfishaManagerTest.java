
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.manager.afisha_manager.service.AfishaManager;

public class AfishaManagerTest {

    @Test
    public void shoulAddNewFilms() {
        String filmname1 = "Бладшот";
        String filmname2 = "Вперёд";
        String filmname3 = "Отель Белград";
        String filmname4 = "Джентльмены";
        String filmname5 = "Человек-невидимка";
        String filmname6 = "Тролли. Мировой тур";
        String filmname7 = "Номер один";

        AfishaManager service = new AfishaManager();
        service.addFilm(filmname1);
        service.addFilm(filmname2);
        service.addFilm(filmname3);
        service.addFilm(filmname4);
        service.addFilm(filmname5);
        service.addFilm(filmname6);
        service.addFilm(filmname7);

        String[] expected = {"Бладшот",
                "Вперёд",
                "Отель Белград",
                "Джентльмены",
                "Человек-невидимка",
                "Тролли. Мировой тур",
                "Номер один"};
        String[] actual = service.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowExactlyLimit() {
        String filmname1 = "Бладшот";
        String filmname2 = "Вперёд";
        String filmname3 = "Отель Белград";
        String filmname4 = "Джентльмены";
        String filmname5 = "Человек-невидимка";
        String filmname6 = "Тролли. Мировой тур";
        String filmname7 = "Номер один";
        String filmname8 = "Начало";
        String filmname9 = "Атака Титанов";
        String filmname10 = "Симпсоны в кино";

        AfishaManager service = new AfishaManager();
        service.addFilm(filmname1);
        service.addFilm(filmname2);
        service.addFilm(filmname3);
        service.addFilm(filmname4);
        service.addFilm(filmname5);
        service.addFilm(filmname6);
        service.addFilm(filmname7);
        service.addFilm(filmname8);
        service.addFilm(filmname9);
        service.addFilm(filmname10);

        String[] expected = {
                "Симпсоны в кино",
                "Атака Титанов",
                "Начало",
                "Номер один",
                "Тролли. Мировой тур",
                "Человек-невидимка",
                "Джентльмены",
                "Отель Белград",
                "Вперёд",
                "Бладшот"
        };
        String[] actual = service.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastCustomReversed() {
        String filmname1 = "Бладшот";
        String filmname2 = "Вперёд";
        String filmname3 = "Отель Белград";
        String filmname4 = "Джентльмены";
        String filmname5 = "Человек-невидимка";
        String filmname6 = "Тролли. Мировой тур";
        String filmname7 = "Номер один";

        AfishaManager service = new AfishaManager(7);
        service.addFilm(filmname1);
        service.addFilm(filmname2);
        service.addFilm(filmname3);
        service.addFilm(filmname4);
        service.addFilm(filmname5);
        service.addFilm(filmname6);
        service.addFilm(filmname7);

        String[] expected = {
                "Номер один",
                "Тролли. Мировой тур",
                "Человек-невидимка",
                "Джентльмены",
                "Отель Белград",
                "Вперёд",
                "Бладшот"
        };
        String[] actual = service.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLimitUnderAdded() {
        String filmname1 = "Бладшот";
        String filmname2 = "Вперёд";
        String filmname3 = "Отель Белград";
        String filmname4 = "Джентльмены";
        String filmname5 = "Человек-невидимка";
        String filmname6 = "Тролли. Мировой тур";
        String filmname7 = "Номер один";
        String filmname8 = "Начало";
        String filmname9 = "Атака Титанов";
        String filmname10 = "Симпсоны в кино";

        AfishaManager service = new AfishaManager(5);
        service.addFilm(filmname1);
        service.addFilm(filmname2);
        service.addFilm(filmname3);
        service.addFilm(filmname4);
        service.addFilm(filmname5);
        service.addFilm(filmname6);
        service.addFilm(filmname7);
        service.addFilm(filmname8);
        service.addFilm(filmname9);
        service.addFilm(filmname10);

        String[] expected = {
                "Симпсоны в кино",
                "Атака Титанов",
                "Начало",
                "Номер один",
                "Тролли. Мировой тур"
        };
        String[] actual = service.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLimitAboveAdded() {
        String filmname1 = "Бладшот";
        String filmname2 = "Вперёд";
        String filmname3 = "Отель Белград";
        String filmname4 = "Джентльмены";
        String filmname5 = "Человек-невидимка";

        AfishaManager service = new AfishaManager(10);
        service.addFilm(filmname1);
        service.addFilm(filmname2);
        service.addFilm(filmname3);
        service.addFilm(filmname4);
        service.addFilm(filmname5);

        String[] expected = {
                "Человек-невидимка",
                "Джентльмены",
                "Отель Белград",
                "Вперёд",
                "Бладшот"
        };
        String[] actual = service.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}

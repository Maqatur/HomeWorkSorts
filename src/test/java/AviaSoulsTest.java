import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

public class AviaSoulsTest {

    @Test
    public void compareToTest() {

        Ticket ticket1 = new Ticket("Moscow", "Samara", 2500, 18, 20);
        Ticket ticket2 = new Ticket("Samara", "N.Novgorod", 2200, 21, 22);
        Ticket ticket3 = new Ticket("N.Novgorod", "Saratov", 2350, 10, 11);
        Ticket ticket4 = new Ticket("Saratov", "St-Petersburg", 3445, 14, 17);
        Ticket ticket5 = new Ticket("St-Petersburg", "Moscow", 3800, 17, 19);


        Ticket[] tickets = {ticket1, ticket2, ticket3, ticket4, ticket5};
        Arrays.sort(tickets);


        Ticket[] expected = {ticket2, ticket3, ticket1, ticket4, ticket5};
        Ticket[] actual = tickets;

        Assertions.assertArrayEquals(expected, actual);

    }


    @Test
    public void sortForSearchTest1() {
        Ticket ticket1 = new Ticket("Moscow", "Samara", 2500, 18, 20);
        Ticket ticket2 = new Ticket("Samara", "N.Novgorod", 2200, 21, 22);
        Ticket ticket3 = new Ticket("N.Novgorod", "Saratov", 2350, 10, 11);
        Ticket ticket4 = new Ticket("Saratov", "St-Petersburg", 3445, 14, 17);
        Ticket ticket5 = new Ticket("St-Petersburg", "Moscow", 3800, 17, 19);
        Ticket ticket6 = new Ticket("Moscow", "Samara", 2650, 1, 3);
        Ticket ticket7 = new Ticket("Moscow", "Samara", 2550, 9, 11);

        AviaSouls aviaSouls = new AviaSouls();
        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        aviaSouls.add(ticket6);
        aviaSouls.add(ticket7);

        Ticket[] expected = {ticket1, ticket7, ticket6};
        Ticket[] actual = aviaSouls.search("Moscow", "Samara");

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void sortForSearchTest2() {
        Ticket ticket1 = new Ticket("Moscow", "Samara", 2500, 18, 20);
        Ticket ticket2 = new Ticket("Samara", "N.Novgorod", 2200, 21, 22);
        Ticket ticket3 = new Ticket("N.Novgorod", "Saratov", 2350, 10, 11);
        Ticket ticket4 = new Ticket("Saratov", "St-Petersburg", 3445, 14, 17);
        Ticket ticket5 = new Ticket("St-Petersburg", "Moscow", 3800, 17, 19);
        Ticket ticket6 = new Ticket("Moscow", "Samara", 2650, 1, 3);
        Ticket ticket7 = new Ticket("Moscow", "Samara", 2550, 9, 11);

        AviaSouls aviaSouls = new AviaSouls();
        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        aviaSouls.add(ticket6);
        aviaSouls.add(ticket7);

        Ticket[] expected = {ticket4};
        Ticket[] actual = aviaSouls.search("Saratov", "St-Petersburg");

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void sortForSearchTest3() {
        Ticket ticket1 = new Ticket("Moscow", "Samara", 2500, 18, 20);
        Ticket ticket2 = new Ticket("Samara", "N.Novgorod", 2200, 21, 22);
        Ticket ticket3 = new Ticket("N.Novgorod", "Saratov", 2350, 10, 11);
        Ticket ticket4 = new Ticket("Saratov", "St-Petersburg", 3445, 14, 17);
        Ticket ticket5 = new Ticket("St-Petersburg", "Moscow", 3800, 17, 19);
        Ticket ticket6 = new Ticket("Moscow", "Samara", 2650, 1, 3);
        Ticket ticket7 = new Ticket("Moscow", "Samara", 2550, 9, 11);

        AviaSouls aviaSouls = new AviaSouls();
        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        aviaSouls.add(ticket6);
        aviaSouls.add(ticket7);

        Ticket[] expected = {};
        Ticket[] actual = aviaSouls.search("N.Novgorod", "St-Petersburg");

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ticketTimeComparatorTest() {
        Ticket ticket1 = new Ticket("Moscow", "Samara", 2500, 18, 20);
        Ticket ticket2 = new Ticket("Samara", "N.Novgorod", 2200, 21, 22);
        Ticket ticket3 = new Ticket("N.Novgorod", "Saratov", 2350, 10, 11);
        Ticket ticket4 = new Ticket("Saratov", "St-Petersburg", 3445, 14, 17);
        Ticket ticket5 = new Ticket("St-Petersburg", "Moscow", 3800, 17, 19);
        Ticket ticket6 = new Ticket("Moscow", "Samara", 2650, 1, 3);
        Ticket ticket7 = new Ticket("Moscow", "Samara", 2550, 9, 11);

        TicketTimeComparator timeComparator = new TicketTimeComparator();
        Ticket[] tickets = {ticket1, ticket2, ticket3, ticket4, ticket5, ticket6, ticket7};
        Arrays.sort(tickets, timeComparator);

        Ticket[] expected = {ticket2, ticket3, ticket1, ticket5, ticket6, ticket7, ticket4};
        Ticket[] actual = tickets;

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void searchAndSortByTest1() {
        Ticket ticket1 = new Ticket("Moscow", "Omsk", 6500, 18, 23);
        Ticket ticket2 = new Ticket("Samara", "N.Novgorod", 2200, 21, 22);
        Ticket ticket3 = new Ticket("N.Novgorod", "Saratov", 2350, 10, 11);
        Ticket ticket4 = new Ticket("Saratov", "St-Petersburg", 3445, 14, 17);
        Ticket ticket5 = new Ticket("St-Petersburg", "Moscow", 3800, 17, 19);
        Ticket ticket6 = new Ticket("Moscow", "Omsk", 7650, 1, 5);
        Ticket ticket7 = new Ticket("Moscow", "Omsk", 6550, 9, 12);

        AviaSouls aviaSouls = new AviaSouls();
        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        aviaSouls.add(ticket6);
        aviaSouls.add(ticket7);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] expected = {ticket7, ticket6, ticket1};
        Ticket[] actual = aviaSouls.searchAndSortBy("Moscow", "Omsk", comparator);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchAndSortByTest2() {
        Ticket ticket1 = new Ticket("Moscow", "Omsk", 6500, 18, 23);
        Ticket ticket2 = new Ticket("Samara", "N.Novgorod", 2200, 21, 22);
        Ticket ticket3 = new Ticket("N.Novgorod", "Saratov", 2350, 10, 11);
        Ticket ticket4 = new Ticket("Saratov", "St-Petersburg", 3445, 14, 17);
        Ticket ticket5 = new Ticket("St-Petersburg", "Moscow", 3800, 17, 19);
        Ticket ticket6 = new Ticket("Moscow", "Omsk", 7650, 1, 5);
        Ticket ticket7 = new Ticket("Moscow", "Omsk", 6550, 9, 12);

        AviaSouls aviaSouls = new AviaSouls();
        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        aviaSouls.add(ticket6);
        aviaSouls.add(ticket7);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] expected = {ticket5};
        Ticket[] actual = aviaSouls.searchAndSortBy("St-Petersburg", "Moscow", comparator);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchAndSortByTest3() {
        Ticket ticket1 = new Ticket("Moscow", "Omsk", 6500, 18, 23);
        Ticket ticket2 = new Ticket("Samara", "N.Novgorod", 2200, 21, 22);
        Ticket ticket3 = new Ticket("N.Novgorod", "Saratov", 2350, 10, 11);
        Ticket ticket4 = new Ticket("Saratov", "St-Petersburg", 3445, 14, 17);
        Ticket ticket5 = new Ticket("St-Petersburg", "Moscow", 3800, 17, 19);
        Ticket ticket6 = new Ticket("Moscow", "Omsk", 7650, 1, 5);
        Ticket ticket7 = new Ticket("Moscow", "Omsk", 6550, 9, 12);

        AviaSouls aviaSouls = new AviaSouls();
        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        aviaSouls.add(ticket6);
        aviaSouls.add(ticket7);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] expected = {};
        Ticket[] actual = aviaSouls.searchAndSortBy("St-Petersburg", "Omsk", comparator);

        Assertions.assertArrayEquals(expected, actual);
    }

}

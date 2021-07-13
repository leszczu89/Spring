package spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("spring.portfolio");
        Board board = (Board) context.getBean("getBoard");

        //When
        board.getToDoList().getTasks().add("To do");
        board.getDoneList().getTasks().add("Done");
        board.getInProgressList().getTasks().add("In Progress");

        //Then
        board.getToDoList().getTasks().forEach(System.out::println);
        board.getDoneList().getTasks().forEach(System.out::println);
        board.getInProgressList().getTasks().forEach(System.out::println);

    }
}

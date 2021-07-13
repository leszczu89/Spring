package spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BoardConfig {


    @Bean
    public Board getBoard() {
        return new Board(addToDoList(), addInProgressList(), addDoneList());
    }

    @Bean
    public TaskList addToDoList() {
        return new TaskList();
    }
    @Bean
    public TaskList addInProgressList() {
        return new TaskList();
    }

    @Bean
    public TaskList addDoneList() {
        return new TaskList();
    }
}

package spring;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.shape.Circle;
import spring.shape.Shape;
import spring.shape.Square;
import spring.shape.Triangle;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class KodillaSpringApplicationTests {

    @Test
    void testCircleLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("spring.shape");
        Shape shape = (Shape) context.getBean("circle");

        //When
        String name = shape.getShapeName();

        //Then
        assertEquals("This is a circle.", name);
    }

    @Test
    void testTriangleLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("spring.shape");
        Shape shape = (Shape) context.getBean("triangle");

        //When
        String name = shape.getShapeName();

        //Then
        assertEquals("This is a triangle.", name);
    }

    @Test
    void testSquareLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("spring.shape");
        Shape shape = (Shape) context.getBean("createSquare");
        //When
        String name = shape.getShapeName();
        //Then
        assertEquals("This is a square.", name);
    }

//    @Test
//    void contextLoads() {
//    }

    @Test
    void testShapeLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("spring.shape");
        Shape shape = (Shape)context.getBean("chosenShape");

        //When
        String name = shape.getShapeName();

        //Then
        System.out.println("Chosen shape says: " + name);
    }

}

package com.thoughtworks.tdd;

import com.thoughtworks.tdd.Dependency;
import com.thoughtworks.tdd.HelloWorld;
import org.junit.jupiter.api.*;
import sun.plugin2.message.GetAppletMessage;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class HelloWorldTest {

    @BeforeAll
    static void initTestEnv() {
    }

    @BeforeEach
    void initEveryMethod() {
    }


    @Test
    @DisplayName("try display name")
    public void hello_world_test() {
        //given
        Dependency dependency = new Dependency();
        HelloWorld helloWorld = new HelloWorld(dependency);

        //when
        String actual = helloWorld.beenCalled();

        //then
        assertThat(actual, is("Leave me alone."));
    }

    @Test
    public void should_be_mocked() {
        //given
        Dependency dependency = mock(Dependency.class);
        when(dependency.say()).thenReturn("Hello World");
        HelloWorld helloWorld = new HelloWorld(dependency);

        //when
        String actual = helloWorld.beenCalled();

        //then
        assertThat(actual, is("Hello World"));
    }

    @Test
    public void should_return_Fizz_when_input_2() {
        Game game = new Game();

        String result = game.fizzBuzz(2);

        Assertions.assertEquals("2", result);

    }


    @Test
    public void should_return_Fizz_when_input_3() {
    Game game = new Game();

    String result = game.fizzBuzz(3);

    Assertions.assertEquals("Fizz", result);

}

    @Test
    public void should_return_Fizz_when_input_5() {
        Game game = new Game();

        String result = game.fizzBuzz(5);

        Assertions.assertEquals("Buzz", result);

    }
    @Test
    public void should_return_Fizz_when_input_7() {
        Game game = new Game();

        String result = game.fizzBuzz(7);

        Assertions.assertEquals("Wizz", result);

    }

    @Test
    public void should_return_Fizz_when_input_21() {
        Game game = new Game();

        String result = game.fizzBuzz(21);

        Assertions.assertEquals("Wizz", result);

    }

    @Test
    public void should_return_Fizz_when_input_15() {
        Game game = new Game();

        String result = game.fizzBuzz(15);

        Assertions.assertEquals("Wizz", result);

    }

    @Test
    public void should_return_Fizz_when_input_35() {
        Game game = new Game();

        String result = game.fizzBuzz(35);

        Assertions.assertEquals("Wizz", result);

    }

    @Test
    public void should_return_Fizz_when_input_105() {
        Game game = new Game();

        String result = game.fizzBuzz(105);

        Assertions.assertEquals("FizzBuzzWizz", result);

    }
}




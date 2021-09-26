package uri.exercises.iniciante;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

@RunWith(MockitoJUnitRunner.class)
public class Exercise1000Test {

    @Test
    public void deveRetornarHelloWorld() throws IOException {
        Exercise1000.main(null);
    }
}

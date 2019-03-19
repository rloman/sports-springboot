package nl.youngcolfield.sports.calc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class BasicCalculatorTest {


    @InjectMocks
    private BasicCalculator basicCalculator; // class under test

    @Mock
    private List<Integer> numberList;


    @Test
    public void testAdd() {

        int result = this.basicCalculator.add(3, 4);

        assertEquals(7, result);
    }

    @Test
    public void testSubtract() {

        int result = this.basicCalculator.subtract(4, 1);

        assertEquals(3, result);
    }

    @Test
    public void testFoo() {

        // Arrange // Given
        Mockito.when(this.numberList.size()).thenReturn(2); // now this is a Stub!!!

        // Act // When
        int result = this.basicCalculator.foo();


        // Assert // Then
        assertEquals(3, result);

        // now this is a Mock ... I am verify the calling of the size method
        Mockito.verify(this.numberList).size();


    }


}

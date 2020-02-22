package app.reading.stoic.stoicreading.AsclepiodotusTactics;

import android.support.test.rule.ActivityTestRule;
import android.view.View;
import android.widget.TextView;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import app.reading.stoic.stoicreading.R;

import static org.junit.Assert.*;

public class AsclepiodotusTactics5Test {

    @Rule
    public ActivityTestRule<AsclepiodotusTactics5> AsclepiodotusTactics5TestRule = new ActivityTestRule<AsclepiodotusTactics5>(AsclepiodotusTactics5.class);

    private AsclepiodotusTactics5 AsclepiodotusTactics5 = null;

    @Before
    public void setUp() throws Exception {
        AsclepiodotusTactics5 = AsclepiodotusTactics5TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = AsclepiodotusTactics5.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "5. The appropriate Size and Character of the Arms";
        String titleActual = AsclepiodotusTactics5.getResources().getString(R.string.AsclepiodotusTacticsTitle5);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = AsclepiodotusTactics5.getResources().getString(R.string.AsclepiodotusTacticsTitle5);
        String titleActual = String.valueOf(AsclepiodotusTactics5.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = AsclepiodotusTactics5.getResources().getString(R.string.AsclepiodotusChapter5);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = AsclepiodotusTactics5.getResources().getString(R.string.AsclepiodotusChapter5);
        TextView actualTextView = (TextView) AsclepiodotusTactics5.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        AsclepiodotusTactics5 = null;
    }
}
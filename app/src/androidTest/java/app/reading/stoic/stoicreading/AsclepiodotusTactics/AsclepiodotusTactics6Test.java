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

public class AsclepiodotusTactics6Test {

    @Rule
    public ActivityTestRule<AsclepiodotusTactics6> AsclepiodotusTactics6TestRule = new ActivityTestRule<AsclepiodotusTactics6>(AsclepiodotusTactics6.class);

    private AsclepiodotusTactics6 AsclepiodotusTactics6 = null;

    @Before
    public void setUp() throws Exception {
        AsclepiodotusTactics6 = AsclepiodotusTactics6TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = AsclepiodotusTactics6.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "6. The Phalanx of the light Infantry and of the Targeteers, and the Disposition and Names of its Subdivisions";
        String titleActual = AsclepiodotusTactics6.getResources().getString(R.string.AsclepiodotusTacticsTitle6);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = AsclepiodotusTactics6.getResources().getString(R.string.AsclepiodotusTacticsTitle6);
        String titleActual = String.valueOf(AsclepiodotusTactics6.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = AsclepiodotusTactics6.getResources().getString(R.string.AsclepiodotusChapter6);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = AsclepiodotusTactics6.getResources().getString(R.string.AsclepiodotusChapter6);
        TextView actualTextView = (TextView) AsclepiodotusTactics6.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        AsclepiodotusTactics6 = null;
    }
}
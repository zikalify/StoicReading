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

public class AsclepiodotusTactics4Test {

    @Rule
    public ActivityTestRule<AsclepiodotusTactics4> AsclepiodotusTactics4TestRule = new ActivityTestRule<AsclepiodotusTactics4>(AsclepiodotusTactics4.class);

    private AsclepiodotusTactics4 AsclepiodotusTactics4 = null;

    @Before
    public void setUp() throws Exception {
        AsclepiodotusTactics4 = AsclepiodotusTactics4TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = AsclepiodotusTactics4.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "4. The Intervals between the Soldiers";
        String titleActual = AsclepiodotusTactics4.getResources().getString(R.string.AsclepiodotusTacticsTitle4);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = AsclepiodotusTactics4.getResources().getString(R.string.AsclepiodotusTacticsTitle4);
        String titleActual = String.valueOf(AsclepiodotusTactics4.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = AsclepiodotusTactics4.getResources().getString(R.string.AsclepiodotusChapter4);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = AsclepiodotusTactics4.getResources().getString(R.string.AsclepiodotusChapter4);
        TextView actualTextView = (TextView) AsclepiodotusTactics4.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        AsclepiodotusTactics4 = null;
    }
}
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

public class AsclepiodotusTactics7Test {

    @Rule
    public ActivityTestRule<AsclepiodotusTactics7> AsclepiodotusTactics7TestRule = new ActivityTestRule<AsclepiodotusTactics7>(AsclepiodotusTactics7.class);

    private AsclepiodotusTactics7 AsclepiodotusTactics7 = null;

    @Before
    public void setUp() throws Exception {
        AsclepiodotusTactics7 = AsclepiodotusTactics7TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = AsclepiodotusTactics7.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "7. The Phalanx of the Cavalry, and the Names of the whole Body as well as of its Subdivisions";
        String titleActual = AsclepiodotusTactics7.getResources().getString(R.string.AsclepiodotusTacticsTitle7);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = AsclepiodotusTactics7.getResources().getString(R.string.AsclepiodotusTacticsTitle7);
        String titleActual = String.valueOf(AsclepiodotusTactics7.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLargeA(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = AsclepiodotusTactics7.getResources().getString(R.string.AsclepiodotusChapter7a);
        assertNotEquals(tooLarge, textActual);
    }

    @Test
    public void testStringTooLargeB(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = AsclepiodotusTactics7.getResources().getString(R.string.AsclepiodotusChapter7b);
        assertNotEquals(tooLarge, textActual);
    }

    @Test
    public void testStringTooLargeC(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = AsclepiodotusTactics7.getResources().getString(R.string.AsclepiodotusChapter7c);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayedA(){
        String expected = AsclepiodotusTactics7.getResources().getString(R.string.AsclepiodotusChapter7a);
        TextView actualTextView = (TextView) AsclepiodotusTactics7.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testCorrectTextDisplayedB(){
        String expected = AsclepiodotusTactics7.getResources().getString(R.string.AsclepiodotusChapter7b);
        TextView actualTextView = (TextView) AsclepiodotusTactics7.findViewById(R.id.textView3);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testCorrectTextDisplayedC(){
        String expected = AsclepiodotusTactics7.getResources().getString(R.string.AsclepiodotusChapter7c);
        TextView actualTextView = (TextView) AsclepiodotusTactics7.findViewById(R.id.textView4);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        AsclepiodotusTactics7 = null;
    }
}
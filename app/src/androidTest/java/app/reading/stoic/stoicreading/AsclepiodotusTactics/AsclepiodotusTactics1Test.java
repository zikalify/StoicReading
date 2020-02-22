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

public class AsclepiodotusTactics1Test {

    @Rule
    public ActivityTestRule<AsclepiodotusTactics1> AsclepiodotusTactics1TestRule = new ActivityTestRule<AsclepiodotusTactics1>(AsclepiodotusTactics1.class);

    private AsclepiodotusTactics1 AsclepiodotusTactics1 = null;

    @Before
    public void setUp() throws Exception {
        AsclepiodotusTactics1 = AsclepiodotusTactics1TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = AsclepiodotusTactics1.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "1. The different Branches of the Army";
        String titleActual = AsclepiodotusTactics1.getResources().getString(R.string.AsclepiodotusTacticsTitle1);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = AsclepiodotusTactics1.getResources().getString(R.string.AsclepiodotusTacticsTitle1);
        String titleActual = String.valueOf(AsclepiodotusTactics1.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = AsclepiodotusTactics1.getResources().getString(R.string.AsclepiodotusChapter1);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = AsclepiodotusTactics1.getResources().getString(R.string.AsclepiodotusChapter1);
        TextView actualTextView = (TextView) AsclepiodotusTactics1.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        AsclepiodotusTactics1 = null;
    }
}
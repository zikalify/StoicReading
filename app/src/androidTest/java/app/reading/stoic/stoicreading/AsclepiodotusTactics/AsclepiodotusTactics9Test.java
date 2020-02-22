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

public class AsclepiodotusTactics9Test {

    @Rule
    public ActivityTestRule<AsclepiodotusTactics9> AsclepiodotusTactics9TestRule = new ActivityTestRule<AsclepiodotusTactics9>(AsclepiodotusTactics9.class);

    private AsclepiodotusTactics9 AsclepiodotusTactics9 = null;

    @Before
    public void setUp() throws Exception {
        AsclepiodotusTactics9 = AsclepiodotusTactics9TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = AsclepiodotusTactics9.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "9. Elephants";
        String titleActual = AsclepiodotusTactics9.getResources().getString(R.string.AsclepiodotusTacticsTitle9);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = AsclepiodotusTactics9.getResources().getString(R.string.AsclepiodotusTacticsTitle9);
        String titleActual = String.valueOf(AsclepiodotusTactics9.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = AsclepiodotusTactics9.getResources().getString(R.string.AsclepiodotusChapter9);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = AsclepiodotusTactics9.getResources().getString(R.string.AsclepiodotusChapter9);
        TextView actualTextView = (TextView) AsclepiodotusTactics9.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        AsclepiodotusTactics9 = null;
    }
}
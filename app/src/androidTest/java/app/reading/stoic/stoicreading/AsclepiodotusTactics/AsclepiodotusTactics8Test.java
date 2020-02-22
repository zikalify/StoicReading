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

public class AsclepiodotusTactics8Test {

    @Rule
    public ActivityTestRule<AsclepiodotusTactics8> AsclepiodotusTactics8TestRule = new ActivityTestRule<AsclepiodotusTactics8>(AsclepiodotusTactics8.class);

    private AsclepiodotusTactics8 AsclepiodotusTactics8 = null;

    @Before
    public void setUp() throws Exception {
        AsclepiodotusTactics8 = AsclepiodotusTactics8TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = AsclepiodotusTactics8.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "8. Chariots";
        String titleActual = AsclepiodotusTactics8.getResources().getString(R.string.AsclepiodotusTacticsTitle8);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = AsclepiodotusTactics8.getResources().getString(R.string.AsclepiodotusTacticsTitle8);
        String titleActual = String.valueOf(AsclepiodotusTactics8.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = AsclepiodotusTactics8.getResources().getString(R.string.AsclepiodotusChapter8);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = AsclepiodotusTactics8.getResources().getString(R.string.AsclepiodotusChapter8);
        TextView actualTextView = (TextView) AsclepiodotusTactics8.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        AsclepiodotusTactics8 = null;
    }
}
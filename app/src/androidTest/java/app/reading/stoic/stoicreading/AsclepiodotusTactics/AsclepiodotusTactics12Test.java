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

public class AsclepiodotusTactics12Test {

    @Rule
    public ActivityTestRule<AsclepiodotusTactics12> AsclepiodotusTactics12TestRule = new ActivityTestRule<AsclepiodotusTactics12>(AsclepiodotusTactics12.class);

    private AsclepiodotusTactics12 AsclepiodotusTactics12 = null;

    @Before
    public void setUp() throws Exception {
        AsclepiodotusTactics12 = AsclepiodotusTactics12TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = AsclepiodotusTactics12.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "12. The Commands used in Military Evolutions";
        String titleActual = AsclepiodotusTactics12.getResources().getString(R.string.AsclepiodotusTacticsTitle12);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = AsclepiodotusTactics12.getResources().getString(R.string.AsclepiodotusTacticsTitle12);
        String titleActual = String.valueOf(AsclepiodotusTactics12.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = AsclepiodotusTactics12.getResources().getString(R.string.AsclepiodotusChapter12);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = AsclepiodotusTactics12.getResources().getString(R.string.AsclepiodotusChapter12);
        TextView actualTextView = (TextView) AsclepiodotusTactics12.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        AsclepiodotusTactics12 = null;
    }
}
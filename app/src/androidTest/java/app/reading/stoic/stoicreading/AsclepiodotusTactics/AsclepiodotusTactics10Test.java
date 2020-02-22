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

public class AsclepiodotusTactics10Test {

    @Rule
    public ActivityTestRule<AsclepiodotusTactics10> AsclepiodotusTactics10TestRule = new ActivityTestRule<AsclepiodotusTactics10>(AsclepiodotusTactics10.class);

    private AsclepiodotusTactics10 AsclepiodotusTactics10 = null;

    @Before
    public void setUp() throws Exception {
        AsclepiodotusTactics10 = AsclepiodotusTactics10TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = AsclepiodotusTactics10.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "10. The Terms in common Use for military Evolutions";
        String titleActual = AsclepiodotusTactics10.getResources().getString(R.string.AsclepiodotusTacticsTitle10);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = AsclepiodotusTactics10.getResources().getString(R.string.AsclepiodotusTacticsTitle10);
        String titleActual = String.valueOf(AsclepiodotusTactics10.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLargeA(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = AsclepiodotusTactics10.getResources().getString(R.string.AsclepiodotusChapter10a);
        assertNotEquals(tooLarge, textActual);
    }

    @Test
    public void testStringTooLargeB(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = AsclepiodotusTactics10.getResources().getString(R.string.AsclepiodotusChapter10b);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayedA(){
        String expected = AsclepiodotusTactics10.getResources().getString(R.string.AsclepiodotusChapter10a);
        TextView actualTextView = (TextView) AsclepiodotusTactics10.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testCorrectTextDisplayedB(){
        String expected = AsclepiodotusTactics10.getResources().getString(R.string.AsclepiodotusChapter10b);
        TextView actualTextView = (TextView) AsclepiodotusTactics10.findViewById(R.id.textView3);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        AsclepiodotusTactics10 = null;
    }
}
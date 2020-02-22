package app.reading.stoic.stoicreading.AsclepiodotusTactics;

import androidx.test.rule.ActivityTestRule;
import android.view.View;
import android.widget.TextView;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import app.reading.stoic.stoicreading.R;

import static org.junit.Assert.*;

public class AsclepiodotusTactics11Test {

    @Rule
    public ActivityTestRule<AsclepiodotusTactics11> AsclepiodotusTactics11TestRule = new ActivityTestRule<AsclepiodotusTactics11>(AsclepiodotusTactics11.class);

    private AsclepiodotusTactics11 AsclepiodotusTactics11 = null;

    @Before
    public void setUp() throws Exception {
        AsclepiodotusTactics11 = AsclepiodotusTactics11TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = AsclepiodotusTactics11.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "11. The various Arrangements of the Divisions of the Army on the March";
        String titleActual = AsclepiodotusTactics11.getResources().getString(R.string.AsclepiodotusTacticsTitle11);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = AsclepiodotusTactics11.getResources().getString(R.string.AsclepiodotusTacticsTitle11);
        String titleActual = String.valueOf(AsclepiodotusTactics11.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLargeA(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = AsclepiodotusTactics11.getResources().getString(R.string.AsclepiodotusChapter11a);
        assertNotEquals(tooLarge, textActual);
    }

    @Test
    public void testStringTooLargeB(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = AsclepiodotusTactics11.getResources().getString(R.string.AsclepiodotusChapter11b);
        assertNotEquals(tooLarge, textActual);
    }

    @Test
    public void testStringTooLargeC(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = AsclepiodotusTactics11.getResources().getString(R.string.AsclepiodotusChapter11c);
        assertNotEquals(tooLarge, textActual);
    }

    @Test
    public void testStringTooLargeD(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = AsclepiodotusTactics11.getResources().getString(R.string.AsclepiodotusChapter11d);
        assertNotEquals(tooLarge, textActual);
    }

    @Test
    public void testStringTooLargeE(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = AsclepiodotusTactics11.getResources().getString(R.string.AsclepiodotusChapter11e);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayedA(){
        String expected = AsclepiodotusTactics11.getResources().getString(R.string.AsclepiodotusChapter11a);
        TextView actualTextView = (TextView) AsclepiodotusTactics11.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testCorrectTextDisplayedB(){
        String expected = AsclepiodotusTactics11.getResources().getString(R.string.AsclepiodotusChapter11b);
        TextView actualTextView = (TextView) AsclepiodotusTactics11.findViewById(R.id.textView3);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testCorrectTextDisplayedC(){
        String expected = AsclepiodotusTactics11.getResources().getString(R.string.AsclepiodotusChapter11c);
        TextView actualTextView = (TextView) AsclepiodotusTactics11.findViewById(R.id.textView4);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testCorrectTextDisplayedD(){
        String expected = AsclepiodotusTactics11.getResources().getString(R.string.AsclepiodotusChapter11d);
        TextView actualTextView = (TextView) AsclepiodotusTactics11.findViewById(R.id.textView5);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testCorrectTextDisplayedE(){
        String expected = AsclepiodotusTactics11.getResources().getString(R.string.AsclepiodotusChapter11e);
        TextView actualTextView = (TextView) AsclepiodotusTactics11.findViewById(R.id.textView6);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        AsclepiodotusTactics11 = null;
    }
}
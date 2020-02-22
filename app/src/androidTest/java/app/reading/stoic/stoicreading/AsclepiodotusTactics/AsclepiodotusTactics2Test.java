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

public class AsclepiodotusTactics2Test {

    @Rule
    public ActivityTestRule<AsclepiodotusTactics2> AsclepiodotusTactics2TestRule = new ActivityTestRule<AsclepiodotusTactics2>(AsclepiodotusTactics2.class);

    private AsclepiodotusTactics2 AsclepiodotusTactics2 = null;

    @Before
    public void setUp() throws Exception {
        AsclepiodotusTactics2 = AsclepiodotusTactics2TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = AsclepiodotusTactics2.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "2. The Strength and the Names of the Subdivisions of the Hoplite-Phalanx";
        String titleActual = AsclepiodotusTactics2.getResources().getString(R.string.AsclepiodotusTacticsTitle2);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = AsclepiodotusTactics2.getResources().getString(R.string.AsclepiodotusTacticsTitle2);
        String titleActual = String.valueOf(AsclepiodotusTactics2.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = AsclepiodotusTactics2.getResources().getString(R.string.AsclepiodotusChapter2a);
        assertNotEquals(tooLarge, textActual);
    }

    @Test
    public void testStringTooLargeB(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = AsclepiodotusTactics2.getResources().getString(R.string.AsclepiodotusChapter2b);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = AsclepiodotusTactics2.getResources().getString(R.string.AsclepiodotusChapter2a);
        TextView actualTextView = (TextView) AsclepiodotusTactics2.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testCorrectTextDisplayedB(){
        String expected = AsclepiodotusTactics2.getResources().getString(R.string.AsclepiodotusChapter2b);
        TextView actualTextView = (TextView) AsclepiodotusTactics2.findViewById(R.id.textView3);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        AsclepiodotusTactics2 = null;
    }
}
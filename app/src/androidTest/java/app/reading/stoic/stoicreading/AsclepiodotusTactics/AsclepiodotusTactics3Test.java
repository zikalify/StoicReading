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

public class AsclepiodotusTactics3Test {

    @Rule
    public ActivityTestRule<AsclepiodotusTactics3> AsclepiodotusTactics3TestRule = new ActivityTestRule<AsclepiodotusTactics3>(AsclepiodotusTactics3.class);

    private AsclepiodotusTactics3 AsclepiodotusTactics3 = null;

    @Before
    public void setUp() throws Exception {
        AsclepiodotusTactics3 = AsclepiodotusTactics3TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = AsclepiodotusTactics3.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "3. The Disposition of the Men both in the entire Army and in its Subdivisions";
        String titleActual = AsclepiodotusTactics3.getResources().getString(R.string.AsclepiodotusTacticsTitle3);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = AsclepiodotusTactics3.getResources().getString(R.string.AsclepiodotusTacticsTitle3);
        String titleActual = String.valueOf(AsclepiodotusTactics3.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = AsclepiodotusTactics3.getResources().getString(R.string.AsclepiodotusChapter3);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = AsclepiodotusTactics3.getResources().getString(R.string.AsclepiodotusChapter3);
        TextView actualTextView = (TextView) AsclepiodotusTactics3.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        AsclepiodotusTactics3 = null;
    }
}
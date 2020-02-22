package app.reading.stoic.stoicreading.SenecaPolybius;

import android.view.View;
import android.widget.TextView;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import androidx.test.rule.ActivityTestRule;
import app.reading.stoic.stoicreading.R;

import static org.junit.Assert.*;

public class SenecaPolybius9Test {

    @Rule
    public ActivityTestRule<SenecaPolybius9> SenecaPolybius9TestRule = new ActivityTestRule<SenecaPolybius9>(SenecaPolybius9.class);

    private SenecaPolybius9 SenecaPolybius9 = null;

    @Before
    public void setUp() throws Exception {
        SenecaPolybius9 = SenecaPolybius9TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = SenecaPolybius9.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "Chapter 9";
        String titleActual = SenecaPolybius9.getResources().getString(R.string.SenecaPolybiusTitle9);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = SenecaPolybius9.getResources().getString(R.string.SenecaPolybiusTitle9);
        String titleActual = String.valueOf(SenecaPolybius9.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = SenecaPolybius9.getResources().getString(R.string.SenecaPolybiusChapter9);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = SenecaPolybius9.getResources().getString(R.string.SenecaPolybiusChapter9);
        TextView actualTextView = (TextView) SenecaPolybius9.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        SenecaPolybius9 = null;
    }
}
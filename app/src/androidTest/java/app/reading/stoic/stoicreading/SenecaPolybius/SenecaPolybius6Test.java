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

public class SenecaPolybius6Test {

    @Rule
    public ActivityTestRule<SenecaPolybius6> SenecaPolybius6TestRule = new ActivityTestRule<SenecaPolybius6>(SenecaPolybius6.class);

    private SenecaPolybius6 SenecaPolybius6 = null;

    @Before
    public void setUp() throws Exception {
        SenecaPolybius6 = SenecaPolybius6TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = SenecaPolybius6.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "Chapter 6";
        String titleActual = SenecaPolybius6.getResources().getString(R.string.SenecaPolybiusTitle6);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = SenecaPolybius6.getResources().getString(R.string.SenecaPolybiusTitle6);
        String titleActual = String.valueOf(SenecaPolybius6.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = SenecaPolybius6.getResources().getString(R.string.SenecaPolybiusChapter6);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = SenecaPolybius6.getResources().getString(R.string.SenecaPolybiusChapter6);
        TextView actualTextView = (TextView) SenecaPolybius6.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        SenecaPolybius6 = null;
    }
}
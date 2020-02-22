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

public class SenecaPolybius11Test {

    @Rule
    public ActivityTestRule<SenecaPolybius11> SenecaPolybius11TestRule = new ActivityTestRule<SenecaPolybius11>(SenecaPolybius11.class);

    private SenecaPolybius11 SenecaPolybius11 = null;

    @Before
    public void setUp() throws Exception {
        SenecaPolybius11 = SenecaPolybius11TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = SenecaPolybius11.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "Chapter 11";
        String titleActual = SenecaPolybius11.getResources().getString(R.string.SenecaPolybiusTitle11);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = SenecaPolybius11.getResources().getString(R.string.SenecaPolybiusTitle11);
        String titleActual = String.valueOf(SenecaPolybius11.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = SenecaPolybius11.getResources().getString(R.string.SenecaPolybiusChapter11);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = SenecaPolybius11.getResources().getString(R.string.SenecaPolybiusChapter11);
        TextView actualTextView = (TextView) SenecaPolybius11.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        SenecaPolybius11 = null;
    }
}
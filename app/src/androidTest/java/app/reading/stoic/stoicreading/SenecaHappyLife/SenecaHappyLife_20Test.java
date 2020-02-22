package app.reading.stoic.stoicreading.SenecaHappyLife;

import androidx.test.rule.ActivityTestRule;
import android.view.View;
import android.widget.TextView;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import app.reading.stoic.stoicreading.R;

import static org.junit.Assert.*;

public class SenecaHappyLife_20Test {

    @Rule
    public ActivityTestRule<SenecaHappyLife_20> SenecaHappyLife_20TestRule = new ActivityTestRule<SenecaHappyLife_20>(SenecaHappyLife_20.class);

    private SenecaHappyLife_20 SenecaHappyLife_20 = null;

    @Before
    public void setUp() throws Exception {
        SenecaHappyLife_20 = SenecaHappyLife_20TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = SenecaHappyLife_20.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "Chapter 20";
        String titleActual = SenecaHappyLife_20.getResources().getString(R.string.SenecaHappyLifeTitle20);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = SenecaHappyLife_20.getResources().getString(R.string.SenecaHappyLifeTitle20);
        String titleActual = String.valueOf(SenecaHappyLife_20.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = SenecaHappyLife_20.getResources().getString(R.string.SenecaHappyLifeChapter20);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = SenecaHappyLife_20.getResources().getString(R.string.SenecaHappyLifeChapter20);
        TextView actualTextView = (TextView) SenecaHappyLife_20.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        SenecaHappyLife_20 = null;
    }
}
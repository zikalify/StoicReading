package app.reading.stoic.stoicreading.AratusPhenomena;

import androidx.test.rule.ActivityTestRule;
import android.view.View;
import android.widget.TextView;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import app.reading.stoic.stoicreading.R;

import static org.junit.Assert.*;

public class AratusPhenomenaChapter1Test {

    @Rule
    public ActivityTestRule<AratusPhenomenaChapter1> AratusPhenomenaChapter1TestRule = new ActivityTestRule<AratusPhenomenaChapter1>(AratusPhenomenaChapter1.class);

    private AratusPhenomenaChapter1 AratusPhenomenaChapter1 = null;

    @Before
    public void setUp() throws Exception {
        AratusPhenomenaChapter1 = AratusPhenomenaChapter1TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = AratusPhenomenaChapter1.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "Part 1";
        String titleActual = AratusPhenomenaChapter1.getResources().getString(R.string.AratusPhenomenaChapter1);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = AratusPhenomenaChapter1.getResources().getString(R.string.AratusPhenomenaChapter1);
        String titleActual = String.valueOf(AratusPhenomenaChapter1.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = AratusPhenomenaChapter1.getResources().getString(R.string.AratusPhenomena1);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = AratusPhenomenaChapter1.getResources().getString(R.string.AratusPhenomena1);
        TextView actualTextView = (TextView) AratusPhenomenaChapter1.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        AratusPhenomenaChapter1 = null;
    }
}
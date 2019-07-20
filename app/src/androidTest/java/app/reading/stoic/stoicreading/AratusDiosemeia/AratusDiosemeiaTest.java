package app.reading.stoic.stoicreading.AratusDiosemeia;

import android.content.Context;
import android.content.res.Resources;
import android.support.test.rule.ActivityTestRule;
import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import app.reading.stoic.stoicreading.R;

import static org.junit.Assert.*;

public class AratusDiosemeiaTest {

    @Rule
    public ActivityTestRule<AratusDiosemeia> AratusDiosemeiaTestRule = new ActivityTestRule<AratusDiosemeia>(AratusDiosemeia.class);

    private AratusDiosemeia AratusDiosemeia = null;

    @Before
    public void setUp() throws Exception {
        AratusDiosemeia = AratusDiosemeiaTestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = AratusDiosemeia.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    @Test
    public void testTitle(){
        String title = "Diosemeia";
        String string1 = AratusDiosemeia.getResources().getString(R.string.AratusDiosemeiaTitle);
        assertEquals(title, string1);
    }

    @After
    public void tearDown() throws Exception {
        AratusDiosemeia = null;
    }
}
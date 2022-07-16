package com.example.pruebaunitarias;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;

public class Test {
    public static final String email1 = "correo1@gmail.com";
    public static final String user1 = "";
    public static final String email2 = "correolgmail.com";
    public static final String user2 = "Prueba";
    public static final String email3 = "";
    public static final String user3 = "correo";

    @Rule
    public ActivityScenarioRule<MainActivity> mActivityTestRule = new ActivityScenarioRule<MainActivity>(MainActivity.class);

    @org.junit.Test
    public void primera() {
        onView(withId(R.id.correo)).perform(typeText(email1), closeSoftKeyboard());
        onView(withId(R.id.usuario)).perform(typeText(user1), closeSoftKeyboard());
        onView(withId(R.id.btn_enviar)).perform(click());
    }


    @org.junit.Test
    public void segundo() {
        onView(withId(R.id.correo)).perform(typeText(email2), closeSoftKeyboard());
        onView(withId(R.id.usuario)).perform(typeText(user2), closeSoftKeyboard());
        onView(withId(R.id.btn_enviar)).perform(click());
    }


    @org.junit.Test
    public void tercero() {
        onView(withId(R.id.correo)).perform(typeText(email3), closeSoftKeyboard());
        onView(withId(R.id.usuario)).perform(typeText(user3), closeSoftKeyboard());
        onView(withId(R.id.btn_enviar)).perform(click());
    }
}

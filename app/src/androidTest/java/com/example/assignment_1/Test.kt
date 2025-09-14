package com.example.assignment_1

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityNavigationTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainpageActivity::class.java)

    @Test
    fun navigateToSearch() {
        // Click on search button
        onView(withId(R.id.search)).perform(click())

        // Check that SearchActivity UI is displayed
        onView(withId(R.id.create)) // <-- use a unique ID from SearchActivity layout
            .check(matches(isDisplayed()))
    }

    @Test
    fun navigateToProfile() {
        // Click on profile button
        onView(withId(R.id.profile)).perform(click())

        // Check that ProfileActivity UI is displayed
        onView(withId(R.id.editbtn)) // <-- replace with a unique ID from ProfileActivity
            .check(matches(isDisplayed()))
    }
}

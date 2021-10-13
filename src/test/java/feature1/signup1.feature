Feature: Automation testing for E-learning website

  Background: Automated login and navigate to Progress
    Given: User is on home page

    When User enters "<username>" and "<password>"
    And clicks on login button
    Then User gets redirected to dashboard of website
    And user clicks on Progress section on menu bar
    Then User gets redirected to Progress section

  @smoke
  Scenario: Automation of Progress title functionality
    Given User is on Progress section
    Then User should be able to see course title
    And user should be able to see Course, Time spent in the course,	Progress,	Best score in learning path,	Best score not in learning path	,Latest login,	Details

  @regression
  Scenario: Automation on details of My courses
    Given User is on Progress section
    Then user is able to see all the details under each title of My Courses

  @arrow
  Scenario: Automated blue colour arrow
    Given User is on Progress section
    When user clicks on the arrow button
    Then user is able to see details of the courses below

  @title
  Scenario: Automated course name
    Given User is on Progress section
    Then User should be able to see Tests, Attempts,	Best attempt,Ranking,	Best result in course, Statistics

  @test
  Scenario: Automation on testname
    Given User is on Progress section
    Then user is able to see test name of subscribed course
    And user is also able to click on test name

  @timeline
  Scenario: Automation on Timeline functionality
    Given User is on Progress section
    Then user is able to see Timeline heading
    And user is able to see login-time of subscribed courses
    When user clicks on time, user is able to see message under it
    Then User should be able to see only one login time

  @logo
  Scenario: Verify logo
    Given User is on Progress section
    And user is able to see logo of blue color

  @button
  Scenario: Automation on arrow button
    Given User is on Progress section
    Then user is able to see arrow button beside the logo

  @dropdown
  Scenario: Automated dropdown
    Given User clicks on drop-down
    When user is able to see his name and email-id
    Then User clicks on his name
    And gets redirected to social network page
    Then user again clicks on the profile drop-down button
    And gets clicks on Inbox link
    When user clicks on My Certificates link
    And user is redirected to certificate page
    When user clicks on Logout link
    And user gets on the homepage

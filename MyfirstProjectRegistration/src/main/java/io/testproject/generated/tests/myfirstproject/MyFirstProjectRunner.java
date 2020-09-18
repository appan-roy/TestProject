package io.testproject.generated.tests.myfirstproject;

import io.testproject.java.enums.AutomatedBrowserType;
import io.testproject.java.execution.results.StepExecutionResult;
import io.testproject.java.sdk.v2.Runner;
import java.lang.Exception;
import java.lang.String;

/**
 * This class was automatically generated by TestProject
 * Provides an example how to run coded TestProject tests
 */
public class MyFirstProjectRunner {
  public static String developerToken = "4rYSAnEfN2Klg0Tg8Cko-j10u8UiynvtC9fyeIg1ItQ";

  public static AutomatedBrowserType browserType = AutomatedBrowserType.Chrome;

  public static void main(String[] args) {
    try {
      runRegistration();
    }
    catch (Exception e) {
    }
  }

  /**
   * Runs "Registration"
   */
  public static StepExecutionResult runRegistration() throws Exception {
    Runner runner = Runner.createWeb(developerToken,browserType);
    return runner.run(new Registration(), true);
  }

  /**
   * Runs "Login"
   */
  public static StepExecutionResult runLogin() throws Exception {
    Runner runner = Runner.createWeb(developerToken,browserType);
    return runner.run(new Login(), true);
  }

  /**
   * Runs "Logout"
   */
  public static StepExecutionResult runLogout() throws Exception {
    Runner runner = Runner.createWeb(developerToken,browserType);
    return runner.run(new Logout(), true);
  }
}

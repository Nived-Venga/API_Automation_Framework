package techWithJatin.apis.listeners;

import org.apache.logging.log4j.*;
import org.testng.*;

public class TestListener implements ITestListener {
private static final Logger logger = LogManager.getLogger(TestListener.class);
   /* @Override
    public void onStart(ITestContext context) {logger.info("Test Suite Started");}*/
    @Override
    public void onTestStart(ITestResult result) {
        logger.info("Test Started");
        System.out.println("Print in logs");
       // logger.info("Test Started!!!{}", result.getTestName());
       // logger.info("Test Description: {}", result.getMethod().getMethodName());
    }
    /*@Override
    public void onTestSuccess(ITestResult result) {

        logger.info("Test Passed!!!{}", result.getTestName());
       logger.info("Test Description: {}" , result.getMethod().getMethodName());
    }
    @Override
    public void onTestSkipped(ITestResult result) {
        logger.info("Test Skipped!!!{}", result.getTestName());
    logger.info("Test Description: " + result. getMethod().getMethodName());
    }
    @Override
    public void onTestFailure(ITestResult result) {
        logger.fatal("Test Failed!!!{}", result.getTestName());
        logger.error("Test Description: {}", result.getMethod().getMethodName());
    }
    @Override
    public void onFinish(ITestContext context) {
        logger.info("Test Suite Finished");
    }*/

}

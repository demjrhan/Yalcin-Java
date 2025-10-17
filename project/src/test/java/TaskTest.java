import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TaskTest {
    @Test
    public void greaterThan7() {
        Assert.assertEquals(TaskLogic.greetIfGreater7(9), "Hello");
        Assert.assertEquals(TaskLogic.greetIfGreater7(8), "Hello");
        Assert.assertEquals(TaskLogic.greetIfGreater7(7), "");
        Assert.assertEquals(TaskLogic.greetIfGreater7(6), "");
        Assert.assertEquals(TaskLogic.greetIfGreater7(5), "");
        Assert.assertEquals(TaskLogic.greetIfGreater7(-5), "");
        Assert.assertEquals(TaskLogic.greetIfGreater7(-55), "");
        Assert.assertEquals(TaskLogic.greetIfGreater7(Integer.MIN_VALUE), "");
        Assert.assertEquals(TaskLogic.greetIfGreater7(Integer.MAX_VALUE), "Hello");
    }

    @Test
    public void greetJohn() {
        Assert.assertEquals(TaskLogic.greetName("John"), "Hello, John");
        Assert.assertEquals(TaskLogic.greetName("john"), "Hello, John");
        Assert.assertEquals(TaskLogic.greetName("john "), "Hello, John");
        Assert.assertEquals(TaskLogic.greetName(" john "), "Hello, John");
        Assert.assertEquals(TaskLogic.greetName(" john"), "Hello, John");
        Assert.assertEquals(TaskLogic.greetName("Mary"), "There is no such name");
        Assert.assertEquals(TaskLogic.greetName(null), "There is no such name");
        Assert.assertEquals(TaskLogic.greetName(""), "There is no such name");
        Assert.assertEquals(TaskLogic.greetName("\n"), "There is no such name");
        Assert.assertEquals(TaskLogic.greetName("\\s"), "There is no such name");
    }

    @Test
    public void multipleOf3() {
        Assert.assertEquals(TaskLogic.multiplesOf3(new int[]{9, 2, 4, 6}), List.of(9, 6));
        Assert.assertEquals(TaskLogic.multiplesOf3(new int[]{}), List.of());
        Assert.assertEquals(TaskLogic.multiplesOf3(null), List.of());
        Assert.assertEquals(TaskLogic.multiplesOf3(new int[]{1, 2, 4, 5, 7}), List.of());
        Assert.assertEquals(TaskLogic.multiplesOf3(new int[]{0, -3, 3}), List.of(0, -3, 3));
        Assert.assertEquals(TaskLogic.multiplesOf3(new int[]{Integer.MIN_VALUE, -3, 3}), List.of(-3, 3));
    }

    @Test
    public void isBracketsBalanced() {
        Assert.assertEquals(Task.isBalanced("[]()()"), "Given bracket sequence is correct.");
        Assert.assertEquals(Task.isBalanced("[)"), "Given bracket sequence is incorrect.");
        Assert.assertEquals(Task.isBalanced("[(])"), "Given bracket sequence is incorrect.");
        Assert.assertEquals(Task.isBalanced("()(){"), "Given bracket sequence is incorrect.");
        Assert.assertEquals(Task.isBalanced("{()}"), "Given bracket sequence is incorrect.");
        Assert.assertEquals(Task.isBalanced("[(  ])"), "Given bracket sequence is incorrect.");
        Assert.assertEquals(Task.isBalanced("[((())()(()) )]".replace(" ", "")),
                "Given bracket sequence is correct.");
        Assert.assertEquals(Task.isBalanced("   "),
                "Given bracket sequence is empty, please give sequence consists of at least 1 element.");
        Assert.assertEquals(Task.isBalanced(null),
                "Given bracket sequence is empty, please give sequence consists of at least 1 element.");
    }
}

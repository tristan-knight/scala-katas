import org.scalatest.FunSuite

class CommandLineArgumentsTest extends FunSuite {

  test("CommandLineArguments.parseArgument") {
    assert(CommandLineArguments.parseArgument("") == List())
    assert(CommandLineArguments.parseArgument("-p") == List(("p", None)))
    assert(CommandLineArguments.parseArgument("-v") == List(("v", None)))
    assert(CommandLineArguments.parseArgument("-v -p") == List(("v", None), ("p", None)))
    assert(CommandLineArguments.parseArgument("-v  -p") == List(("v", None), ("p", None)))
    assert(CommandLineArguments.parseArgument("-p 8080") == List(("p", "8080")))
    assert(CommandLineArguments.parseArgument("-v -p 8080") == List(("v", None), ("p", "8080")))
    assert(CommandLineArguments.parseArgument("-p \"8 080\"") == List(("p", "8 080")))
    //assert(CommandLineArguments.parseArgument("-p \"80-80\"") == List(("p", "80-80")))





  }
}

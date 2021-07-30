object CommandLineArguments {

  def parseArgument(argument: String) = {
    argument.split('-')
      .filterNot(string => string.isEmpty)
      .map(argument => {
        val flagAndVal = argument.split(' ')
        flagAndVal match{
        case value if flagAndVal.length > 1 => (flagAndVal(0), argument.substring(2).filterNot(char => char == '\"'))
        case _ => (flagAndVal(0), None)
      }})
      .toList
  }

}


if(1 != args.size()) {
	println "please enter the file name."
	return
}

new File(args[0]).eachLine { line, index ->
	println index + ": " + line
}

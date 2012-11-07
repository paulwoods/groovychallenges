
if(1 != args.size()) {
	println "please enter the file name."
	return
}

println new File(args[0]).text

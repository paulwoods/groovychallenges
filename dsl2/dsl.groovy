
if(2 != args.size()) {
	println "please enter the file name, and the name to say hello to"
	return
}

def text = new File(args[0]).text

def shell = new GroovyShell()
shell.name = args[1]
shell.evaluate text

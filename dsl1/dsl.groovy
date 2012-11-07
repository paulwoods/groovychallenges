
if(1 != args.size()) {
	println "please enter the file name."
	return
}

def text = new File(args[0]).text

def shell = new GroovyShell()
shell.evaluate text


if(2 != args.size()) {
	println "syntax is: dsl scriptname datafile"
	return
}

def script = new File(args[0]).text

def shell = new GroovyShell()

new File(args[1]).eachLine { line ->
	if(!line) return

	def fields = line.split(",")
	if(2 != fields.size()) return

	shell.a = fields[0].toDouble()
	shell.b = fields[1].toDouble()

	shell.evaluate script

	println shell.c


}



if(1 != args.size()) {
	println "please enter the file name."
	return
}

new File(args[0]).eachLine { line, index ->

	if(!line) {
		println "-- blank -- "
		return
	}

	def fields = line.split(",")

	boolean valid = fields.every { number ->
		number.isInteger()
	}

	if(!valid) {
		println "-- invalid number --"
		return
	}

	def value = fields[0].toInteger()
	fields[1..-1].each { 
		value *= it.toInteger()
	}
	println value

}

case class Students(name: String, age: Int, grade: Char){
	
	object Students_Records {
		
		def main(args: Array[String]): Unit = {
			
			val Student_1 = Students("Mbappe", 23, 'A')
			val Student_2 = Students("Mukiele", 22, 'B')
			val Student_3 = Students("Messi", 23, 'A')
			val Student_4 = Students("CrSeven", 22, 'A')
			
			val students = List(Student_1,Student_2,Student_3,Student_4)
			
			for (student <- students) {
				println(s"Name: ${student.name}, Age: ${student.age}, Grade: ${student.grade}")
				}
			}
			}
		
		}
	
	
	
	
	

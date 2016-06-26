JAVAC = javac
JFLAGS = -g
JAVA = java
SOURCES = Tutorial3.java B_Node.java BS_Tree.java Tutorial_Methods_Class.java

Tutorial3.class: Tutorial3.java B_Node.java BS_Tree.java Tutorial_Methods_Class.java
	$(JAVAC) $(JFLAGS) $<
	
	$(JAVA) Tutorial3 
clean:
	$(RM) -f $(SOURCES:.java=.class)



package main.java.com.itbatia.patterns.interpreter;

public class InterpreterRunner {
    public static void main(String[] args) {
        Expression isJavaNio = getJavaNio();
        Expression isWalkFileTree = getClassFiles();

        System.out.println("Is there an article about Java NIO?");
        System.out.println(isJavaNio.interpret("java ... nio ...\n"));
        System.out.println("Is there any information about Files class and walkFileTree method?");
        System.out.println(isWalkFileTree.interpret("files ... method ... content"));
    }

    public static Expression getJavaNio() {
        Expression java = new TerminalExpression("java");
        Expression nio = new TerminalExpression("nio");

        return new AndExpression(java, nio);
    }
    public static Expression getClassFiles (){
        Expression files = new TerminalExpression("files");
        Expression walkFileTree = new TerminalExpression("walkFileTree");

        return new OrExpression(files, walkFileTree);
    }
}

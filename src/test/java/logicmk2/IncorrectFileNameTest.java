package logicmk2;

import org.junit.Test;

import java.io.IOException;


public class IncorrectFileNameTest {
    @Test
    public void incorrectFileNameTest() {
        LogicReader reader = new LogicReader("nosuchfile.txt");
        LogicParserTxt parser = new LogicParserTxt();
        try{
            reader.readFromFile();
            parser.parseRules(reader.getReadFile());
            parser.parseVariablesLine(reader.getVariablesLine());
        }
        catch (IOException e){
            System.out.println("Fatal error");
            System.out.println("No such file found \""+reader.getFileName()+"\"");
        }
        catch (NullPointerException e){
            System.out.println("Fatal error");
            System.out.println("File name missing");
        }
        LogicEvaluator evaluator = new LogicEvaluator(parser.getVariables());
        for (int i = 0; i < parser.getExpressions().size(); i++) {
            for (ExpressionTxt expression : parser.getExpressions()) {
                evaluator.evaluateExpression(expression);
            }
        }
    }
}
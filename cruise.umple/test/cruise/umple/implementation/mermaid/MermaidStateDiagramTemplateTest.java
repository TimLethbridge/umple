package cruise.umple.implementation.mermaid;

import org.junit.*;

import cruise.umple.implementation.*;
import cruise.umple.util.SampleFileWriter;

public class MermaidStateDiagramTemplateTest extends TemplateTest
{
  
  @Before
  public void setUp()
  {
    super.setUp();
    language = "MermaidStateDiagram";
    languagePath = "mermaid";
  }
  
  @After
  public void tearDown()
  {
    super.tearDown();
    SampleFileWriter.destroy(pathToInput + "/mermaid/StateBasic_stateDiagram.mermaid");
    SampleFileWriter.destroy(pathToInput + "/mermaid/StateNested_stateDiagram.mermaid");
  }
  
  @Test
  public void StateBasic()
  {
    assertUmpleTemplateFor("mermaid/StateBasic.ump", "mermaid/StateBasic.mermaid.txt");
  }

  @Test
  public void StateNested()
  {
    assertUmpleTemplateFor("mermaid/StateNested.ump", "mermaid/StateNested.mermaid.txt");
  }
}

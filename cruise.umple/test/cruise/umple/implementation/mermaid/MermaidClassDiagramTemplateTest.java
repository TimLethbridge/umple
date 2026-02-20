package cruise.umple.implementation.mermaid;

import org.junit.*;

import cruise.umple.implementation.*;
import cruise.umple.util.SampleFileWriter;

public class MermaidClassDiagramTemplateTest extends TemplateTest
{
  
  @Before
  public void setUp()
  {
    super.setUp();
    language = "MermaidClassDiagram";
    languagePath = "mermaid";
  }
  
  @After
  public void tearDown()
  {
    super.tearDown();
    SampleFileWriter.destroy(pathToInput + "/mermaid/ClassTemplateTest_Mermaid.mermaid");
  }
  
  @Test
  public void MermaidClassDiagramLanguage()
  {
    language = null;
    assertUmpleTemplateFor("mermaid/ClassTemplateTest_Mermaid.ump", "mermaid/ClassTemplateTest_Mermaid.mermaid.txt");
  }
}

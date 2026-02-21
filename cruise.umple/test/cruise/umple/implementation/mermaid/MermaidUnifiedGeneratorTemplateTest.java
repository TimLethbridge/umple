package cruise.umple.implementation.mermaid;

import java.io.File;

import org.junit.*;

import cruise.umple.implementation.*;
import cruise.umple.util.SampleFileWriter;

public class MermaidUnifiedGeneratorTemplateTest extends TemplateTest
{

  @Before
  public void setUp()
  {
    super.setUp();
    language = "Mermaid";
    languagePath = "mermaid";
  }

  @After
  public void tearDown()
  {
    super.tearDown();
    SampleFileWriter.destroy(pathToInput + "/mermaid/StateBasic_classDiagram.mermaid");
    SampleFileWriter.destroy(pathToInput + "/mermaid/StateBasic_stateDiagram.mermaid");
  }

  @Test
  public void MermaidCombinedDefault()
  {
    suboptions = null;
    assertUmpleTemplateFor("mermaid/StateBasic.ump", "mermaid/StateBasic.combined.mermaid.txt");
  }

  @Test
  public void MermaidClassSuboption()
  {
    suboptions = new String[] {"class"};
    assertUmpleTemplateFor("mermaid/StateBasic.ump", "mermaid/StateBasic.classonly.mermaid.txt");
  }

  @Test
  public void MermaidStateSuboption()
  {
    suboptions = new String[] {"state"};
    assertUmpleTemplateFor("mermaid/StateBasic.ump", "mermaid/StateBasic.mermaid.txt");
  }

  @Test
  public void MermaidWriteFilesSuboption()
  {
    suboptions = new String[] {"state", "writefiles"};
    assertUmpleTemplateFor("mermaid/StateBasic.ump", "mermaid/StateBasic.mermaid.txt");
    Assert.assertTrue(new File(pathToInput + "/mermaid/StateBasic_stateDiagram.mermaid").exists());
  }

  @Test
  public void MermaidCombinedWithoutStateMachines()
  {
    suboptions = null;
    assertUmpleTemplateFor("mermaid/AttributesAndMethods.ump", "mermaid/AttributesAndMethods.mermaid.txt");
  }
}

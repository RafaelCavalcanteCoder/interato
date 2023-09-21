package br.com.interato;



import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;


public class TestExploratorio extends BaseTest {

    @Test
    public void TC_001_DeveCadastrarUmNovoPaciente() {
        waiting();
        TestExploratorioPO page = new TestExploratorioPO(driver);

        page.buttonPaciente();
        page.buttonAdicionar();
        page.inputNome("Lucas de Brito"); 
        page.inputEmail("lucas12@gmail.com");
        page.inputCpf("41692117823");
        page.inputPassword("123456");
        page.inputPhone("11940738778");
        waiting();
        page.inputpatientresponsible();
        page.submit();
            //VERIFICANDO SE O PACIENTE FOI CADASTRADO, BUSCANDO NOME PELO FILTRO!
        
        page.buttonFiltro();
        page.filtroNome();
        page.search("Lucas de Brito");
        waiting();
        assertEquals("Lucas de Brito", 
            driver.findElement(By.cssSelector("body > div.min-h-screen.bg-white > main > div > div > div.w-full.bg-white.p-6.rounded-lg.drop-shadow-2xl.mb-12 > div > table > tbody > tr > td:nth-child(1) > div > p")).getText());
        
            driver.quit();
    }
}

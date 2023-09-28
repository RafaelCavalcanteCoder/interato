package br.com.interato.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import br.com.interato.BaseTest;

public class CadastroPage extends BaseTest{
    @FindBy(id = "name")
    private WebElement inputNome;
    
    @FindBy(id = "email")
    private WebElement inputEmail;

    @FindBy(id = "doc")
    private WebElement inputCpf;

    @FindBy(id = "phone")
    private WebElement inputPhone;

    @FindBy(id = "patientIsResponsible")
    private WebElement inputPatientResponsible;

    @FindBy(id = "responsiblePassword")
    private WebElement inputPassword;

    @FindBy(css = "#headlessui-dialog-panel-\\:r1\\: > form > div.grid.grid-cols-12.w-full.gap-6.p-6 > div:nth-child(10) > div > button:nth-child(2)")
    private WebElement submit;

   

    public CadastroPage(WebDriver driver) {
        super(driver);
    }

    
public HomePage registroNovoPaciente (String nome, String email, String senha, String cpf, String telefone){
    inputNome.sendKeys(nome);
    inputEmail.sendKeys(email);
    inputPassword.sendKeys(senha);
    inputCpf.sendKeys(cpf);
    inputPhone.sendKeys(telefone);
    inputPatientResponsible.click();
    submit.click();
    return new HomePage(driver);
}
}

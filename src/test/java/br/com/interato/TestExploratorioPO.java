package br.com.interato;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestExploratorioPO extends BaseTest {
    WebDriver driver;

    public TestExploratorioPO(WebDriver driver) {
        this.driver = driver;
    }




public void buttonClinica (){
    driver.findElement(By.xpath("/html/body/div[2]/nav/div/div/div[1]/div[2]/div/a[2]"));
}
public void buttonTerapeuta (){ 
    driver.findElement(By.xpath("/html/body/div[2]/nav/div/div/div[1]/div[2]/div/a[3]"));
}
public void buttonPaciente (){ 
    driver.findElement(By.xpath("/html/body/div[2]/nav/div/div/div[1]/div[2]/div/a[4]")).click();
}
public void buttonAdicionar (){
    driver.findElement(By.cssSelector("body > div.min-h-screen.bg-white > header > div > div > div.flex.col-span-12.md\\:col-span-2.justify-end.items-center.tracking-tight.text-sm.font-medium.leading-none > button")).click();
}
    // ELEMENTOS DO FORMULARIO PACIENTE!

public void inputNome (String nome){
    driver.findElement(By.id("name")).sendKeys(nome);
}
public void inputEmail (String email){
    driver.findElement(By.id("email")).sendKeys(email);
}
public void inputCpf (String cpf){
    driver.findElement(By.id("doc")).sendKeys(cpf);
}
public void inputPhone (String telefone){
    driver.findElement(By.id("phone")).sendKeys(telefone);
}
public void inputpatientresponsible (){
    driver.findElement(By.id("patientIsResponsible")).click();
}
public void inputPassword (String senha){
    driver.findElement(By.id("responsiblePassword")).sendKeys(senha);
}
public void submit (){ 
    driver.findElement(By.cssSelector("#headlessui-dialog-panel-\\:r1\\: > form > div.grid.grid-cols-12.w-full.gap-6.p-6 > div:nth-child(10) > div > button:nth-child(2)")).click();
 }
    // ELEMENTOS DO FILTRO DE BUSCA

public void buttonFiltro(){
    driver.findElement(By.id("radix-:Rakrb9mmja:")).click();
}
public void filtroNome(){
    driver.findElement(By.cssSelector("#radix-\\:Rakrb9mmjaH1\\: > div:nth-child(5)")).click();
}
public void search(String busca){
    driver.findElement(By.id("search")).sendKeys(busca);
}
}


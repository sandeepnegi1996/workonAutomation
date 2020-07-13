package com.workon.pages.locators.amlactglibmae;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AMLACTGLIBMAERequestCreationLocators {

	@FindBy(xpath = "//li//a[contains(text(),'Informações Gerais')]")
	public WebElement informationElement;

	
//  choose this values -->  "CB - LAB EP"
	@FindBy(xpath = "//span[contains(text(),'* Opções de fluxo')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create')]//select")
	public WebElement firstDropdown;
	
	
	
	//3. Plant  --> // "CaP1"

	@FindBy(xpath = "//span[contains(text(),'* Planta')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create')]//select")
	public WebElement plantDropdownElement;
	
	
	//span[contains(text(),'* Planta')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create')]//select


	//4. Diviison -->  // "ArP/ADM"
	//span[contains(text(),'* Divisão/Depto')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create')]//select

	
	@FindBy(xpath = "//span[contains(text(),'* Divisão/Depto')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create')]//select")
	public WebElement divisionDropdownElement;
	
	
	

	@FindBy(xpath = "//span[contains(text(),'* Setor')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create')]//input")
	public WebElement sectorElement;

	@FindBy(xpath = "//span[contains(text(),'* Ramal')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create')]//input")
	public WebElement RamalElement;

	@FindBy(xpath = "//span[contains(text(),'* Produto')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create')]//input")
	public WebElement productElement;

	@FindBy(xpath = "//span[contains(text(),'* Emitente')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create')]//input")
	public WebElement EmitnenttElement;

	@FindBy(xpath = "//span[contains(text(),'* Descrição')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create')]//input")
	public WebElement DescriciaElement;

	@FindBy(xpath = "//span[contains(text(),'* Previsão chegada MAE Bosch')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create')]//input")
	public WebElement firstDateInput;

	@FindBy(xpath = "//span[contains(text(),'* Previsão SOP Instalação MAE')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create')]//input")
	public WebElement secondDateInput;

	@FindBy(xpath = "//span[contains(text(),'* Justificativa de ausência do COP')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create')]//textarea")
	public WebElement textareaElement;



//14//delete apprvers
	
	
	//make it unselectable
	
	@FindBy(xpath="//div[@class='x-grid3-cell-inner x-grid3-col-6']")
	public List<WebElement> deleteDiv;

	@FindBy(xpath = "//td//div//span//img[@class='ApprovalListGridControlButton_Delete']")
	public List<WebElement> deleteApprovalBtn;

//15 Add approver 
	@FindBy(xpath = "//button[contains(text(),'Adicionar um aprovador')]")
	public List<WebElement> approverBtn;

	@FindBy(css = "#NameFilterField")
	public WebElement enterNtid;

	@FindBy(xpath = "//div[contains(@class,'x-grid3-cell-inner x-grid3-col-name')]")
	public WebElement selectNtid;

	@FindBy(css = "#WorkOnSubmitButton")
	public WebElement submitBtn;

//16.submit

}

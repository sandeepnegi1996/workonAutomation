package com.workon.pages.locators.amlacsaltreclann;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AMLACSALTRECOLANNRequestCreationLocators {
	
	
	@FindBy(xpath="//a[text()='Informações Gerais']")
	public WebElement firstTab;
	
	
	


	@FindBy(xpath="//span[contains(text(),'* Cliente')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[@class='rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ']//input")
	public WebElement clientElement;


	@FindBy(xpath="//span[contains(text(),'* Montante')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[@class='rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ']//input")
	public WebElement montateElement;
	
	

	@FindBy(xpath="//span[contains(text(),'* Comentários')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[@class='rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ']//textarea")
	public WebElement commercialElement;
	
	@FindBy(xpath="//button[text()='Adicionar um aprovador']")
	public WebElement approverButtonElement;
	
	@FindBy(css = "#NameFilterField")
	public WebElement enterNtid;

	@FindBy(xpath = "//div[contains(@class,'x-grid3-cell-inner x-grid3-col-name')]")
	public WebElement selectNtid;
	

}

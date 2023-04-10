package com.juaracoding.cucumber.pages;


import com.juaracoding.cucumber.drivers.strategies.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecruitmentPage {
    private WebDriver driver;

    public RecruitmentPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[normalize-space()='Recruitment']")
    WebElement btnRecruitment;

    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
    WebElement txtRecruitment;

    @FindBy(xpath = "//button[normalize-space()='Add']")
    WebElement btnAdd;

    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']")
    WebElement txtTitleAdd;

    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement inputFirstName;

    @FindBy(xpath = "//input[@placeholder='Middle Name']")
    WebElement inputMidleName;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement inputLastName;

    @FindBy(xpath = "//div[@class='oxd-select-text-input']")
    WebElement inputVacancy;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input")
    WebElement inputEmail;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input")
    WebElement inputNumberHP;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div/div/div/div[2]/input")
    WebElement inputDoc;

    @FindBy(xpath = "//input[@placeholder='Enter comma seperated words...']")
    WebElement inputNote;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[5]/div/div[2]/div/div[2]/div/div/input")
    WebElement inputDate;

    @FindBy(xpath = "//textarea[@placeholder='Type here']")
    WebElement inputDesc;

    @FindBy(xpath = "//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")
    WebElement btnCeklis;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnSubmit;
    @FindBy(xpath = "//input[@placeholder='Enter comma seperated words...']")
    WebElement keywords;

    @FindBy(xpath = "//input[@placeholder='yyyy-mm-dd']")
    WebElement date;

    @FindBy(xpath = "//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")
    WebElement chkConsent;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnSave;

    @FindBy(xpath = "//h6[normalize-space()='Application Stage']")
    WebElement txtApplicationStage;

    @FindBy(xpath = "//a[normalize-space()='Vacancies']")
    WebElement menuVacancies;

    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[1]/div/div[2]/input")
    WebElement vacancyName;

    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div/div[2]/div/div/div[1]")
    WebElement jobTitle;

    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement hiringManager;

    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/div[2]/div/div/div/div[2]/input")
    WebElement numberPositions;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[4]/div[1]/div[1]/label[1]/span[1]")
    WebElement btnActive;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[5]/div[1]/div[1]/label[1]/span[1]")
    WebElement btnPublish;

    @FindBy(xpath = "//button[normalize-space()='Cancel']")
    WebElement btnCancel;

    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']")
    WebElement txtEditVacancy;

    @FindBy(xpath = "//span[normalize-space()='Required']")
    WebElement txtRequiredForm;
    @FindBy(xpath = "//span[normalize-space()='Invalid']")
    WebElement txtInvalidForm;

    public void goToMenuRecruitment() {
        btnRecruitment.click();
    }

    public String getTxtRecruitment() {
        return txtRecruitment.getText();
    }

    public String getJudulAddPage() {
        return txtTitleAdd.getText();
    }

    public void addDataPage(){
        btnAdd.click();
    }
    public String getTxtRequiredForm(){
        return txtRequiredForm.getText();
    }
    public String getTxtInvalidForm(){
        return txtInvalidForm.getText();
    }

    public String getTxtAppStage(){
        return txtApplicationStage.getText();
    }
    public String getTxtEditVacancy(){
        return txtEditVacancy.getText();
    }
    public void clickMenuVacancies(){
        menuVacancies.click();
    }
    public void fillName(){
        inputFirstName.sendKeys("Yusup");
        inputMidleName.sendKeys("Bin");
        inputLastName.sendKeys("Sanusi");
    }
    public void fillNoName(){
        inputFirstName.sendKeys("");
        inputMidleName.sendKeys("");
        inputLastName.sendKeys("");
    }
    public void fillNoFirstName(){
        inputFirstName.sendKeys("");
        inputMidleName.sendKeys("Bin");
        inputLastName.sendKeys("Sanusi");
    }
    public void fillNoLastName(){
        inputFirstName.sendKeys("Yusup");
        inputMidleName.sendKeys("Bin");
        inputLastName.sendKeys("");
    }
    public void selectVacancy(){
        inputVacancy.sendKeys("Software");
    }
    public void fillEmailContact(){
        inputEmail.sendKeys("bangucup@gmail.com");
        inputNumberHP.sendKeys("080989999");
    }
    public void uploadResume(){
        String pathDoc = "D:\\Works\\JuaraCoding\\Excel\\UTT-Books-37.docx";
        inputDoc.sendKeys(pathDoc);
    }
    public void fillKeywords(){
        keywords.sendKeys("Test");
    }
    public void chooseDate(){
        date.sendKeys(Keys.CONTROL,"a",Keys.DELETE);
        date.sendKeys("2023-02-23");
    }
    public void fillNotes(){
        inputNote.sendKeys("Test");
    }
    public void fillVacName(){
        vacancyName.sendKeys("abcd");
    }
    public void fillNoVacName(){
        vacancyName.sendKeys("");
    }
    public void selectJobTitle(){
        jobTitle.sendKeys("Account Assistant");
    }
    public void fillDescription(){
        inputDesc.sendKeys("Test");
    }
    public void fillHiring(){
        hiringManager.sendKeys("siapa aja");
    }
    public void fillNoHiring(){
        hiringManager.sendKeys("");
    }
    public void fillInvalidHiring(){
        hiringManager.sendKeys("Apa aja");
    }
    public void fillPosNumber(){
        numberPositions.sendKeys("2");
    }
    public void checkConsent(){
        chkConsent.click();
    }
    public void clickActive(){
        btnActive.click();
    }
    public void clickPublish(){
        btnPublish.click();
    }
    public void clickBtnSave(){
        btnSave.click();
    }
    public void clickBtnCancel(){
        btnCancel.click();
    }
}
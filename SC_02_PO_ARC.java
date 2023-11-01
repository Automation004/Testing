package x_com_PO_Initiator;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.CommanPackage.B_POM2_Common_Class;
import com.CommanPackage.MainPageClass;
import com.Masters_Update.POIntitiorRolebaseclass;
public class SC_02_PO_ARC extends MainPageClass {

	@SuppressWarnings("deprecation")
	@Test
	public void A() throws Exception {
		POIntitiorRolebaseclass cbn = new POIntitiorRolebaseclass(driver);
		B_POM2_Common_Class cm = new B_POM2_Common_Class(driver);


		for (int i = 2; i <= 2; i++) {
			String sp = xls1.getCellData("vendorexcel", "sp", i);
			String username = xls1.getCellData("Credentials", "PO Initiator", i);
			String password = xls1.getCellData("Credentials", "Password", i);
			//String commentsarc = xls1.getCellData("Credentials", "commentsarc", i);
			Login(username, password);
			cbn.Revenue();
			cbn.PoinititatedArc();
			cbn.Arc();
			cbn.ArcAction();
			cbn.checkbox();
			cbn.taxcode();
			cbn.paymentterms();
			cbn.devailary();
			cbn.sp(sp);
			cbn.vendorlist();
			cbn.vendorlistcheckbox();
			cbn.transporter();
			cbn.save();
			cbn.comments("NA");
			cm.Submit1();
			driver.findElement(By.xpath("//button[contains (text(),'Ok')]")).click();

		}
	}
}

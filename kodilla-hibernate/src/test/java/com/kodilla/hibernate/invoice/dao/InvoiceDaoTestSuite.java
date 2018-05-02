package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("Computer");
        Product product2 = new Product("PS4");
        Item item1 = new Item(new BigDecimal(1000), new BigDecimal(900), 1);
        Item item2 = new Item(new BigDecimal(2000), new BigDecimal(1900), 1);
        item1.setProduct(product1);
        item2.setProduct(product2);
        Invoice invoice = new Invoice("02.05.2018/0001");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0,id);

        //CleanUp
//        try {
//            invoiceDao.delete(id);
//        } catch (Exception e) {
//        }


    }
}

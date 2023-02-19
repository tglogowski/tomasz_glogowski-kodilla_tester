package com.kodilla.execution_model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTestSuite {

    Invoice invoice = new Invoice();
    Item ladder = new Item("Ladder", 249.50);
    Item paint = new Item("Paint", 120.79);
    Item paintbrush = new Item("Paintbrush", 15.99);
    Item maskingTape = new Item("Masking Tape", 22.39);


    @BeforeEach
    public void initInvoice() {
        invoice.addItem(ladder);
        invoice.addItem(paint);
        invoice.addItem(paintbrush);
        invoice.addItem(maskingTape);
    }

    @Test
    public void testListSize() {

        // When
        int numberOfItems = invoice.getSize();

        // Then
        assertEquals(4,numberOfItems);
    }

    @Test
    public void testIfItemsNameAndPriceAreCorrect() {

        // When
        Item result = invoice.getItem(3);

        // Then
        assertEquals("Masking Tape",result.getName());
        assertEquals(22.39,result.getPrice(),0.01);
    }

    @Test
    public void shouldReturnNullIfIndexIsNegativeNumber() {

        assertNull(invoice.getItem(-1));
    }

    @Test
    public void shouldReturnNullIfIndexIsUotOfRange() {

        assertNull(invoice.getItem(7));
    }
    @Test
    public void shouldReturnTrueWhenListIsClear() {
        // When
        invoice.clear();
        // Then
        assertTrue(invoice.getSize() == 0);
    }

    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }
}
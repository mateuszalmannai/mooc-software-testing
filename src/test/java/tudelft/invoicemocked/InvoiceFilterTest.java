package tudelft.invoicemocked;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class InvoiceFilterTest {
    @Test
    void filterInvoices() {

        Invoice mauricio = new Invoice("Mauricio", 20.0);
        Invoice arie = new Invoice("Arie", 300.0);
        List<Invoice> results = Arrays.asList(mauricio, arie);

        InvoiceDao mockedDao = mock(InvoiceDao.class);
        when(mockedDao.all()).thenReturn(results);

        InvoiceFilter filter = new InvoiceFilter(mockedDao);
        List<Invoice> result = filter.filter();

        assertEquals(mauricio, result.get(0));
        assertEquals(1, result.size());
    }

}

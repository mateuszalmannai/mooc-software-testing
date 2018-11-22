package tudelft.discount;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.when;

public class DiscountApplierTest {

    public static final String CANONDALE = "Canondale";
    public static final String PEN = "Pen";
    private ProductDao productDaoMock = Mockito.mock(ProductDao.class);

    private DiscountApplier sut = new DiscountApplier(productDaoMock);

    public static final String BUSINESS = "BUSINESS";
    public static final String HOME = "HOME";
    private List<Product> productList = Arrays.asList(
            new Product(PEN, 20, BUSINESS),
            new Product("Pencil", 10, BUSINESS),
            new Product(CANONDALE, 2000, HOME)
    );


    @BeforeEach
    void setUp() {
        when(productDaoMock.all()).thenReturn(productList);
    }

    @Test
    void testBusinessPrice() {

        sut.setNewPrices();

        Optional<Product> penOptional = productList.stream()
                .filter(p -> p.getName().equals(PEN))
                .findFirst();

        Product pen = penOptional.get();

        assertThat(pen.getCategory()).isEqualTo(BUSINESS);
        assertThat(pen.getPrice()).isEqualTo(20 * 1.1);
    }

    @Test
    void testHomePrice() {

        sut.setNewPrices();

        Optional<Product> optionalProduct = productList.stream()
                .filter(p -> p.getName().equals(CANONDALE))
                .findFirst();

        Product canondale = optionalProduct.get();
        assertThat(canondale.getCategory()).isEqualTo(HOME);
        assertThat(canondale.getPrice()).isEqualTo(2000 * 0.9);
    }
}

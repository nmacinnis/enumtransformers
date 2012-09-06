import org.junit.Before;
import org.junit.Test;

public class IdentityEnumTransformerTest {
    IdentityEnumTransformer<TestEnumOne, TestEnumTwo> transformer;
    @Before
    public void setUp() {
        transformer = new IdentityEnumTransformer<TestEnumOne, TestEnumTwo>();
    }
    
    
    /**
     * Test method for {@link IdentityEnumTransformer#transform(java.lang.Enum)}.
     */
    @Test
    public void testTransformSrcEnumToDestEnum() {
        TestEnumTwo two = transformer.transformSrcEnumToDestEnum(TestEnumOne.abc, TestEnumTwo.class);
    }
    /**
     * Test method for {@link IdentityEnumTransformer#transform(java.lang.Enum)}.
     */
    @Test
    public void testTransformDestEnumToSrcEnum() {
        TestEnumOne one = transformer.transformDestEnumToSrcEnum(TestEnumTwo.abc, TestEnumOne.class);
    }
    enum TestEnumOne {
        abc;
    }
    
    enum TestEnumTwo {
        abc;
    }
}

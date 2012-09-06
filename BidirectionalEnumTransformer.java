/**
 * Interface for an enum transformer that can transform each of two enums into the other.
 */
public interface BidirectionalEnumTransformer<SE extends Enum<SE>, DE extends Enum<DE>> extends EnumTransformer<SE, DE> {
    /**
     * This method transforms the destination enum into its corresponding source enum. 
     * Implementing classes should define the mapping.
     * Should throw RunTimeException if the transformation is impossible for a given enum.
     * @param destEnum destination enum constant
     * @return the corresponding source enum
     */
    public SE transformDestEnumToSrcEnum(DE destEnum, Class<SE> sourceEnumClass);
}

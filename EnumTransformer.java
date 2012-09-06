/**
 * Interface for enum transformation
 */
public interface EnumTransformer<SE extends Enum<SE>, DE extends Enum<DE>> {

	/**
	 * This method translates source enum constant to corresponding destination enum constant. 
	 * Implementation classes should define the mapping.
	 * @param sourceEnum source enum constant
	 * @param destinationEnumClass Class object of the destination enum
	 * @return
	 */
	public DE transformSrcEnumToDestEnum(SE sourceEnum, Class<DE> destinationEnumClass);
}

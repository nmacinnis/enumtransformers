/**
 * This is a Transformer class which is used to convert back and forth between two Enum objects
 * This transformer will be able to translate successfully if and only if there is a destination enum constant with same name as source Enum constant
 */
class IdentityEnumTransformer<SE extends Enum<SE>, DE extends Enum<DE>>  implements BidirectionalEnumTransformer<SE, DE>{
    @Override
    public DE transformSrcEnumToDestEnum(SE sourceEnum, Class<DE> destinationEnumClass) {
        return SE.valueOf(destinationEnumClass, sourceEnum.toString());
    }
    
    @Override
    public SE transformDestEnumToSrcEnum(DE destEnum, Class<SE> sourceEnumClass) {
        return DE.valueOf(sourceEnumClass, destEnum.toString());
    }

}

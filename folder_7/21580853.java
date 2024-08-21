public class BigbenchClone{    
    public void testSetupIntraPssLookup() throws Exception {
        ICtxEntity entity;
        List<ICtxIdentifier> identifiers;
        List<ICtxEntityIdentifier> entities;
        entity = getPlatformCtxBroker().createEntity(REMOTE_EMPTY_ENTITY);
        entity = getPlatformCtxBroker().createEntity(REMOTE_ENTITY);
        final ICtxAttribute remoteNameAttribute = getPlatformCtxBroker().createAttribute(entity.getCtxIdentifier(), REMOTE_NAME_ATTRIBUTE);
        final ICtxAttribute remove3pAttribute = getPlatformCtxBroker().createAttribute(entity.getCtxIdentifier(), REMOVE_ATTRIBUTE_3P);
        final ICtxAttribute update3pAttribute = getPlatformCtxBroker().createAttribute(entity.getCtxIdentifier(), UPDATE_ATTRIBUTE_3P);
        final ICtxAttribute minValueAttribute = getPlatformCtxBroker().createAttribute(entity.getCtxIdentifier(), RANGE_ATTRIBUTE_NAME, RANGE_ATTRIBUTE_VALUE);
        getIdentityManagement().addMappedCtxIdentifier(getIdentityManagement().getPublicDigitalPersonalIdentifier(), remoteNameAttribute.getCtxIdentifier());
        getIdentityManagement().addMappedCtxIdentifier(getIdentityManagement().getPublicDigitalPersonalIdentifier(), remove3pAttribute.getCtxIdentifier());
        getIdentityManagement().addMappedCtxIdentifier(getIdentityManagement().getPublicDigitalPersonalIdentifier(), update3pAttribute.getCtxIdentifier());
        getIdentityManagement().addMappedCtxIdentifier(getIdentityManagement().getPublicDigitalPersonalIdentifier(), minValueAttribute.getCtxIdentifier());
        final Permission addAttributePermission = new CtxPermission(entity.getCtxIdentifier(), "create");
        final Permission remoteEntityPermission = new CtxPermission(entity.getCtxIdentifier(), "read");
        final Permission remoteNamePermission = new CtxPermission(remoteNameAttribute.getCtxIdentifier(), "read");
        final Permission remove3pPermission = new CtxPermission(remove3pAttribute.getCtxIdentifier(), "read,delete");
        final Permission update3pPermission = new CtxPermission(update3pAttribute.getCtxIdentifier(), "read,write");
        IAccessControlDecision decision = getAccessControlDecisionMgr().create(getIdentityManagement().getPublicDigitalPersonalIdentifier());
        decision.add(addAttributePermission);
        decision.add(remoteEntityPermission);
        decision.add(remoteNamePermission);
        decision.add(remove3pPermission);
        decision.add(update3pPermission);
        getAccessControlDecisionMgr().update(decision);
        identifiers = get3pCtxBroker().lookup(getIdentityManagement().getPublicDigitalPersonalIdentifier(), getIdentityManagement().getPublicDigitalPersonalIdentifier(), CtxModelType.ENTITY, REMOTE_ENTITY);
        assertEquals(1, identifiers.size());
        log.info("retrieving: " + identifiers.get(0));
        entity = (ICtxEntity) get3pCtxBroker().retrieve(getIdentityManagement().getPublicDigitalPersonalIdentifier(), identifiers.get(0));
        assertNotNull("Entity not retrieved", entity);
        assertEquals("Wrong identifier type returned", CtxModelType.ENTITY, entity.getModelType());
        assertEquals("Wrong entity type returned", REMOTE_ENTITY, entity.getType());
        assertEquals("Incorrect number of attributes returned - check target dpi mappings", 4, entity.getAttributesSize());
        identifiers = getPlatformCtxBroker().lookup(CtxModelType.ENTITY, REMOTE_EMPTY_ENTITY);
        assertEquals(1, identifiers.size());
        log.info("retrieving: " + identifiers.get(0));
        entity = (ICtxEntity) getPlatformCtxBroker().retrieve(identifiers.get(0));
        assertNotNull("Entity not retrieved", entity);
        assertEquals("Wrong identifier type returned", CtxModelType.ENTITY, entity.getModelType());
        assertEquals("Wrong entity type returned", REMOTE_EMPTY_ENTITY, entity.getType());
        entities = getPlatformCtxBroker().lookupEntities(REMOTE_ENTITY, RANGE_ATTRIBUTE_NAME, RANGE_ATTRIBUTE_VALUE);
        log.info("lookup entities by attribute value returns " + entities.size() + " entities");
        entities = getPlatformCtxBroker().lookupEntities(REMOTE_ENTITY, RANGE_ATTRIBUTE_NAME, RANGE_ATTRIBUTE_VALUE - 1, RANGE_ATTRIBUTE_VALUE + 1);
        log.info("lookup entities in range returns " + entities.size() + " entities");
    }
}
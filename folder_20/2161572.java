public class BigbenchClone{    
    public void test_implies() {
        ResourcePermission permission, another;
        CanonicalUser grantee;
        grantee = new CanonicalUser("id");
        permission = new ResourcePermission(grantee, ResourcePermission.ACTION_FULL_CONTROL);
        assertTrue("Should imply", permission.implies(permission));
        assertFalse("Should not imply", permission.implies(null));
        assertFalse("Should not imply", permission.implies(new FilePermission("/etc", "read")));
        another = new ResourcePermission(grantee, ResourcePermission.ACTION_READ);
        assertTrue("Should imply", permission.implies(another));
        another = new ResourcePermission(grantee, ResourcePermission.ACTION_WRITE);
        assertTrue("Should imply", permission.implies(another));
        another = new ResourcePermission(grantee, ResourcePermission.ACTION_READ_ACP);
        assertTrue("Should imply", permission.implies(another));
        another = new ResourcePermission(grantee, ResourcePermission.ACTION_WRITE_ACP);
        assertTrue("Should imply", permission.implies(another));
        another = new ResourcePermission(grantee, "read, write");
        assertTrue("Should imply", permission.implies(another));
        another = new ResourcePermission(grantee, "read, read_acp");
        assertTrue("Should imply", permission.implies(another));
        permission = new ResourcePermission(grantee, ResourcePermission.ACTION_READ);
        another = new ResourcePermission(grantee, ResourcePermission.ACTION_WRITE);
        assertFalse("Should not imply", permission.implies(another));
        permission = new ResourcePermission(grantee, ResourcePermission.ACTION_FULL_CONTROL);
        another = new ResourcePermission(new CanonicalUser("foo"), ResourcePermission.ACTION_FULL_CONTROL);
        assertFalse("Should not imply", permission.implies(another));
        permission = new ResourcePermission(AuthenticatedUsersGroup.getInstance(), "read, read_acp");
        another = new ResourcePermission(grantee, ResourcePermission.ACTION_READ);
        assertTrue("Should imply", permission.implies(another));
        another = new ResourcePermission(grantee, ResourcePermission.ACTION_WRITE);
        assertFalse("Should not imply", permission.implies(another));
        permission = new ResourcePermission(AuthenticatedUsersGroup.getInstance(), "read, read_acp");
        another = new ResourcePermission(new CanonicalUser(CanonicalUser.ID_ANONYMOUS), ResourcePermission.ACTION_READ);
        assertFalse("Should not imply", permission.implies(another));
        permission = new ResourcePermission(AllUsersGroup.getInstance(), "read");
        another = new ResourcePermission(grantee, ResourcePermission.ACTION_READ);
        assertTrue("Should imply", permission.implies(another));
        another = new ResourcePermission(grantee, ResourcePermission.ACTION_WRITE);
        assertFalse("Should not imply", permission.implies(another));
        permission = new ResourcePermission(AllUsersGroup.getInstance(), "read");
        another = new ResourcePermission(new CanonicalUser(CanonicalUser.ID_ANONYMOUS), ResourcePermission.ACTION_READ);
        assertTrue("Should imply", permission.implies(another));
        another = new ResourcePermission(new CanonicalUser(CanonicalUser.ID_ANONYMOUS), ResourcePermission.ACTION_WRITE);
        assertFalse("Should not imply", permission.implies(another));
    }
}
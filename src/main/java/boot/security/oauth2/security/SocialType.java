package boot.security.oauth2.security;

public enum SocialType {
    GOOGLE("google");

    private final String ROLE_PREFIX = "ROLE_";
    private String name;

    SocialType(String name) {this.name = name;}

    public String getRoleTYpe() {return ROLE_PREFIX + name.toUpperCase();}

    public String getValue() {return name;}

    public boolean isEquals(String authority) { return this.getRoleTYpe().equals(authority);}
}

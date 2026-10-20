package MiniProjects;

public class MemberL {
    private final String memberId;
    private final String name;
    public MemberL(String memberId, String name)
    {
        this.memberId=memberId;
        this.name=name;
    }
    public String getMemberId()
    {
        return memberId;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId='" + memberId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName()
    {
        return name;
    }
}

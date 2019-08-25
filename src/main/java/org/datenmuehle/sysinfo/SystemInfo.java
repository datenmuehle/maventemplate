package org.datenmuehle.sysinfo;

public class SystemInfo
{
    public static String getVersion() {
        return Version.VERSION;
    }

    public static String getBuild()
    {
        return Version.BUILD;
    }
}

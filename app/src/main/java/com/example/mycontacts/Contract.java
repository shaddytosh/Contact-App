package com.example.mycontacts;

import android.net.Uri;
import android.provider.BaseColumns;

public final class Contract {

    // empty constructor so no one else can use it
    public Contract() {

    }

    // creating content authority, baseuri and path

    // your package name insert in contentauthority
    public static final String CONTENT_AUTHORITY = "com.example.mycontacts";
    public static final Uri BASE_URI = Uri.parse("content://"+ CONTENT_AUTHORITY);
    // path name should be similar to your table name
    public static final String PATH_CONTACTS = "mycontacts";

    public static abstract class ContactEntry implements BaseColumns{

        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_URI, PATH_CONTACTS);

        public static final String TABLE_NAME = "mycontacts";
        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_EMAIL = "email";
        public static final String COLUMN_PICTURE = "picture";
        public static final String COLUMN_PHONENUMBER = "number";
        public static final String COLUMN_TYPEOFCONTACT = "type";


        public static final String TYPEOFCONTACT_MANAGER = "Manager";
        public static final String TYPEOFCONTACT_EMPLOYEE = "Employee";
        public static final String TYPEOFCONTACT_SECURITY = "Security";
        public static final String TYPEOFCONTACT_CONTRACTOR = "Contractor";
        public static final String TYPEOFCONTACT_OTHER = "Other";


        public static boolean isValidType (String type) {
            if (type == TYPEOFCONTACT_MANAGER || type == TYPEOFCONTACT_EMPLOYEE || type == TYPEOFCONTACT_SECURITY || type == TYPEOFCONTACT_CONTRACTOR || type == TYPEOFCONTACT_OTHER) {
                return true;
            }
            return false;
        }


    }
}

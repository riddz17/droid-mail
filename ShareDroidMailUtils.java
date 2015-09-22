
public class ShareDroidMailUtils
{

public static void shareLinkedMail(Context mContext)
{

                Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
                emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, EMAIL);
                emailIntent.setType("text/html");
                String link_val = "www.google.com";
                String body = "<a href=\"" + link_val + "\">" + link_val+ "</a>";
                // intent.putExtra(android.content.Intent.EXTRA_TEXT, Html.fromHtml(body));
                emailIntent.putExtra(android.content.Intent.EXTRA_TEXT,"Hi, \n\n Bla bla bla \n some more bla bla \n\n and again blala bla \n finally bla \n\n\n\n\n ---Footer Here----\n\n\n" + "\n \n \n" + Html.fromHtml(body) );
                mContext.startActivity(emailIntent);

}

public static void shareImageMail()
{
    Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);

    emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, emailaddress);
    emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, message);
    emailIntent.setType("image/png");

    ArrayList<Uri> uris = new ArrayList<Uri>();

    uris.add(Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.file1));
    uris.add(Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.file2));

    emailIntent.putExtra(Intent.EXTRA_STREAM, uris));

    startActivity(emailIntent);
}
}


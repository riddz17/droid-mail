
public class ShareDroidMailUtils
{

public static void shareLinkedMail()
{
  String link_val = "www.google.com"
  String body = "<a href=\"" + link_val + "\">" + link_val+ "</a>"

  intent.putExtra(android.content.Intent.EXTRA_TEXT, Html.fromHtml(body));
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


import java.util.ArrayList;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;

import entities.Question;

public class JSONParser {

	public static Question parseQuestion(String questionJSON) throws JSONException {
		// {"Questions":[{"PostId":2533214,"TotalAnswers":2,"OwnerUserId":115621,"Title":"Saddle roof algorithm","UpVoteCount":3,"DownVoteCount":0,"FavoriteCount":0,"ViewCount":46,"Score":3,"CreationDate":1269786184,"LastActivityDate":1269803934,"IsCommunityOwned":false,"Tags":"algorithm"},{"PostId":2534166,"TotalAnswers":0,"OwnerUserId":303728,"OwnerDisplayName":"Jeff","Title":"having trouble with a mod_rewrite rule","UpVoteCount":0,"DownVoteCount":0,"FavoriteCount":0,"ViewCount":0,"Score":0,"CreationDate":1269803933,"LastActivityDate":1269803933,"IsCommunityOwned":false,"Tags":"mod-rewrite"},{"PostId":2534165,"TotalAnswers":0,"OwnerUserId":303718,"Title":"ruby on rails photo upload problem","UpVoteCount":0,"DownVoteCount":0,"FavoriteCount":0,"ViewCount":1,"Score":0,"CreationDate":1269803899,"LastActivityDate":1269803899,"IsCommunityOwned":false,"Tags":"rails photo display show images"},{"PostId":2533988,"TotalAnswers":2,"OwnerUserId":69742,"OwnerDisplayName":"Earlz","Title":"How much buffer does NetworkStream and TcpClient have?","UpVoteCount":0,"DownVoteCount":0,"FavoriteCount":0,"ViewCount":17,"Score":0,"CreationDate":1269800611,"LastActivityDate":1269803886,"IsCommunityOwned":false,"Tags":"c# tcp tcpclient buffer"},{"PostId":2534040,"TotalAnswers":1,"OwnerUserId":267752,"Title":"WPF Drag and drop to Datagrid","UpVoteCount":2,"DownVoteCount":0,"FavoriteCount":0,"ViewCount":5,"Score":2,"CreationDate":1269801451,"LastEditedDate":1269803885,"LastActivityDate":1269803885,"IsCommunityOwned":false,"Tags":"wpf datagrid drag-and-drop"},{"PostId":1082675,"TotalAnswers":10,"OwnerUserId":39036,"OwnerDisplayName":"samoz","Title":"Can you explain what's going on in this Ruby code?","UpVoteCount":6,"DownVoteCount":0,"FavoriteCount":0,"ViewCount":304,"Score":6,"CreationDate":1246729940,"LastEditedDate":1246731612,"LastActivityDate":1269803881,"IsCommunityOwned":false,"AcceptedAnswer":1082711,"Tags":"ruby ruby-on-rails"},{"PostId":2496727,"TotalAnswers":3,"OwnerUserId":102719,"OwnerDisplayName":"cometbill","Title":"#Developer installer- This setup requires the .NET Framework 3.5 SP1 to be installed","UpVoteCount":0,"DownVoteCount":0,"FavoriteCount":0,"ViewCount":52,"Score":0,"CreationDate":1269304216,"LastEditedDate":1269803839,"LastActivityDate":1269803839,"IsCommunityOwned":false,"AcceptedAnswer":2521382,"Tags":"sharpdevelop"},{"PostId":2534162,"TotalAnswers":0,"OwnerUserId":108137,"OwnerDisplayName":"Rick","Title":"Simple jQuery Toggle of children","UpVoteCount":0,"DownVoteCount":0,"FavoriteCount":0,"ViewCount":2,"Score":0,"CreationDate":1269803832,"LastActivityDate":1269803832,"IsCommunityOwned":false,"Tags":"jquery jquery-selectors"},{"PostId":2532468,"TotalAnswers":1,"OwnerUserId":91,"OwnerDisplayName":"Michael Stum","Title":"Using RouteExistingFiles to block access to existing files even if no route exists","UpVoteCount":0,"DownVoteCount":0,"FavoriteCount":0,"ViewCount":6,"Score":0,"CreationDate":1269769798,"LastEditedDate":1269770131,"LastActivityDate":1269803805,"IsCommunityOwned":false,"Tags":"asp.net-mvc asp.net .net"},{"PostId":2534127,"TotalAnswers":1,"OwnerUserId":303727,"OwnerDisplayName":"ddd","Title":"Converting a byte array to a X.509 certificate","UpVoteCount":2,"DownVoteCount":0,"FavoriteCount":0,"ViewCount":13,"Score":2,"CreationDate":1269803028,"LastActivityDate":1269803794,"IsCommunityOwned":false,"Tags":"cryptography x509certificate2 .net java c#"},{"PostId":2533968,"TotalAnswers":1,"OwnerUserId":147601,"OwnerDisplayName":"Rosarch","Title":"Difficulty getting Saxon into XQuery mode instead of XSLT","UpVoteCount":0,"DownVoteCount":0,"FavoriteCount":0,"ViewCount":3,"Score":0,"CreationDate":1269800307,"LastActivityDate":1269803791,"IsCommunityOwned":false,"Tags":"saxon xquery xslt beginner"},{"PostId":2534147,"TotalAnswers":2,"OwnerUserId":43960,"OwnerDisplayName":"Chris","Title":"Java Thread wait() => blocked?","UpVoteCount":0,"DownVoteCount":0,"FavoriteCount":0,"ViewCount":21,"Score":0,"CreationDate":1269803527,"LastActivityDate":1269803778,"IsCommunityOwned":false,"Tags":"java concurrent"},{"PostId":2511547,"TotalAnswers":2,"OwnerUserId":47633,"Title":"how to manually deploy a web service on tomcat 6?","UpVoteCount":0,"DownVoteCount":0,"FavoriteCount":0,"ViewCount":21,"Score":0,"CreationDate":1269466142,"LastActivityDate":1269803774,"IsCommunityOwned":false,"Tags":"java web-services tomcat soap deployment"},{"PostId":2534156,"TotalAnswers":0,"OwnerUserId":49925,"OwnerDisplayName":"dummzeuch","Title":"How can I create an .xls file with a readwrite password from Delphi","UpVoteCount":0,"DownVoteCount":0,"FavoriteCount":0,"ViewCount":1,"Score":0,"CreationDate":1269803749,"LastActivityDate":1269803749,"IsCommunityOwned":false,"Tags":"delphi excel"},{"PostId":2532430,"TotalAnswers":1,"OwnerUserId":282302,"OwnerDisplayName":"Adam","Title":"Need some help with onClick and an if/else issue...","UpVoteCount":1,"DownVoteCount":0,"FavoriteCount":0,"ViewCount":50,"Score":1,"CreationDate":1269768736,"LastEditedDate":1269803735,"LastActivityDate":1269803735,"IsCommunityOwned":false,"Tags":"onclick ifelse html javascript jquery"},{"PostId":2533510,"TotalAnswers":1,"OwnerUserId":72859,"OwnerDisplayName":"Thomas Stock","Title":"Create ControlTemplate programmatically in wpf","UpVoteCount":0,"DownVoteCount":0,"FavoriteCount":0,"ViewCount":6,"Score":0,"CreationDate":1269791912,"LastActivityDate":1269803727,"IsCommunityOwned":false,"Tags":"wpf controltemplate codebehind"},{"PostId":2531800,"TotalAnswers":2,"OwnerUserId":298123,"OwnerDisplayName":"BC","Title":"I dont know how or where to add the correct encoding code to this iPhone code...","UpVoteCount":0,"DownVoteCount":0,"FavoriteCount":0,"ViewCount":17,"Score":0,"CreationDate":1269746976,"LastActivityDate":1269803674,"IsCommunityOwned":false,"AcceptedAnswer":2531921,"Tags":"iphone encoding xcode objective-c utf-8"},{"PostId":1261764,"TotalAnswers":3,"OwnerUserId":5447,"OwnerDisplayName":"gabriel","Title":"[WordPress] Need help with remove_action()","UpVoteCount":1,"DownVoteCount":0,"FavoriteCount":0,"ViewCount":255,"Score":1,"CreationDate":1250010777,"LastActivityDate":1269803667,"IsCommunityOwned":false,"AcceptedAnswer":1268992,"Tags":"php wordpress wordpress-plugin wordpress-theming"},{"PostId":2534083,"TotalAnswers":1,"OwnerUserId":303685,"OwnerDisplayName":"Water Cooler v2","Title":"Dynamically load a type from an external assembly","UpVoteCount":1,"DownVoteCount":0,"FavoriteCount":0,"ViewCount":12,"Score":1,"CreationDate":1269802354,"LastEditedDate":1269803666,"LastActivityDate":1269803666,"IsCommunityOwned":false,"AcceptedAnswer":2534135,"Tags":"reflection c#"},{"PostId":2417929,"TotalAnswers":1,"OwnerUserId":290628,"OwnerDisplayName":"David","Title":"Why does my Perl program print the help message when an arguments has 0 as a value?","UpVoteCount":3,"DownVoteCount":0,"FavoriteCount":0,"ViewCount":39,"Score":3,"CreationDate":1268233638,"LastEditedDate":1269803640,"LastActivityDate":1269803640,"IsCommunityOwned":false,"AcceptedAnswer":2417951,"Tags":"perl getopt-long zero integer parameters"},{"PostId":2534073,"TotalAnswers":8,"OwnerUserId":303694,"OwnerDisplayName":"Denis Gorbachev","Title":"A pragmatic view on private vs public","UpVoteCount":4,"DownVoteCount":0,"FavoriteCount":0,"ViewCount":56,"Score":4,"CreationDate":1269802129,"LastActivityDate":1269803636,"IsCommunityOwned":false,"Tags":"private public restrictions"},{"PostId":2534150,"TotalAnswers":0,"OwnerUserId":102493,"OwnerDisplayName":"trisignia","Title":"Problems with Runt overlap? but *only* within Rails","UpVoteCount":0,"DownVoteCount":0,"FavoriteCount":0,"ViewCount":1,"Score":0,"CreationDate":1269803634,"LastActivityDate":1269803634,"IsCommunityOwned":false,"Tags":"rails ruby runt datetime date"},{"PostId":2513024,"TotalAnswers":2,"OwnerUserId":147601,"OwnerDisplayName":"Rosarch","Title":"Getting started with XSD validation with C#","UpVoteCount":2,"DownVoteCount":0,"FavoriteCount":0,"ViewCount":38,"Score":2,"CreationDate":1269490705,"LastEditedDate":1269519517,"LastActivityDate":1269803582,"BountyClosesDate":1270405147,"IsCommunityOwned":false,"Tags":"c# xsd xml xml-validation"},{"PostId":2534096,"TotalAnswers":1,"OwnerUserId":28298,"OwnerDisplayName":"chester89","Title":"Can't figure out what lazy-loading policy NHibernate uses","UpVoteCount":0,"DownVoteCount":0,"FavoriteCount":0,"ViewCount":4,"Score":0,"CreationDate":1269802483,"LastActivityDate":1269803529,"IsCommunityOwned":false,"Tags":"nhibernate lazy-loading"},{"PostId":2533966,"TotalAnswers":4,"OwnerUserId":231538,"OwnerDisplayName":"ikurtz","Title":"C# ThreadPool QueueUserWorkItem Synchronization","UpVoteCount":2,"DownVoteCount":0,"FavoriteCount":0,"ViewCount":38,"Score":2,"CreationDate":1269800273,"LastEditedDate":1269801499,"LastActivityDate":1269803509,"IsCommunityOwned":false,"Tags":"c# queueuserworkitem synchronization"},{"PostId":2427527,"TotalAnswers":2,"OwnerUserId":282200,"OwnerDisplayName":"ron","Title":"How can I convert a 48 hex string to bytes using Perl?","UpVoteCount":3,"DownVoteCount":1,"FavoriteCount":0,"ViewCount":116,"Score":2,"CreationDate":1268331530,"LastEditedDate":1269803488,"LastActivityDate":1269803488,"IsCommunityOwned":false,"AcceptedAnswer":2427695,"Tags":"perl pack"},{"PostId":2510975,"TotalAnswers":2,"OwnerUserId":37055,"OwnerDisplayName":"Chris Marisic","Title":"C# Object Pooling Pattern implementation","UpVoteCount":0,"DownVoteCount":0,"FavoriteCount":0,"ViewCount":67,"Score":0,"CreationDate":1269460720,"LastActivityDate":1269803454,"BountyClosesDate":1270408254,"IsCommunityOwned":false,"Tags":"c# design-patterns pooling"},{"PostId":2534097,"TotalAnswers":2,"OwnerUserId":130015,"OwnerDisplayName":"chobo2","Title":"Any Developer Conferences coming up in Vancouver, BC,Canada?","UpVoteCount":1,"DownVoteCount":0,"FavoriteCount":0,"ViewCount":19,"Score":1,"CreationDate":1269802498,"LastActivityDate":1269803405,"IsCommunityOwned":false,"Tags":"conferences programming-conferences software-conferences non-programming-related"},{"PostId":2534116,"TotalAnswers":2,"OwnerUserId":162414,"OwnerDisplayName":"Gabriel A. Zorrilla","Title":"How to convert get.rgb(x,y) integer pixel to Color(r,g,b,a) in Java?","UpVoteCount":2,"DownVoteCount":0,"FavoriteCount":0,"ViewCount":27,"Score":2,"CreationDate":1269802829,"LastActivityDate":1269803381,"IsCommunityOwned":false,"AcceptedAnswer":2534131,"Tags":"java color image"},{"PostId":2429150,"TotalAnswers":3,"OwnerUserId":244843,"OwnerDisplayName":"synapz","Title":"Why is Perl's Math::Complex taking up so much time when I try acos(1)?","UpVoteCount":3,"DownVoteCount":1,"FavoriteCount":0,"ViewCount":72,"Score":2,"CreationDate":1268346119,"LastEditedDate":1269803379,"LastActivityDate":1269803379,"IsCommunityOwned":false,"AcceptedAnswer":2429211,"Tags":"perl mathcomplex profiler"}]}
		JSONObject jQ = new JSONObject(questionJSON);
		Question ret = new Question(jQ.getLong("PostId"), jQ.getInt("TotalAnswers"), jQ.getInt("OwnerUserId"), jQ
				.getString("Title"), jQ.getInt("UpVoteCount"), jQ.getInt("DownVoteCount"), jQ.getInt("ViewCount"), jQ
				.getLong("CreationDate"), jQ.getString("Tags"));
		return ret;
	}

	public static List<Question> parseListOfQuestions(String questionsJSON){
		List<Question> ret = new ArrayList<Question>();
		
		return ret;
	}
	
}

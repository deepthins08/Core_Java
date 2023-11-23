class ApplicationStarter{
	
	public static void main(String... apps){
		
		System.out.println("Stratig main in ApplicationStarter");
		
		
		String[] supportedBrowsers=new String[3];
		supportedBrowsers[0]="chrome";
		supportedBrowsers[1]="Edge";
		supportedBrowsers[2]="Firefox";
		
		
		WebApplication webapplication=new WebApplication("FaceBook",AppType.ENTERTAINMENT);
		webapplication.setBrowser(supportedBrowsers);
		webapplication.information(true);
		
		String[] downloads=new String[3];
		downloads[0]="Movie";
		downloads[1]="Pdf";
		downloads[2]="image";
		
		String[] browsingHostory=new String[2];
		browsingHostory[0]="Oracle";
		browsingHostory[1]="intellij";
		
		ChromeBrowser chromebrowser=new ChromeBrowser("Instagram",AppType.ENTERTAINMENT);
		chromebrowser.setDownloads(downloads);
		chromebrowser.setBrowsingHistory(browsingHostory);

		EdgeBrowser edgebrowser=new EdgeBrowser("WhatsApp",AppType.ENTERTAINMENT);
	
		FireFoxBrowser firefoxbrowser=new FireFoxBrowser("Flipcart",AppType.SHOPPING);
		
		String[] favourites=new String[2];
		favourites[0]="Sterio hearts";
		favourites[1]="Cheap thrills";
		
		MediaPlayer mediaplayer=new MediaPlayer("Netflix",AppType.ENTERTAINMENT);
		mediaplayer.setFavourites(favourites);
		mediaplayer.showing(45,"64 and 32 bit",Os.WINDOWS);
		mediaplayer.display(1,1.1,"Martin","23-11-2023");
		
		
		System.out.println("Stratig main in ApplicationStarter");
	}
}
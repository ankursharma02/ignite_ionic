import { Component, ViewChild } from '@angular/core';
import { Nav, Platform, MenuController } from 'ionic-angular';
import { StatusBar } from '@ionic-native/status-bar';
import { SplashScreen } from '@ionic-native/splash-screen';

import { HomePage } from '../pages/home/home';
import { ListPage } from '../pages/list/list';
import { RequistionsPage } from '../pages/requistions/requistions';
import { TicketsPage } from '../pages/tickets/tickets';
import { ELogPage } from '../pages/e-log/e-log';
import { CollaborationPage } from '../pages/collaboration/collaboration';
import { MapPage } from '../pages/map/map';
import { Title } from '@angular/platform-browser';
import { SettingPage } from '../pages/setting/setting';
import { ManualPage } from '../pages/manual/manual';
import { SignPage } from '../pages/sign/sign';
import { FormControl } from '@angular/forms';
import { ValidationPage } from '../pages/validation/validation';
import { LoadticketPage } from '../pages/loadticket/loadticket';
import { TicketHandlePage, BasicPage } from '../pages/ticket-handle/ticket-handle';
 

@Component({
  templateUrl: 'app.html',
  styles:['button{float:right;}']
})
export class MyApp {
  @ViewChild(Nav) nav: Nav;

  rootPage: any = HomePage;
 t:any="Home page";
  pages: Array<{title: string, component: any}>;
  pages1: Array<{title: string, component: any}>;
  t1:any="ankur";
  todo = {}
  logForm() {
    console.log("clicked");
  }

  constructor(public platform: Platform, public statusBar: StatusBar, public splashScreen: SplashScreen,public menu: MenuController) {
    this.initializeApp();
    
    // used for an example of ngFor and navigation
    this.pages = [
      { title: 'Requistions', component: RequistionsPage },
      { title: 'Tickets', component: TicketsPage },
      { title: 'E-log', component: ELogPage },
      {title:'Map',component:MapPage},
      {title:'Collaboration',component:CollaborationPage},
      {title:'load',component:BasicPage}
    ];
    this.pages1=[
      {title:'Settings',component:SettingPage},
      {title:'manual',component:ManualPage},
      {title:'Sign out',component:SignPage},
      

    ];

  }

  initializeApp() {
    this.platform.ready().then(() => {
      // Okay, so the platform is ready and our plugins are available.
      // Here you can do any higher level native things you might need.
      this.statusBar.styleDefault();
      this.splashScreen.hide();
   //   this.nav.setRoot(ValidationPage);
   //   this.t="validation";
    });
  }

  openPage(page) {
    // Reset the content nav to have just this page
    // we wouldn't want the back button to show in this scenario
    this.nav.setRoot(page.component);
  
   this.menu.close();
   this.t=page.title;
  }
}

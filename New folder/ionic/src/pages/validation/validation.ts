import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams ,Toolbar} from 'ionic-angular';

/**
 * Generated class for the ValidationPage page.
 *
 * See https://ionicframework.com/docs/components/#navigation for more info on
 * Ionic pages and navigation.
 */

@IonicPage()
@Component({
  selector: 'page-validation',
  templateUrl: 'validation.html',
})
export class ValidationPage {

  constructor(public navCtrl: NavController, public navParams: NavParams) {
  }

  ionViewDidLoad() {
  //  x:toolbar.visible;
  //  x:false;

    console.log('ionViewDidLoad ValidationPage');
  }

}

import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { TicketHandlePage, BasicPage } from './ticket-handle';

@NgModule({
  declarations: [
    TicketHandlePage,
    BasicPage
  ],
  imports: [
    IonicPageModule.forChild(BasicPage),
  ],
})
export class TicketHandlePageModule {}

import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule } from '@angular/router';
import { ReactiveFormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { TopBarComponent } from './top-bar/top-bar.component';
import { BookListComponent } from './book-list/book-list.component';
import { HomeLoginComponent } from './home-login/home-login.component';
import { HomePassordDirective } from './home-login/home-passord.directive';
import { UserNewComponent } from './user-new/user-new.component';

@NgModule({
  imports: [
    BrowserModule,
    ReactiveFormsModule,
    RouterModule.forRoot([
      { path: '', component: UserNewComponent },
      /*{ path: '', component: HomeLoginComponent },*/
      /*{ path: '', component: BookListComponent },*/
    ])
  ],
  declarations: [
    AppComponent,
    TopBarComponent,
    BookListComponent,
    HomeLoginComponent,
    HomePassordDirective,
    UserNewComponent
  ],
  bootstrap: [ AppComponent ]
})
export class AppModule { }


/*
Copyright Google LLC. All Rights Reserved.
Use of this source code is governed by an MIT-style license that
can be found in the LICENSE file at http://angular.io/license
*/
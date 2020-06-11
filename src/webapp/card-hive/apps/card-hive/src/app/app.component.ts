import {Component} from '@angular/core';
import {TranslateService} from "@ngx-translate/core";

@Component({
  selector: 'card-hive-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.styl'],
})
export class AppComponent {
  constructor(
    public translate: TranslateService
  ) {
    translate.addLangs(['en', 'de']);
    translate.setDefaultLang('en');
  }
}

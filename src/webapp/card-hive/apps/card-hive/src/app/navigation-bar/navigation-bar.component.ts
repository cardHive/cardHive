import {Component, EventEmitter, OnInit} from '@angular/core';
import {TranslateService} from "@ngx-translate/core";

@Component({
  selector: 'card-hive-navigation-bar',
  templateUrl: './navigation-bar.component.html',
  styleUrls: ['./navigation-bar.component.styl']
})
export class NavigationBarComponent implements OnInit {
  toggleSidenav: EventEmitter<Object>;

  constructor(public translate: TranslateService) { }

  ngOnInit(): void {
  }

  switchLang(lang: string) {
    this.translate.use(lang);
  }
}

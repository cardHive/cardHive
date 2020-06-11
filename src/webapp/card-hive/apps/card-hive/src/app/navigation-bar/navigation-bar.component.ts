import {Component, EventEmitter, OnInit} from '@angular/core';

@Component({
  selector: 'card-hive-navigation-bar',
  templateUrl: './navigation-bar.component.html',
  styleUrls: ['./navigation-bar.component.styl']
})
export class NavigationBarComponent implements OnInit {
  toggleSidenav: EventEmitter<Object>;

  constructor() { }

  ngOnInit(): void {
  }

}

import {async, TestBed} from '@angular/core/testing';
import {AppComponent} from './app.component';
import {NavigationBarComponent} from "./navigation-bar/navigation-bar.component";
import {MatIconModule} from "@angular/material/icon";
import {TranslateModule} from "@ngx-translate/core";
import {MatToolbarModule} from "@angular/material/toolbar";

describe('AppComponent', () => {
  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [AppComponent, NavigationBarComponent],
      imports:[
        MatIconModule,
        MatToolbarModule,
        TranslateModule.forRoot()
      ]
    }).compileComponents();
  }));

  it('should create the app', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app).toBeTruthy();
  });
});

import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Home1 } from './home1';

describe('Home1', () => {
  let component: Home1;
  let fixture: ComponentFixture<Home1>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Home1]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Home1);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NgStyleExample } from './ng-style-example';

describe('NgStyleExample', () => {
  let component: NgStyleExample;
  let fixture: ComponentFixture<NgStyleExample>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [NgStyleExample]
    })
    .compileComponents();

    fixture = TestBed.createComponent(NgStyleExample);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NgClassExample } from './ng-class-example';

describe('NgClassExample', () => {
  let component: NgClassExample;
  let fixture: ComponentFixture<NgClassExample>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [NgClassExample]
    })
    .compileComponents();

    fixture = TestBed.createComponent(NgClassExample);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

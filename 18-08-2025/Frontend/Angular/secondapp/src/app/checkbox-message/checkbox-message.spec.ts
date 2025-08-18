import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CheckboxMessage } from './checkbox-message';

describe('CheckboxMessage', () => {
  let component: CheckboxMessage;
  let fixture: ComponentFixture<CheckboxMessage>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [CheckboxMessage]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CheckboxMessage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

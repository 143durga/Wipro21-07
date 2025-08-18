import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Inlinecomp } from './inlinecomp';

describe('Inlinecomp', () => {
  let component: Inlinecomp;
  let fixture: ComponentFixture<Inlinecomp>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Inlinecomp]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Inlinecomp);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

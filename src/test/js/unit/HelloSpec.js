describe('home', function() {
	
	beforeEach(module('hello'));
	
	it('should get id and content', inject(function($controller) {
		var scope = {};
		var ctrl = $controller('home', {$scope: scope});
		
		expect(scope.greeting.id).toBe('xxx');
		expect(scope.greeting.content).toBe('Hello World!');
	}));
});
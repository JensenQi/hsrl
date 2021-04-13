package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Chogall_38464 : Card() {
    override val id = 38464
    override val name = "古加尔"
    override val description = "<b>战吼：</b>在本回合中，你施放的下一个法术不再消耗法力值，转而消耗生命值。"
    override var cost: Int? = 7
    override var health: Int? = 7
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Wotog
    override val background = "即便这么多年过去了，古尔丹还是会吩咐古加尔去准备咖啡和甜甜圈。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e4bff60a879ea1fd7ec69c86477c0612e2125417f4a0098b669ea13d1edd41e3.png"
}

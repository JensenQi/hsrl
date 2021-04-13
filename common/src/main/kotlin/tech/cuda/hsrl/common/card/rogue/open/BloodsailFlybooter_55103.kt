package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BloodsailFlybooter_55103 : Card() {
    override val id = 55103
    override val name = "血帆飞贼"
    override val description = "<b>战吼：</b>将两张1/1的海盗牌置入你的手牌。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Pirate
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.DescentOfDragons
    override val background = "想飞上天，和海盗肩并肩。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d01cd894967b75789b28e890e72a59a2c3beaa10991f5ee79fd895c9c5b6a7bd.png"
}

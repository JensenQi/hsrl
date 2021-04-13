package tech.cuda.hsrl.common.card.priest.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class NatalieSeline_69617 : Card() {
    override val id = 69617
    override val name = "娜塔莉·塞林"
    override val description = "<b>战吼：</b>消灭一个随从并获得其生命值。"
    override var cost: Int? = 8
    override var health: Int? = 1
    override var attack: Int? = 8
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Core
    override val background = "是她发现了萨拉塔斯，黑暗帝国之刃，暗影魔法的恐怖神器。可以生吞灵魂，<i>也能</i>将灵魂细细切丝。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b068a81ecc3f5a4d9005f934f5b8de635560c1ffb6a7b9e3f3b97a7b78374503.png"
}

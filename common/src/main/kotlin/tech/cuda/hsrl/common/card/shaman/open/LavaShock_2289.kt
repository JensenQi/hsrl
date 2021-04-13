package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LavaShock_2289 : Card() {
    override val id = 2289
    override val name = "熔岩震击"
    override val description = "造成 2点伤害。 将你所有<b>过载</b>的法力水晶解锁。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Brm
    override val background = "比熔岩震击更震撼的是热巧克力震击。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e5459f981c71ecbf7d957c4b02e2746e54247aa50a260c7c4b039923c8e5a1ac.png"
}

package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class JadeShuriken_40698 : Card() {
    override val id = 40698
    override val name = "青玉飞镖"
    override val description = "造成 2点伤害。 <b>连击：</b>召唤一个 的<b>青玉魔像</b>。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Msog
    override val background = "好消息是，你可以卖了这枚飞镖来付医药费。"
    override val artist = "Izzy Hoover"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9c6b55273ead11aa79574edba63bab5b59e68c763c09292d8457a1e6380b5fea.png"
}

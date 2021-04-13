package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Blizzard_457 : Card() {
    override val id = 457
    override val name = "暴风雪"
    override val description = "对所有敌方随从造成 2点伤害，并使其<b>冻结</b>。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Legacy3
    override val background = "这不只是一张卡牌，更是一张招牌。"
    override val artist = "Chris Seaman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/591af0ff02dcd998cb4c870bb8c673355061ff7b01b9a8436431b49f49d4a7d4.png"
}

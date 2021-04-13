package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Innervate_254 : Card() {
    override val id = 254
    override val name = "激活"
    override val description = "在本回合中，获得一个 法力水晶。"
    override var cost: Int? = null
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Legacy1635
    override val background = "有些德鲁伊做梦时都回响着陌生人的喊叫声：“给我个激活！”"
    override val artist = "Doug Alexander"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c32632f4b6d744ae73ebdd043efd97b144da64e37df64a70a3c6ba5acbabbcd1.png"
}

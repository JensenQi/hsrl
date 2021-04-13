package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Sap_461 : Card() {
    override val id = 461
    override val name = "闷棍"
    override val description = "将一个敌方随从移回你对手的 手牌。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Legacy1635
    override val background = "“潜行者”的闷棍技术比“盗贼”好很多，他们不用天赋支持，就可以保证百分之百闷棍命中。"
    override val artist = "Scott Altmann"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cd655d2ef3d339bbd9c4c97b5f403b808a0b4ee8557d7236cb58d40df4165992.png"
}

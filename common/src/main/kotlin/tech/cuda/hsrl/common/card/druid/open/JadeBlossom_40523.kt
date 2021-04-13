package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class JadeBlossom_40523 : Card() {
    override val id = 40523
    override val name = "青玉绽放"
    override val description = "召唤一个 的<b>青玉魔像</b>，获得一个空的法力水晶。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Msog
    override val background = "据说在玉莲花下冥想有助于提升智慧，除非你是花粉过敏者。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2c2cad2f8820d94cc4e4d58ab88636370d60a7954d8cb117eb07e28ae565851f.png"
}

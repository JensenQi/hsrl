package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PowerWordShield_613 : Card() {
    override val id = 613
    override val name = "真言术：盾"
    override val description = "使一个随从获得+2生命值。 抽一张牌。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Legacy1635
    override val background = "额外的保护自然不错，但是这护盾阻碍了视野。"
    override val artist = "Jessica Jung"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b7976242313dbe54d3e58a07e66d599e8657634ffbbf1c736e428d605e818580.png"
}

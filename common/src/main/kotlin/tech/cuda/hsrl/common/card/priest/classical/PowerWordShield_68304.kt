package tech.cuda.hsrl.common.card.priest.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PowerWordShield_68304 : Card() {
    override val id = 68304
    override val name = "真言术：盾"
    override val description = "使一个随从获得+2生命值。 抽一张牌。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.ClassicCards
    override val background = "额外的保护自然不错，但是这护盾阻碍了视野。"
    override val artist = "Jessica Jung"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fa438de07bbc99e9b4d4a65994cdf3b8fbef91394ad636344a6e33a309be1611.png"
}

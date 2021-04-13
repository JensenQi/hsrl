package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DarkmireMoonkin_46660 : Card() {
    override val id = 46660
    override val name = "黑沼枭兽"
    override val description = "<b>法术伤害+2</b>"
    override var cost: Int? = 7
    override var health: Int? = 8
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.TheWitchwood
    override val background = "鸟以群分，月火相伴。"
    override val artist = "Grace Liu"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d193f00fb23d7766ef27377f62b5512fbca67da0c9638532dd2a98ec3d88d11f.png"
}

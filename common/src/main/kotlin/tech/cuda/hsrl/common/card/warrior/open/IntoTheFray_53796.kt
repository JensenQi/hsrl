package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class IntoTheFray_53796 : Card() {
    override val id = 53796
    override val name = "投入战斗"
    override val description = "使你手牌中的所有<b>嘲讽</b>随从牌获得+2/+2。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "“你挡着我打架的路了！”"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e6f8c97cfced4011f22184fb2be2602404ce981dcea17b2a1eb9688309175dbd.png"
}

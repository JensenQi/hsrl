package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BoomSquad_56101 : Card() {
    override val id = 56101
    override val name = "砰砰战队"
    override val description = "<b>发现</b>一张<b>跟班</b>牌，机械牌或 龙牌。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.GalakrondsAwakening
    override val background = "发现团队目标的真正含义。"
    override val artist = "Peter Stapleton"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1ff394caec2c0fc75f86adc3566ae308189ad6f98cfaad3a858543980e16c6a9.png"
}

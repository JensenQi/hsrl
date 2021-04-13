package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Doom_38770 : Card() {
    override val id = 38770
    override val name = "末日降临"
    override val description = "消灭所有随从。每消灭一个随从，便抽一张牌。"
    override var cost: Int? = 10
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Wotog
    override val background = "古往今来总有人在那里宣扬末日论，可我们现在不是还活得好好的吗。"
    override val artist = "Raymond Swanland"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/40c7f1b2eba26b149832abc05aff2c7b23dc77def65514c0643afa76a75e110e.png"
}

package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShieldedMinibot_2026 : Card() {
    override val id = 2026
    override val name = "护盾机器人"
    override val description = "<b>圣盾</b>"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Gvg
    override val background = "他愿为他的信仰牺牲，因为他的控制程序就是这么写的。"
    override val artist = "Raymond Swanland"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b8b0dcb7f590ce84fa7d64f8d09f47c0bdb4effc5b5e7f96bba5654e80e0bb1a.png"
}

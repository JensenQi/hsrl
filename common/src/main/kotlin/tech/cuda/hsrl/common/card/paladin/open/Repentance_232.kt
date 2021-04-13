package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Repentance_232 : Card() {
    override val id = 232
    override val name = "忏悔"
    override val description = "<b>奥秘：</b> 在你的对手使用一张随从牌后，使该随从的生命值降为1。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Legacy3
    override val background = "忏悔总会在湮灭前一刻到来。多么奥妙。"
    override val artist = "Gonzalo Ordonez"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7ed567a14661eff176f7010ad376b1b642a34ee08ebe4b1fa106bd1d85476736.png"
}

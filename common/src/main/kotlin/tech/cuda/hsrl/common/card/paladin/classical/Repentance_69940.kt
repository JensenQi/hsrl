package tech.cuda.hsrl.common.card.paladin.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Repentance_69940 : Card() {
    override val id = 69940
    override val name = "忏悔"
    override val description = "<b>奥秘：</b> 在你的对手使用一张随从牌后，使该随从的生命值降为1。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.ClassicCards
    override val background = "忏悔总会在湮灭前一刻到来。多么奥妙。"
    override val artist = "Gonzalo Ordonez"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/06725b74955fc96df5939cdac3f21842a28c91d86a7ab0a2b9eabe63ab2c3a1f.png"
}

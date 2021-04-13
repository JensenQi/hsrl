package tech.cuda.hsrl.common.card.paladin.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BlessedChampion_69935 : Card() {
    override val id = 69935
    override val name = "受祝福的勇士"
    override val description = "使一个随从的攻击力翻倍。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.ClassicCards
    override val background = "“攻击翻倍，快乐加倍！”"
    override val artist = "Tyler Walpole"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d58de069fd71c6a4393de46ee47b90971173c8ce8f82efe9a457b12b02570bcc.png"
}

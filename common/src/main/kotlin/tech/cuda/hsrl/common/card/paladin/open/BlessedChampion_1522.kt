package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BlessedChampion_1522 : Card() {
    override val id = 1522
    override val name = "受祝福的勇士"
    override val description = "使一个随从的攻击力翻倍。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Legacy3
    override val background = "“攻击翻倍，快乐加倍！”"
    override val artist = "Tyler Walpole"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/25f9fa33b22017581f612b0e9637c93338a09a0db616b805ff1446828db8e6b6.png"
}

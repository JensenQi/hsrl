package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DamagedStegotron_49019 : Card() {
    override val id = 49019
    override val name = "受损的机械剑龙"
    override val description = "<b>嘲讽，战吼：</b>对该随从造成6点伤害。"
    override var cost: Int? = 6
    override var health: Int? = 12
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.BoomsdayProject
    override val background = "火球术及爆炸所造成的损伤不在保修范围内。"
    override val artist = "Daria Tuzova"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bfbd58910f60b3dbc0444489412e781c8a006767935e5c6379a605851aba848a.png"
}

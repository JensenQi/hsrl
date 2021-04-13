package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TestSubject_49265 : Card() {
    override val id = 49265
    override val name = "实验体"
    override val description = "<b>亡语：</b>将你施放在该随从身上的所有法术移回你的手牌。"
    override var cost: Int? = 1
    override var health: Int? = 2
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.BoomsdayProject
    override val background = "“我感觉……真的很难受。”"
    override val artist = "Ian Ameling"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b0e141395a2d15f6f012092abd03b61aa66bb88d50986586bcc3b461bc6353af.png"
}

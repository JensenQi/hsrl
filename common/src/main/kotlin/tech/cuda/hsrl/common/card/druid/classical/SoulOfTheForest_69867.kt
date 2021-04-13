package tech.cuda.hsrl.common.card.druid.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SoulOfTheForest_69867 : Card() {
    override val id = 69867
    override val name = "丛林之魂"
    override val description = "使你的所有随从获得“<b>亡语：</b>召唤一个2/2的树人”。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.ClassicCards
    override val background = "“重新造林”计划突然听起来像是个恐怖的阴谋。"
    override val artist = "Markus Erdt"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e44ee24958cdc020f92a0670306f100000d9bc89bc65c8595a363b3a3d56fda1.png"
}

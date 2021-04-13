package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SoulOfTheForest_381 : Card() {
    override val id = 381
    override val name = "丛林之魂"
    override val description = "使你的所有随从获得“<b>亡语：</b>召唤一个2/2的树人”。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Legacy3
    override val background = "“重新造林”计划突然听起来像是个恐怖的阴谋。"
    override val artist = "Markus Erdt"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c672e031e80e67cd067d41b52c907163a845dec3241082b3991cf6fe0e6be932.png"
}

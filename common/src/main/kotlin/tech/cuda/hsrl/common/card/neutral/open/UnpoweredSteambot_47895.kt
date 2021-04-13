package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class UnpoweredSteambot_47895 : Card() {
    override val id = 47895
    override val name = "破铜烂铁机器人"
    override val description = "<b>嘲讽</b>"
    override var cost: Int? = 4
    override var health: Int? = 9
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.TheWitchwood
    override val background = "在经历平衡性调整前，它曾是超级蒸汽机器人。"
    override val artist = "Phil Saunders"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8cd157f6097356d6097340a45b9ace02c0667ff700009427972ea170e86bb251.png"
}

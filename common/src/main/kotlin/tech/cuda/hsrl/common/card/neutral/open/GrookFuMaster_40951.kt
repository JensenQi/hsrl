package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GrookFuMaster_40951 : Card() {
    override val id = 40951
    override val name = "功夫大师"
    override val description = "<b>风怒</b>"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Msog
    override val background = "想学功夫？先交学费！"
    override val artist = "Mike Azevedo"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5f9c87019d50ee187366ecdab52324d7aa88e4391b6c23bdff5135053aca3f25.png"
}

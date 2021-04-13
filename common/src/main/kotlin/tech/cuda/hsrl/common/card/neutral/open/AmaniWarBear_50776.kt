package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AmaniWarBear_50776 : Card() {
    override val id = 50776
    override val name = "阿曼尼战熊"
    override val description = "<b>突袭</b> <b>嘲讽</b>"
    override var cost: Int? = 7
    override var health: Int? = 7
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RastakhansRumble
    override val background = "当年入手难如狗，如今开包就带走。"
    override val artist = "Vlad Botos"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2d6683beb6d6d226007deb00c1cb16679298297ef86a0d8765c131627797ec21.png"
}

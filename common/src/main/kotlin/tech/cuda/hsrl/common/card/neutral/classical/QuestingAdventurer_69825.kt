package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class QuestingAdventurer_69825 : Card() {
    override val id = 69825
    override val name = "任务达人"
    override val description = "每当你使用一张牌时，便获得+1/+1。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "“高价收购致命的短枪，卖的密！”"
    override val artist = "Attila Adorjany"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f81659d04c05bb24edfd62d8ab05926b30526b5bf65e06334959e149b43e030a.png"
}

package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class QuestingAdventurer_791 : Card() {
    override val id = 791
    override val name = "任务达人"
    override val description = "每当你使用一张牌时，便获得+1/+1。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "“高价收购致命的短枪，卖的密！”"
    override val artist = "Attila Adorjany"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9a51fe5ee4b6a091e8b3366a89db59bba1647997efcadb468afcbd11ac37d518.png"
}

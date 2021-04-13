package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WailingSoul_1799 : Card() {
    override val id = 1799
    override val name = "哀嚎的灵魂"
    override val description = "<b>战吼：沉默</b>你的其他随从。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Naxx
    override val background = "只要他拿起麦克风，别人的声音都听不见了。"
    override val artist = "Glenn Rane"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/14442713c5665232a89bd7c81c48507efeaf831f0056c83734a7bc7ccb1cf6fe.png"
}

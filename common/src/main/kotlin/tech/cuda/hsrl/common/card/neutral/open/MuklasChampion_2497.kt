package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MuklasChampion_2497 : Card() {
    override val id = 2497
    override val name = "穆克拉的勇士"
    override val description = "<b>激励：</b>使你的其他随从获得+1/+1。"
    override var cost: Int? = 5
    override var health: Int? = 3
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Tgt
    override val background = "相比一般的猩猩而言，他显得稳重多了。"
    override val artist = "Andrew Hou"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ea9c177649b81a53e3c054630c95a33496529fabf44dab935d8cd5906b0cea03.png"
}

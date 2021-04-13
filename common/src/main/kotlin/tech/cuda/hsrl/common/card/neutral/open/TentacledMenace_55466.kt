package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TentacledMenace_55466 : Card() {
    override val id = 55466
    override val name = "触手恐吓者"
    override val description = "<b>战吼：</b>每个玩家抽一张牌，交换其法力值消耗。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.DescentOfDragons
    override val background = "取无面者触手备用，与两张卡牌共同翻炒。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ce8e59a95b45e3128db99e18ba5413340181014c3d229304380a76a4dcd31383.png"
}
